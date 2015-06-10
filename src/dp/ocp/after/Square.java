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
public class Square extends Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    
    public void draw() {
        System.out.println("I'm a Square whose length = " + length);
    }
}
