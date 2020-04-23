/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author ASUS
 */
public class Main3 {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat fodate = new SimpleDateFormat("dd/MM/yyyy");
        QLSV qLy = new QLSV();
        SinhVien sv1 = new SinhVien("Huỳnh AB", fodate.parse("7/8/1999"), 9);
        SinhVien sv2 = new SinhVien("Huỳnh BC", fodate.parse("8/8/1999"), 8);

        //them sinh vien
        qLy.them(sv1);
        qLy.them(sv2);

        
        //sap xep theo ten
        qLy.setSoSanh(new SoSanhTheoTen());
        qLy.sapXep();
        System.out.println("\n" + "Danh sách SV sắp xếp theo tên :");
        qLy.inDS();

        //sap xep theo diem
        qLy.setSoSanh(new SoSanhTheoDiem());
        qLy.sapXep();
        System.out.println("\n" + "Danh sách SV sắp xếp theo điểm : ");
        qLy.inDS();
    }
}
