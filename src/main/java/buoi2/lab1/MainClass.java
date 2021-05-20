/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.lab1;

import java.util.Scanner;

/**
 *
 * @author tiennh
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner _sc = new Scanner( System.in );
        while (true) {
            System.out.println("----------------------");
            System.out.println("Nhập:");
            System.out.println("\t1. Thêm sản phẩm");
            System.out.println("\t2. Xóa sản phẩm");
            System.out.println("\t3. Xuất danh sách sản phẩm");
            System.out.println("\t0. Dừng chương trình");
            System.out.println("----------------------");
            
            int chon = _sc.nextInt();
            
            if ( chon == 0 ) {
                break;
            }
            
            switch (chon) {
                case 1:
                    // Nhập thông tin sp & gọi hàm thêm SP của lớp QL
                    break;
                   
                case 2: 
                    break;
                    
                case 3: 
                    break;
                   
                default: 
                    break;
            }
        }
    }
}
