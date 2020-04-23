/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Main2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hh1 = new HangHoa("Sách Tiếng Anh 12", 300000, "Học giỏi anh văn");
        HangHoa hh2 = new HangHoa("Sách Toán 12", 250000, "Học giỏi toán");
        GioHang gh1 = new GioHang();
        gh1.setHinhthucTT(new ThanhToanOnline());
        gh1.them(hh1);
        gh1.them(hh2);

        
        ArrayList<HangHoa> dsHangHoa1 = gh1.getDsHangHoa();
        System.out.println("Danh sách hàng trong giỏ");
        dsHangHoa1.forEach((hangHoa) -> {
            System.out.println("Hàng hóa: " + hangHoa.thongTin());
        });
        System.out.println("Tổng tiền hàng: " + gh1.tongTienHang());
        System.out.println("Tổng tiền phải thanh toán: " + gh1.thanhToan());
        
        System.out.println("");
    }
}    
