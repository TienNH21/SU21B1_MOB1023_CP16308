/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiennh
 */
public class DemoDataIOStream {
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
        // File trong project folder
        // String filename = "demo_data_io.txt";
        
        // File trong folder buoi10
        String filename = "src/main/java/buoi10/demo_data_io.txt";
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(filename);
            DataOutputStream dataOS = new DataOutputStream(fos);

            int i1 = 3, i2 = 9;
            char c1 = 'a', c2 = 'b', c3 = 'c';

            dataOS.writeInt(i1);
            dataOS.writeInt(i2);

            dataOS.writeChar(c1);
            dataOS.writeChar(c2);
            dataOS.writeChar(c3);

            dataOS.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Không tìm thấy file");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }

    private static void docFile() {
        String filename = "src/main/java/buoi10/demo_data_io.txt";
        try {
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream dataIS = new DataInputStream(fis);
            
            int i1 = dataIS.readInt(), i2 = dataIS.readInt();
            char c1 = dataIS.readChar(),
                c2 = dataIS.readChar(),
                c3 = dataIS.readChar();
            
            System.out.printf("%d - %d - %c - %c - %c\n", i1, i2, c1, c2, c3);
            
            System.out.println("Đọc file thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
