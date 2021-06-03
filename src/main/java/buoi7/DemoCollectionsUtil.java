/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tiennh
 */
public class DemoCollectionsUtil {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        
        myList.add(4); //    0
        myList.add(1); //    1
        myList.add(10); //   2
        myList.add(5); //    3
        myList.add(6);
        myList.add(8);
        myList.add(2);
        myList.add(14);
        
        System.out.println("myList = " + myList.toString());
//        int timKiem1 = Collections.binarySearch(myList, 5);
//        System.out.println("Tìm kiếm phần tử 5: " + timKiem1);
//        
//        int timKiem2 = Collections.binarySearch(myList, 30);
//        System.out.println("Tìm kiếm phần tử 30: " + timKiem2);

        Collections.shuffle(myList);
        System.out.println("myList.shuffle() = " + myList.toString());
        
        Collections.sort(myList);
        System.out.println("myList.sort() = " + myList.toString());

        Collections.reverse(myList);
        System.out.println("myList.reverse() = " + myList.toString());
    }
}
