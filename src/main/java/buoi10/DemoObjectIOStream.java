/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10;

import buoi1.SinhVien;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author tiennh
 */
public class DemoObjectIOStream {
    public static void main(String[] args) {
        System.out.println("Bắt đầu ghi file");
        ghiFile();
        System.out.println("Kết thúc ghi file");
        System.out.println("-----------------");
        System.out.println("Bắt đầu đọc file");
        docFile();
        System.out.println("Kết thúc đọc file");
    }

    private static void ghiFile() {
        String filename = "src/main/java/buoi10/demo_object_io.txt";
        
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            SinhVienPoly sv1 = new SinhVienPoly("Ng Van A", "PH21233"),
                sv2 = new SinhVienPoly("Tran Thi B", "PK21345");
            
            oos.writeObject(sv1);
            oos.writeObject(sv2);
            
            oos.close();
            fos.close();
            System.out.println("Ghi file thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }

    private static void docFile() {
        String filename = "src/main/java/buoi10/demo_object_io.txt";
        
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            SinhVienPoly sv1 = (SinhVienPoly) ois.readObject();
            SinhVienPoly sv2 = (SinhVienPoly) ois.readObject();
            
            System.out.printf("%s - %s\n", sv1.getTen(), sv1.getMaSV());
            System.out.printf("%s - %s\n", sv2.getTen(), sv2.getMaSV());
            
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
