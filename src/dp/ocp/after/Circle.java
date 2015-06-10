/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.ocp.after;

/**
 *
 * @author hany
 */
public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void draw() {
        System.out.println("I'm a circle whose radius = " + radius);
    }
    
}
