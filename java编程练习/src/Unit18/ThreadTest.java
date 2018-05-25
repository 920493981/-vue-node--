package Unit18;

public class ThreadTest extends Thread{
    private int count = 10;
    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        for (int i = 0; i < 2; i++) {
            Thread t1 = new Inc(test);
            t1.start();
            Thread t2 = new Dec(test);
            t2.start();
        }
    }

    public synchronized void inc() {
        count++;
        System.out.println(Thread.currentThread().getName() + " inc: "+ count);
    }
    public synchronized void dec() {
        count--;
        System.out.println(Thread.currentThread().getName() + " dec: "+ count);

    }
}
//增线程
class Inc extends Thread {
    private ThreadTest t1;
    Inc(ThreadTest t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            t1.inc();//增函数
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//减线程
class Dec extends Thread {
    private ThreadTest t1;
    Dec(ThreadTest t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            t1.dec(); //减函数
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}