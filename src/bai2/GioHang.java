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
public class GioHang {
    // att
    public IThanhToan hinhthucTT;
    public ArrayList<HangHoa> dsHangHoa = new ArrayList<>();

    public void setHinhthucTT(IThanhToan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }
    
    public ArrayList<HangHoa> getDsHangHoa() {
        return dsHangHoa;
    }
    public double thanhToan() {
        int tong = 0;
        for (int i = 0; i < dsHangHoa.size(); i++) {
            tong += dsHangHoa.get(i).getGia();
        }
        return hinhthucTT.thanhToan(tongTienHang);
    }

    public void them(HangHoa hangHoa) {
        dsHangHoa.add(hangHoa);
    }
}
