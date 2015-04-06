/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clocks;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author johan
 */
public class Clock implements Runnable {
    private Thread thread;
    private String threadName;
    private int adjustment;
  
    Clock(String name, int adjustment) {
        this.adjustment = adjustment;
        this.threadName = name;
    }
    
    public void run() {
        System.out.println("the date and clock in " + threadName + " is: " + getTimestamp());
    }
    
    public void start() {
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
    
    public String getTimestamp() {
        java.text.SimpleDateFormat dateTime = new java.text.SimpleDateFormat("yyyy.MM.dd : HH.mm.ss");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MINUTE, adjustment);
        java.util.Date date = c.getTime();
        return dateTime.format(date);
    }
    
}
