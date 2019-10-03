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
public class Manager extends Employee implements Serializable{
    private double salary;
    private double WPay;

    public Manager(double salary, String name, String id, String DOB) {
        super(name, id, DOB);
        this.salary = salary;
    }
    
    public Manager(){
        super();
        salary = 0.0;
        WPay = 0.0;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails()+", "+salary;
    }
    
    @Override
    public void computeWPay(){
        WPay = salary/52;
    }
    
    public double getWPay() {
        return WPay;
    }
}
