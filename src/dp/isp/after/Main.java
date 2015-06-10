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
public class Main {
    public static void main(String[] args) {
        PrinterInt printer = new MultifunctionPrinter();
        printer.print("TEST PAGE");
        
        
        OfficeWorkInt officeWork = new MultifunctionPrinter();
        officeWork.sendFax("Welcome", "012345");
        
    }
}
