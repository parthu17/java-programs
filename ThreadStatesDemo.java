class MyThread extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Thread is running....");
            Thread.sleep(2000);
            System.out.println("Thread completed execution");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ThreadStatesDemo{
    public static void main(String args[]) throws InterruptedException{
        MyThread t = new MyThread();
        System.out.println("State after creation "+ t.getState());
        t.start();
        System.out.println("State after start "+ t.getState());
        Thread.sleep(500);
        System.out.println("Sleep state "+ t.getState());
        t.join();
        System.out.println("State after completion "+ t.getState());
    }
}