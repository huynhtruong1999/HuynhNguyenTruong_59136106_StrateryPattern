/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author ASUS
 */
public class HangHoa {
    // att
    public String tenHH;
    public int gia;
    public String moTa;

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    public int getGia() {
        return gia;
    }

    public String thongTin() {
        return "Tên hàng hóa: " + this.tenHH + "\n gia: " + this.gia + "\n mo ta: " + this.moTa;
    }
}
