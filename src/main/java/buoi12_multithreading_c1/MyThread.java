/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi12_multithreading_c1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiennh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            if (i == 50) {
                System.out.println("Kết thúc chương trình");
                break;
            }
        }
    }
}
