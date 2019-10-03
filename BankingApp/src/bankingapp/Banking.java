/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

/**
 *
 * @author x16318711
 */
public class Banking {
    private int accnum;
    private double bal;
    private String accnam;
    private String type;
    
    public Banking(){
        accnum = 0;
        bal = 0.0;
        accnam = "";
        type = "";
    }

    public Banking(int accnum, double bal, String accnam, String type) {
        this.accnum = accnum;
        this.bal = bal;
        this.accnam = accnam;
        this.type = type;
    }

    public int getAccnum() {
        return accnum;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public String getAccnam() {
        return accnam;
    }

    public void setAccnam(String accnam) {
        this.accnam = accnam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   
}
