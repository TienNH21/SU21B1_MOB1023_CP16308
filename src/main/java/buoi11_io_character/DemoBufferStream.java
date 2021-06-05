/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11_io_character;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author tiennh
 */
public class DemoBufferStream {
    public static void main(String[] args) {
        System.out.println("Bắt đầu ghi file");
        ghiFile();
        System.out.println("Kết thúc ghi file");
        System.out.println("-------------------");
        System.out.println("Bắt đầu đọc file");
        docFile();
        System.out.println("Kết thúc đọc file");
    }
    
    private static void ghiFile() {
        String filename = "src/main/java/buoi11_io_character/demo_buffer_io.txt";
        try {
            FileWriter fWriter = new FileWriter(filename);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            
            bWriter.write("Trường FPT Polytechnic\n");
            bWriter.write("Kỳ SU2021\n");
            bWriter.write("Lớp CP16308\n");
            
            bWriter.flush();
            fWriter.close();
            bWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }

    private static void docFile() {
        String filename = "src/main/java/buoi11_io_character/demo_buffer_io.txt";
        try {
            FileReader fReader = new FileReader(filename);
            BufferedReader bReader = new BufferedReader(fReader);
            String txtLine;
            do {
                txtLine = bReader.readLine();

                if (txtLine == null) {
                    break;
                }

                System.out.println(txtLine);
            } while (true);
            
            fReader.close();
            bReader.close();
        } catch (Exception e) {
            System.out.println("Đọc file thất bại");
            e.printStackTrace();
        }
    }
}
