/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.dip.before;

/**
 *
 * @author hany
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Driver driver = new Driver();
        driver.setCar(car);
        driver.drive();
    }
}
