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
public class SinhVien extends Nguoi {
    /*
     * Tất cả những thuộc tính & phương thức của class Nguoi mà có đặc tả truy xuất != private 
     * thì class SinhVien đều được truy cập
     */
    
    private String maSV;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String chuyenNganh, String hoTen, int gioiTinh, String queQuan, String diaChi) {
        super(hoTen, gioiTinh, queQuan, diaChi);
        /*
         * super() dùng để gọi tới phương thức của lớp cha
         */
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.printf("%s - %s\n", this.maSV, this.chuyenNganh);
    }
    
    public void xuatThongTin(int tuoi)
    {
        System.out.println(tuoi);
    }
    
    public void xuatThongTin(String hocLai)
    {
        System.out.println(hocLai);
    }
    
    public void xuatThongTin(int tuoiBo, int tuoiMe)
    {
        System.out.println(tuoiBo);
        System.out.println(tuoiMe);
    }
}
