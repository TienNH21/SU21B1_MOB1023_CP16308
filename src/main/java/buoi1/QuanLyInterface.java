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
public interface QuanLyInterface {
    public void them(Nguoi nguoi);
    public Nguoi xoa(int viTri);
    public List<Nguoi> xuatDanhSach();
    public void taoDoiTuongAo();
    public void setDanhSach(ArrayList<Nguoi> list);
}
