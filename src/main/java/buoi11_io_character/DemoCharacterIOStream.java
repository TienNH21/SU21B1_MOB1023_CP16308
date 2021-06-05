/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi11_io_character;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author tiennh
 */
public class DemoCharacterIOStream {
    public static void main(String[] args) {
        System.out.println("Bắt đầu ghi file");
        ghiFile();
        System.out.println("Kết thúc ghi file");
        System.out.println("-------------------");
        System.out.println("Bắt đầu đọc file");
        docFile();
        System.out.println("Kết thúc đọc file");
    }
    
    private static void ghiFile()
    {
        String filename = "src/main/java/buoi11_io_character/demo_char_stream.txt";
        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Trường FPT Polytechnic\n");
            writer.write("Kỳ SU2021\n");
            writer.write("Lớp CP16308\n");
            
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }
    
    private static void docFile() {
        String filename = "src/main/java/buoi11_io_character/demo_char_stream.txt";
        File file = new File(filename);
        try {
            FileReader reader = new FileReader(file);
            do {
                int i = reader.read();
                if (i == -1) {
                    break;
                }
                
                System.out.printf("%c", (char) i);
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc file thất bại");
        }
    }
}
