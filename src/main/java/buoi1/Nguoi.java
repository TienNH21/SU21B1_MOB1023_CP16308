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
public class Nguoi {
    // Thuộc tính
    private String hoTen;
    private int gioiTinh;
    private String queQuan;
    private String diaChi;

    public Nguoi() {
        // Hàm khởi tạo không tham số
        // Khi sử dụng từ khóa new -> gọi đến hàm khởi tạo -> tạo ra 1 đối tượng mới
    }

    public Nguoi(String hoTen, int gioiTinh, String queQuan, String diaChi) {
        // Hàm khởi tạo có tham số
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
    }

    // Phương thức: getter/setter
    public String getHoTen() {
        return hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void xuatThongTin()
    {
        System.out.printf("%s - %d - %s - %s\n", this.hoTen, this.gioiTinh, this.diaChi, this.queQuan);
    }
}
