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
public interface MultiFunctionPrinterInt {
    void print(String source);
    String copy(String source);
    String scan(String source);
    void sendFax(String text, String number);
}
