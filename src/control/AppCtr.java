/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import utils.MyThread;

/**
 *
 * @author Assemany
 */
public class AppCtr {
       
    public static void main (String args[])
    {
        MyThread thread = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        
        thread.start();
        thread2.start();
        thread3.start();
    }
}