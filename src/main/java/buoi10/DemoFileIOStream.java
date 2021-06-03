/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi10;

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
public class DemoFileIOStream {
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
        /*
         * Source Packages -> src/main/java
         * Để đưa file vào package buổi 10 -> src/main/java/buoi10/demo_file_io.txt
         *
         */
        String filename = "src/main/java/buoi10/demo_file_io.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            String text = "Hello Poly";

            byte[] b = text.getBytes();
            
            fos.write(b);
            fos.close();
            System.out.println("Ghi file thành công");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    private static void docFile() {
        String filename = "src/main/java/buoi10/demo_file_io.txt";
        try {
            FileInputStream fis = new FileInputStream(filename);
            
            while (true) {
                int i = fis.read();
                
                if (i == -1) {
                    break;
                }
                
                System.out.printf("%c", (char) i);
            }
            System.out.println("\nĐọc file thành công");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Không tìm thấy file");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
        
    }
}
