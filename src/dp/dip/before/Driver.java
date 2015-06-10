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
public class Driver {
    
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }
    
    public void drive() {
        car.move();
    }
    
}
