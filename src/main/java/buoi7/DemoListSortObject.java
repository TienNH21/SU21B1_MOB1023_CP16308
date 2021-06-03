/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

import buoi1.Nguoi;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tiennh
 */
public class DemoListSortObject {
    public static void main(String[] args) {
        List<Nguoi> myList = new ArrayList<>();
        
        Nguoi nguoi1 = new Nguoi("C", 1, "HN", "HN"),
            nguoi2 = new Nguoi("A", 0, "ND", "ND"),
            nguoi3 = new Nguoi("B", 1, "NB", "NB");
        
        myList.add(nguoi1);
        myList.add(nguoi2);
        myList.add(nguoi3);
        
        Comparator sapXepTheoTen = new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi nguoi1, Nguoi nguoi2) {
                return nguoi1.getHoTen().compareTo(nguoi2.getHoTen());
            }
        };
        
        Collections.sort(myList, sapXepTheoTen);
        
        for (Nguoi nguoi : myList) {
            System.out.println(nguoi.getHoTen());
        }
    }
}
