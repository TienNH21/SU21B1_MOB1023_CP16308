/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tiennh
 */
public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        
        myMap.put("lab_1", 10); // Thêm vào map
        myMap.put("lab_2", 9);
        myMap.put("lab_3", 8);
        myMap.put("lab_4", 9);
        myMap.put("lab_5", 10);
        myMap.put("lab_1", 1); // Cập nhật map
        
        System.out.println("myMap: " + myMap);
        
        System.out.println("KeySet: " + myMap.keySet());
        System.out.println("Values: " + myMap.values());
        
        for (String key: myMap.keySet()) {
            System.out.printf("mapMap[%s] = %d\n", key, myMap.get(key));
        }
    }
}
