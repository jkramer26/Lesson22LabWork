
package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jkramer26
 */
public class LabActivity3 {
     public static void main(String[] args) {
        
        EmployeeLab e1 = new EmployeeLab("Smith", "John", "333-33-3333");
        EmployeeLab e2 = new EmployeeLab("Jones", "Samantha", "111-11-1111");
        EmployeeLab e3 = new EmployeeLab("Kramer", "Jessica", "111-11-1111");
        EmployeeLab e4 = new EmployeeLab("Brown", "Tom", "555-55-5555");
        
        List<EmployeeLab> employeeList = new ArrayList<>();
        
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        
        System.out.println("The list size is: " + employeeList.size());
        
        EmployeeLab employee = employeeList.get(1);
        System.out.println(employee);
        System.out.println("");
         for (EmployeeLab employeeOutput : employeeList) {
             System.out.println(employeeOutput);
         }
        
        System.out.println("Index of employee 4: " + employeeList.indexOf(e4));
        System.out.println(employeeList.equals(e1));
         
    }
        
    
    
}
