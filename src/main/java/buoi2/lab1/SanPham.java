/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.lab1;

/**
 *
 * @author tiennh
 */
// Tất cả các class đều là class con của class Object
public class SanPham {
    private String tenSP;
    private int donGia;

    public SanPham() {
    }

    public SanPham(String tenSP, int donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    public double getThueNhapKhau()
    {
        return this.donGia * 0.1;
    }

    @Override
    public String toString()
    {
        return this.tenSP + " - " + this.donGia + " - " + this.getThueNhapKhau();
    }
}
