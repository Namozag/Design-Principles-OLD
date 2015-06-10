/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.isp.after;

/**
 *
 * @author hany
 */
public class MultifunctionPrinter implements PrinterInt, OfficeWorkInt {

    @Override
    public void print(String source) {
        System.out.println("Printing [ " + source + " ]");
    }

    @Override
    public String copy(String source) {
        System.out.println("Copy [ " + source + " ]");
        return source;
    }

    @Override
    public String scan(String source) {
        System.out.println("Scan [ " + source + " ]");
        return source;
    }

    @Override
    public void sendFax(String source, String number) {
        System.out.println("Send [ " + source + " ] to [ " + number + " ]");
    }
    
}
