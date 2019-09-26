package com.hns.learn.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockImpl {


    private Lock lock = new ReentrantLock();
    private ReadWriteLock rwLock = new ReentrantReadWriteLock();

    private List<Integer> list = new ArrayList<Integer>();

    public void doReentrantLock(Thread thread) {
        lock.lock();
        System.out.println(thread.getName() + "获取锁");
        try {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        } catch (Exception e) {

        } finally {
            lock.unlock();
            System.out.println(thread.getName() + "释放锁");
        }

    }

    public void doReentrantReadLock(Thread thread) {
        rwLock.readLock().lock();
        System.out.println(thread.getName() + "获取读锁");
        try {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        } catch (Exception e) {

        } finally {
            rwLock.readLock().unlock();
            System.out.println(thread.getName() + "释放读锁");
        }

    }

    public void doReentrantWriteLock(Thread thread) {
        rwLock.writeLock().lock();
        System.out.println(thread.getName() + "获取写锁");
        try {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        } catch (Exception e) {

        } finally {
            rwLock.writeLock().unlock();
            System.out.println(thread.getName() + "释放写锁");
        }

    }


    /**
     * @param args
     */
    public static void main(String[] args) {

        final LockImpl lockImpl = new LockImpl();

        final Thread thread1 = new Thread();
        final Thread thread2 = new Thread();
        final Thread thread3 = new Thread();

        new Thread(new Runnable() {

            @Override
            public void run() {
                lockImpl.doReentrantLock(thread1);
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                lockImpl.doReentrantLock(thread2);
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                lockImpl.doReentrantLock(thread3);
            }
        }).start();


        lockImpl.doReentrantReadLock(thread1);
        lockImpl.doReentrantReadLock(thread2);
        lockImpl.doReentrantReadLock(thread3);

        lockImpl.doReentrantWriteLock(thread1);
        lockImpl.doReentrantWriteLock(thread2);
        lockImpl.doReentrantWriteLock(thread3);
    }

}
