/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clocks;

/**
 *
 * @author johan
 */
public class Data {
    private String time;
    private String city;
    private int adjustment;
    
    public Data(String time, String city, int adjustment) {
        this.time = time;
        this.city = city;
        this.adjustment = adjustment;
    }
    
     public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
       this.time = time;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public int getAdjustment() {
        return this.adjustment;
    }
    
    public void setAdjustment(int adjustment) {
        this.adjustment = adjustment;
    }
}
