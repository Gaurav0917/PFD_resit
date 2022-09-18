public class week7 extends Thread {

     @Override
     public void run() {
          for (int i = 0; i <= 10; i++) {
               System.out.println("2 x "+i +" = "+2*i);
          }

     }

     public static void main(String[] args) {
          week7 t = new week7();
          t.start();
          for (int i = 0; i <= 10; i++) {
               System.out.println("2 x "+i +" = "+2*i);
          }


     }
}