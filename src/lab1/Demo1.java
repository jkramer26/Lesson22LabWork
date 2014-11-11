package lab1;

import java.util.*;

/**
 *
 * @author jkramer26
 */
public class Demo1 {
    
    public static void main(String[] args) { 
        //old fashioned technique 
        //this was prior to jdk 5
//        int x = 5; 
//        Integer i1 = new Integer(5);
//        
//        List shoppingList = new ArrayList();
//        shoppingList.add("Beer");
//        shoppingList.add("Chips");
//        shoppingList.add("Beer");
//        
//        //need to cast objects to strings
//        String s = (String)shoppingList.get(1);
//        
//        for(int i = 0; i < shoppingList.size(); i++) {
//            String item = (String)shoppingList.get(i);
//            System.out.println(item);
//        }
        
        
        //modern technique  <-- only work in jdk5 or newer
        //this is used cause jdk5 introduced generics and eliminates need for cast
        //one way to declare a list. 
        List<String> shoppingList = new ArrayList<>();
        
        shoppingList.add("Beer");
        shoppingList.add("Chips");
        shoppingList.add("Whiskey");
        shoppingList.add("Pretzels");
        shoppingList.add("Beer");
        
        String s = shoppingList.get(0);
        
        
        //functional operation?
        for (String item : shoppingList) {
            //String sh = s2;
            //System.out.println(item);
        }
        
        //methods from list interface in java api
        System.out.println(shoppingList.subList(0, 2));
        System.out.println(shoppingList.lastIndexOf("Beer"));
        
    }   
}
