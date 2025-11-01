package threading;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Main t1 = new Main(counter);
        Main t2 = new Main(counter);
        t1.start();
        t2.start();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        try{
            t1.join();
            t2.join();
        }catch (Exception e){}

        System.out.println(counter.getCount());
    }
}
