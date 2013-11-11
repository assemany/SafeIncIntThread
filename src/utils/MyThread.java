/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Assemany
 */
public class MyThread extends Thread {
    
    //An AtomicInteger is used in applications such as atomically incremented 
    //counters, and cannot be used as a replacement for an Integer.
    private static AtomicInteger safeInteger = new AtomicInteger(0);
    
    //Safe way to increment the integer
    @Override
    public void run() {
        System.out.println("safeInteger: " + safeInteger.incrementAndGet());
  }
}