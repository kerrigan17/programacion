package tema7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PilotsCRUD {

    private static final String URL = "jdbc:postgresql://awsdb.cfji6tbhtnnv.us-east-1.rds.amazonaws.com:5432/f12006";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Lucy2024";

    public static void createPilot(Piloto piloto) {
        String sql = "INSERT INTO drivers (id, name, code) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, piloto.getId());
            pstmt.setString(2, piloto.getNombre());
            pstmt.setString(3, piloto.getCodigo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Piloto readPilot(int id) {
        String sql = "SELECT * FROM drivers WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Piloto(rs.getInt("id"), rs.getString("name"), rs.getString("code"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static List<Piloto> readPilots() {
        String sql = "SELECT * FROM drivers";
        List<Piloto> pilots = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                pilots.add(new Piloto(rs.getInt("id"), rs.getString("name"), rs.getString("code")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pilots;
    }

    public static void updatePilot(Piloto piloto) {
        String sql = "UPDATE drivers SET name = ?, code = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, piloto.getNombre());
            pstmt.setString(2, piloto.getCodigo());
            pstmt.setInt(3, piloto.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deletePilot(Piloto piloto) {
        String sql = "DELETE FROM drivers WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, piloto.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showPilotClassification() {
        String sql = "SELECT name, points FROM drivers ORDER BY points DESC";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name") + ", Points: " + rs.getInt("points"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showBuildersClassification() {
        String sql = "SELECT team, points FROM constructors ORDER BY points DESC";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("Team: " + rs.getString("team") + ", Points: " + rs.getInt("points"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertPilotAndTeam() {
        String insertTeamSQL = "INSERT INTO teams (id, name) VALUES (?, ?) ON CONFLICT (id) DO NOTHING RETURNING id;";
        String insertPilotSQL = "INSERT INTO drivers (id, name, code, team_id) VALUES (?, ?, ?, ?);";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            conn.setAutoCommit(false); 


            try (PreparedStatement pstmt = conn.prepareStatement(insertTeamSQL)) {
                pstmt.setInt(1, 1);  
                pstmt.setString(2, "Seat F1");
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    int teamId = rs.getInt(1);
                    try (PreparedStatement pstmtPilot = conn.prepareStatement(insertPilotSQL)) {
                        pstmtPilot.setInt(1, 10);
                        pstmtPilot.setString(2, "Carlos Sainz");
                        pstmtPilot.setString(3, "SAI");
                        pstmtPilot.setInt(4, teamId);
                        pstmtPilot.executeUpdate();
                    }

                    try (PreparedStatement pstmtPilot = conn.prepareStatement(insertPilotSQL)) {
                        pstmtPilot.setInt(1, 11);
                        pstmtPilot.setString(2, "Manuel Alomá");
                        pstmtPilot.setString(3, "ALO");
                        pstmtPilot.setInt(4, teamId);
                        pstmtPilot.executeUpdate();
                    }
                }
            }

            conn.commit(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getResultsByDriver(String driverCode) {
        String sql = "SELECT * FROM get_results_by_driver(?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, driverCode);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("Race: " + rs.getString("race") + ", Position: " + rs.getInt("position"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getDriversStandings() {
        String sql = "SELECT * FROM get_drivers_standings()";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("Driver: " + rs.getString("driver") + ", Points: " + rs.getInt("points"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
