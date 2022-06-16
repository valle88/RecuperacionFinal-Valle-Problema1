public class Main {

    public static void main(String[] args) {
        final int genera =4;
        final  int conte=3;





        for (int i = 0; i < genera; i++) {
            BuqueCarga barco= new BuqueCarga();
            for (int j = 0; j <conte ; j++) {
                Container container = new Container(ShipUtils.generarTipoCarga(),2);
                System.out.println(barco);
                System.out.println(container);
            }
        }





    }
}
