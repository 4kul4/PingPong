package com.company;
import java.util.concurrent.locks.Lock;

public class PingPong extends Thread {

    private final String message;
    private final Lock lock;

    public PingPong(Lock lock, String message) {
        this.lock = lock;
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                sleep(100);
            } catch (InterruptedException a) {
                a.printStackTrace();
            }
            System.out.println(message);
            lock.unlock();
        }
    }
}