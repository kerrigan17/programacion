
import java.util.Scanner;

public class productos {
    static Scanner in = new Scanner(System.in);

    public static void showMenu(){
        System.out.println("LISTA DE PRODUCTOS SIN IVA");
        System.out.println("Exclusivos:");
        System.out.println("1.Tablet samsung 12 pulgada: 160");        
        System.out.println("2.Tv samsung 40 pulgadas: 250");
        System.out.println("3.Lujosos:");
        System.out.println("Desodorante rexona:1.80");        
        System.out.println("3.Compresas sin alas: 2.00");
        System.out.println("4.Económicos:");
        System.out.println("Papel de cocina XXL: 1.80");        
        System.out.println("6.Pastillas de lavavajillas 24uds: 4.10");
        System.out.println("Accesibles:");
        System.out.println("8.Aceite de oliva: 1.90");        
        System.out.println("Macarrones 1kg: 0.80");
        System.out.println("---------TU LISTA--------");
        System.out.println("Numero de productos de tu lista:");

    }
        static public void main(String[] args){
            showMenu();
            int nProduct= in.nextInt();
            int [] products = new int[nProduct];
            double price = 0;
            double newprice = 0;
            double totalprice =0;
            for(int i = 1; i<=nProduct; i++){
                System.out.print("Producto " + i + ":");
                products[i]=in.nextInt();
                if(products[i]>0){
                    switch(products[i]){
                        case 1:
                            price=160;
                            newprice = price * 1.30;                            
                            break;
                        case 2:
                            price=250;
                            newprice = price * 1.30;                            
                            break;
                        case 3:
                            price=1.80;
                            newprice = price * 1.20;                            
                            break;
                        case 4:
                            price=2;
                            newprice = price * 1.20;                            
                            break;
                        case 5:
                            price=1.80;
                            newprice = price * 1.10;                            
                            break;
                        case 6:
                            price=4.10;
                            newprice = price * 1.10;                            
                            break;
                        case 7:
                            price=1.90;
                            newprice = price * 1.05;                            
                            break;
                        case 8:
                            price=0.80;
                            newprice = price * 1.05;                            
                            break;
                    }
                }
                totalprice += newprice;
                System.out.println(totalprice);
            }
            System.out.println("El total mas IVA es " + totalprice);
    }
}
