package threading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    private void outer(){
        lock.lock();
        try{
            System.out.println("Inside outer");
            inner();
        }finally {
            lock.unlock();
        }
    }

    private void inner(){
        lock.lock();
        try{
            System.out.println("Inside inner");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample reentrantExample = new ReentrantExample();
        reentrantExample.outer();
    }
}
