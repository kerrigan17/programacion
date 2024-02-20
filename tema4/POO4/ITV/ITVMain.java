package ITV;


class ITVMain {
    public static void main(String[] args) throws InterruptedException {
        ITV itv = new ITV();

        for (int i = 0; i < 10; i++) {
            itv.llegadaVehiculo();
            Thread.sleep(1000); 
        }

        itv.mostrarRegistro();
    }
    
}
