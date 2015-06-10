/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.lsp.after;

/**
 *
 * @author hany
 */
public class Square implements Shape {

    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getArea() {
        return length * length;
    }
    
}
