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
public class Savings extends Banking{
    private String irate;
    
    public Savings(){
        super();
        irate ="";
    }

    public Savings(String irate, int accnum, double bal, String accnam, String type) {
        super(accnum, bal, accnam, type);
        this.irate = irate;
    }

    public String getIrate() {
        return irate;
    }

    public void setIrate(String irate) {
        this.irate = irate;
    }
    
}
