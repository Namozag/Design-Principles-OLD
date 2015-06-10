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
public class EmployeeManager {
    
    public Employee getEmployee(int id) {
        // do some DB operations
        return new Employee("Hafez Hamdy", 1500d);
    }
    
    public void printPaySlip(Employee employee) {
        System.out.println("Payslip");
        System.out.println("Name: " + employee.getName());
        System.out.println("Total: " + employee.getSalary());
    }
}
