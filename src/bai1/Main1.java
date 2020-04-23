/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author ASUS
 */
public class Main1 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context context = new Context();
        context.setTinhToan(new Cong());
        System.out.println(context.tinh(75, 12));
        context.setTinhToan(new Tru());
        System.out.println(context.tinh(54, 78));
    }
}
