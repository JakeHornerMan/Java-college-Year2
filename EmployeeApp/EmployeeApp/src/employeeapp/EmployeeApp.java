/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author x16312261
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmployeeGUI myGUI = new EmployeeGUI();
        myGUI.setVisible(true);
        
        
        Manager m1 = new Manager(42000,"John","6789","25/12/79");
        System.out.println(m1.printDetails());
        m1.computeWPay();
        System.out.println("Weekly Pay: "+m1.getSalary());
        
        FloorStaff f1 = new FloorStaff(30,50, "Jo","1234","13/4/89");
        System.out.println(f1.printDetails());
        f1.computeWPay();
        System.out.println("Weekly Pay: "+f1.getWPay());
    }
    
}
