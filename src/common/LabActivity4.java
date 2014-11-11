/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jkramer26
 */
public class LabActivity4 {
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
                
        Set<EmployeeLab> dupes = new HashSet<>(employeeList);
        employeeList = new ArrayList<>(dupes);
        
        for (EmployeeLab employeeOutput : employeeList) {
             System.out.println(employeeOutput);
         }
        System.out.println("List size: " + employeeList.size());
        
    }
}
