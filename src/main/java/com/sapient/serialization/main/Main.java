package com.sapient.serialization.main;

import com.sapient.serialization.domain.Department;
import com.sapient.serialization.domain.Employee;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shiva on 5/13/2017.
 */
public class Main {
    public static void main(String args[]){
        Employee emp1 = new Employee("p1111","A","B","Gurgaon",1200,null);
        Employee emp2 = new Employee("p2222","C","D","Noida",1300,null);
        Employee emp3 = new Employee("p3333","E","F","Delhi",1400,null);
        Employee emp4 = new Employee("p4444","G","H","Mumbai",1200,null);
        Employee emp5 = new Employee("p5555","I","J","Noida",1500,null);
        Employee emp6 = new Employee("p6666","K","L","Gurgaon",1800,null);

        Department dpt1 = new Department("d1","IT",emp6);
        Department dpt2 = new Department("d2","Finance",emp5);
        Department dpt3 = new Department("d3","People Success",emp3);

        emp1.setDepartment(dpt1);
        emp2.setDepartment(dpt2);
        emp3.setDepartment(dpt3);
        emp4.setDepartment(dpt1);
        emp5.setDepartment(dpt2);
        emp6.setDepartment(dpt1);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);

        ObjectMapper objectMapper = new ObjectMapper();
        String serializedList;
        try {
            objectMapper.writeValue(new File("serialisedJSON.json"),employeeList);
            List deserialisedList = objectMapper.readValue(new File("serialisedJSON.json"),List.class);
            System.out.println("Deserialised List:\n");
            for(Object emp:deserialisedList){
                System.out.println(emp);
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred!!!"+e);
        }
    }
}
