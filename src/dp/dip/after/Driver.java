/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.dip.after;

/**
 *
 * @author hany
 */
public class Driver {
    
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void drive() {
        vehicle.move();
    }
    
}
