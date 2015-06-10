/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.lsp.before;

/**
 *
 * @author hany
 */
public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }
    
    @Override
    public void setHeight(int height) {
        super.width = height;
        super.height = height;
    }
    
}
