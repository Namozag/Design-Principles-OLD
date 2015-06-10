/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.srp.before;

/**
 *
 * @author hany
 */
public class Main {
    public static void main(String[] args) {
        
        EmployeeManager em = new EmployeeManager();
        
        Employee employee = em.getEmployee(1);
        em.printPaySlip(employee);
    }
}
