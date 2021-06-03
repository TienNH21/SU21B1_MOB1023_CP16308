package buoi9;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiennh
 */
public class DemoException {
    public static void main(String[] args) {
        String[] arr = new String[] { "1", "2", null, "abc", "3" };
        
        for (int i = 0; i < 6; i++) {
            int ketQua = parse(arr[i]);
            System.out.println(i + "---" + ketQua);
        }
    }
    
    private static int parse(String input) throws NumberFormatException
    {
        int result = 0;
        
        try {
            result = Integer.parseInt(input);
        } catch(NumberFormatException e) {
            e.printStackTrace();

            throw e;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-------------------");
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("-------------------");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        return result;
    }
}
