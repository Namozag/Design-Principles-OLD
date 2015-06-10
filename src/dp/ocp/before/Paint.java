/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.ocp.before;

/**
 *
 * @author hany
 */
public class Paint {
    public void draw(Shape shape) {
        if(shape instanceof Circle) {
            drawCircle( (Circle) shape );
        } else if(shape instanceof Rectangle) {
            drawRectangle( (Rectangle) shape );
        }
    }
    
    private void drawCircle(Circle circle) {
        System.out.println("I'm a circle whose radius = "
                + circle.getRadius());
    }
    
    private void drawRectangle(Rectangle rectangle) {
        System.out.println("I'm a rectangle whose width = "
                + rectangle.getWidth() + " And height = "
                + rectangle .getHeight());
    }
    
}
