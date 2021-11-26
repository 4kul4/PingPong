package com.company;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock(true);

        PingPong first = new PingPong(lock, "ping");
        PingPong second = new PingPong(lock, "pong");

        first.start();
        second.start();
    }

}