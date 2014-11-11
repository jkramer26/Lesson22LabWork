package common;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jkramer26
 */
public class LabActivity5 {

    public static void main(String[] args) {

        EmployeeLab e1 = new EmployeeLab("Smith", "John", "333-33-3333");
        EmployeeLab e2 = new EmployeeLab("Jones", "Samantha", "111-11-1111");
        EmployeeLab e3 = new EmployeeLab("Kramer", "Jessica", "111-11-1111");
        EmployeeLab e4 = new EmployeeLab("Brown", "Tom", "555-55-5555");
        EmployeeLab e5 = new EmployeeLab("Brown", "Bill", "555-55-5555");

        
        Map<String, EmployeeLab> employeeMap = new HashMap<>();
        
        //I grabbed the employees by the last name because I made them unique in my map
        //I really should add an employee id to the employee class and the use that as the key though
        employeeMap.put("Smith", e1);
        employeeMap.put("Jones", e2);
        employeeMap.put("Kramer", e3);
        employeeMap.put("Brown", e4);
        
        
        
        System.out.println(employeeMap.get("Smith"));
        System.out.println(employeeMap.get("Jones"));
        System.out.println(employeeMap.get("Kramer"));
        System.out.println(employeeMap.get("Brown"));
        
        System.out.println("");
        //We're putting a new object in the key of where a previous object was stored
        EmployeeLab old = employeeMap.put("Brown", e3);
        //What happens is that the new object overwrites the previous object and uses that key now
        System.out.println("Overwriting object in map " + employeeMap.get("Brown"));
        //ask about this and how it retains the old data
        System.out.println(old);
        
        System.out.println("");
        System.out.println("Displaying keys for the map");
        Set<String> keys  =  employeeMap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("");
        
        
        System.out.println("Displaying the values in the map");
        Collection<EmployeeLab> values = employeeMap.values();
        for(EmployeeLab value : values) {
            System.out.println(value);
        }
        

    }

}
