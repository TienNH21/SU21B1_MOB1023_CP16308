/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10;

import java.io.Serializable;

/**
 *
 * @author tiennh
 */
public class SinhVienPoly implements Serializable {
    private String ten;
    private String maSV;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String ten, String maSV) {
        this.ten = ten;
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
    
}
