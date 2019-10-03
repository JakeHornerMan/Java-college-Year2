/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.io.Serializable;

/**
 *
     * @author x16312261
 */
public class FloorStaff extends Employee implements Serializable{
    private double rate;
    private double hours;
    private double WPay;

    public FloorStaff(double rate, double hours, String name, String id, String DOB) {
        super(name, id, DOB);
        this.rate = rate;
        this.hours = hours;
    }
    
    public FloorStaff(){
        super();
        rate = 0.0;
        hours = 0.0;
        WPay = 0.0;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    
    
    public void setHours(double hours) {
        this.hours = hours;
    }
    
    
    
    @Override
    public String printDetails(){
        return super.printDetails()+", "+rate+", "+hours;
    }
    
    @Override
    public void computeWPay(){
        WPay = rate*hours;
    }
    
    public double getWPay() {
        return WPay;
    }
}
