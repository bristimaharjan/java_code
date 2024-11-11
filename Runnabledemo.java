import java.io.IOException;

class OddThread implements Runnable {
    public void run() {
        int i;
        for (i = 0; i < 5; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd number" +( i+1));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}




    class EvenThread extends Thread{
    public void run(){
        int i;
        for(i=0;i<5;i++){
            if(i%2==0){
                System.out.println("Even number"+(i+1));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
public class Runnabledemo {
    public static void main(String[] args) throws IOException {
        OddThread thread1 = new OddThread();
        Thread oddthread = new Thread(thread1);
        oddthread.start();
        EvenThread myThread = new EvenThread();
        myThread.start();
    }
}