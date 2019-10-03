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
public class Current extends Banking{
    private String atmc;
    
    public Current(){
        super();
        atmc = "";
    }
    
    public Current(String atmc, int accnum, double bal, String accnam, String type) {
        super(accnum, bal, accnam, type);
        this.atmc = atmc;
    }

    public String getAtmc() {
        return atmc;
    }

    public void setAtmc(String atmc) {
        this.atmc = atmc;
    }
    
}
