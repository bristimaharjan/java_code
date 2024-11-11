package Bristi;
class Hello{
   synchronized public void sayhello(String msg){
        System.out.println(msg);
    }


}
class Thread1 extends Thread{
    Hello h;
    Thread1(Hello h){
        this.h=h;
    }
    public void run(){
        h.sayhello("form thread 1");
    }
}
class Thread2 extends Thread{
    Hello h;
    Thread2(Hello h){
        this.h=h;
    }
    public void run(){
        h.sayhello("form thread 2");
    }
}


public class MySharedResources {
    public static void main(String[] args) {
        Hello h =new Hello();
        Thread th1=new Thread(String.valueOf(h));
        Thread th2=new Thread(String.valueOf(h));
        th1.start();
        th2.start();



    }
}
