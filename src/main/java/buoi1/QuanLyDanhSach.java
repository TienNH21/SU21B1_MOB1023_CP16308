/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiennh
 */
public class QuanLyDanhSach implements QuanLyInterface {
    private ArrayList<Nguoi> danhSach;
    
    public QuanLyDanhSach() {
        this.danhSach = new ArrayList<Nguoi>();
    }
    
    @Override
    public void them(Nguoi nguoi)
    {
        this.danhSach.add(nguoi);
    }

    @Override
    public List<Nguoi> xuatDanhSach()
    {
        return this.danhSach;
    }

    @Override
    public Nguoi xoa(int viTri) {
        return this.danhSach.remove(viTri);
    }

    @Override
    public void taoDoiTuongAo() {
        SinhVien sv1 = new SinhVien("PH12345", "UDPM", "Ng Van A", 1, "HN", "HN");
        SinhVien sv2 = new SinhVien("PH12346", "TKTW", "Ng Van B", 1, "HN", "HN");
        SinhVien sv3 = new SinhVien("PH12347", "LTMT", "Tr Thi C", 0, "HN", "HN");
        
        this.danhSach.add(sv1);
        this.danhSach.add(sv2);
        this.danhSach.add(sv3);
    }

    @Override
    public void setDanhSach(ArrayList<Nguoi> list) {
        this.danhSach = list;
    }
}
