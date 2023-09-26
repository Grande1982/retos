/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.HashMap;

/**
 *
 * @author cgrande
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        HashMap<String, String> map = new HashMap<>();
        
        map.put("apple", "white");
        map.put("andoid", "green");
        map.put("ferrari", "red");
        
        for (String mapa : map){
            
        }
        
        System.out.println(map.get("apple1"));   // white
    }

}
