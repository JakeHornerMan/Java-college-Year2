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
public abstract class Employee implements Serializable{
    protected String name; 
    protected String id;
    protected String DOB;
    //Default Constructor
    public Employee(){
        name = " ";
        id = " ";
        DOB = " ";
    }
    
    //Overloaded Constructor
    public Employee(String name, String id, String DOB) {
        this.name = name;
        this.id = id;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDOB() {
        return DOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    public String printDetails(){
        return "Employee Details: "+id+", "+name+", "+DOB;
    }
    
    public abstract void computeWPay();
}
