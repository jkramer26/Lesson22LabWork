package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Startup {

    public static void main(String[] args) {
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
        
        ///////////////////Sets
//        Employee e1 = new Employee("Jones", "Sally", "333-33-3333");
//        Employee e2 = new Employee("Jones", "Sally", "333-33-3333");
//        
//        //equals uses memory location to see if objects are equal 
//        //we should override equal method so we determine if they are truly equal
//        //now with overridden methods the employees will show to be equal
//        if(e1.equals(e2)) {
//            System.out.println("Employees are equal");
//        } else {
//            System.out.println("Not equal");
//        }
//        
//        //adding employees to set. see lecture 20 notes for more info on sets
//        Set<Employee> employees = new HashSet<>();
//        employees.add(e1);
//        employees.add(e2);
//        
//        //will only display more than one last name if there are not duplicates 
//        for(Employee e: employees) {
//            System.out.println("Will not remove duplicates: " + e.getLastName());
//        }
        
        Employee e1 = new Employee("Jones", "Sally", "333-33-3333");
        Employee e2 = new Employee("Jones", "Sally", "333-33-3333");
        
        //equals uses memory location to see if objects are equal 
        //we should override equal method so we determine if they are truly equal
        //now with overridden methods the employees will show to be equal
        if(e1.equals(e2)) {
            System.out.println("Employees are equal");
        } else {
            System.out.println("Not equal");
        }
        
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        
        //this is passing in employee list and removing duplicates
        Set<Employee> dupes = new HashSet<>(employees);
        //passing set into employees that now has removed all the duplicates
        employees = new ArrayList<>(dupes);
        
        for(Employee e: employees) {
            System.out.println("Removed duplicates: " + e.getLastName());
        }
        
    }
}
