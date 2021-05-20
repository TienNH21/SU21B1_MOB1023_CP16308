/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

/**
 *
 * @author tiennh
 */
public class MainClass {
    public static void main(String[] args) {
        // Ép kiểu ngầm định >< Ép kiểu tường minh
        SinhVien sv = new SinhVien(
            "PH12345",
            "UDPM",
            "Nguyen Van A",
            1,
            "Ha Noi",
            "Ha Noi"
        );

        QuanLyDanhSach qlds = new QuanLyDanhSach();
        qlds.them(sv);
        sv.xuatThongTin();
        sv.xuatThongTin(21);
        sv.xuatThongTin("Học lại lần 2");
    }
}
