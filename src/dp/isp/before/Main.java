/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.isp.before;

/**
 *
 * @author hany
 */
public class Main {
    public static void main(String[] args) {
        MultiFunctionPrinterInt printer = new MultifunctionPrinter();
        
        printer.print("TEST PAGE");
        printer.sendFax("what is this", "what is this");
        
    }
}
