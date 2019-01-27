/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3b;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class Lab3b {
    public static void main(String[] args)
    {
        
        Customer c[] = new Customer[5];
        
        List<Customer> list = new ArrayList<>();
        
        c[0] = new Customer("Alice Brown", "12 Main St", "Ellicott Mannor", "MD", "21999", "123-456-7890");
        c[1] = new Customer("Charles Downing", "147 Tolker Ave", "Bloomneld", "NJ", "07001", "890-123-4567");
        c[2] = new Customer("Eric Farnes", "8397 Zip Rd", "Bloomneld","NJ", "07001", "456-789-0123");
        c[3] = new Customer("Gary Hull", "1222 Ready Rd", "Resier", "CA", "90001", "345-678-9012");
        c[4] = new Customer("Ian Jones", "190 Distro Dr", "Patlock", "MI", "48003", "678-901-2345");
        
        //adding all these customers into the list
        //list.addAll(Arrays.asList(c));
        list = Arrays.asList(c);
        
        int option;
        Scanner input = new Scanner(System.in);
        //printCustomers(list);
        
        
        while(true)
        {
            System.out.println("\n Menu");
            System.out.println("1. Add a new entry");
            System.out.println("2. Remove an entry");
            System.out.println("3. Sort by zip code");
            System.out.println("4. Sort by city");
            System.out.println("5. Search by name");
            System.out.println("6. Print Customers");
            System.out.println("7. Quit");
            System.out.println("Enter choice (1-7): ");
            option = Integer.parseInt(input.nextLine());
            String address, name, city, state, zip, phoneN;
            
        switch(option)
        {
            case 1: 
                System.out.println("Enter name: ");
                name = input.nextLine();
                System.out.println("Enter Address: ");
                address = input.nextLine();
                System.out.println("Enter City: ");
                city = input.nextLine(); 
                System.out.println("Enter state: ");
                state = input.nextLine();
                System.out.println("Enter Zip Code: ");
                zip = input.nextLine();
                System.out.println("Enter phone Number: ");
                phoneN = input.nextLine();
                
                Customer newCustomer = new Customer(name,address, city, state,zip, phoneN);
                list.add(newCustomer);
                printCustomers(list);
                break;
            case 2:
                System.out.println("Enter last name to remove: ");
                name = input.nextLine();
                break;
            case 3:
                list = sortByZIP(list);
                break;
            case 4: 
                list = sortByCity(list);
                break;
            case 5:
                System.out.println("Enter name to search: ");
                name = input.nextLine();
                List<Customer> search = searchByName(list, name);
                printCustomers(search);
                break;
            case 6:
                printCustomers(list);
                break;
            case 7:
                break;     
        }
            
        }
    }
    public static List<Customer> sortByZIP(List <Customer> list)
    {
        List<Customer> newList = list.stream()
            .sorted(Comparator.comparing(Customer::getZip))
            .collect(Collectors.toList());
        return newList;
    }
    public static List<Customer> sortByCity(List <Customer> list)
    {
        List<Customer> newList = list.stream()
            .sorted(Comparator.comparing(Customer::getCity))
            .collect(Collectors.toList());
        return newList;
    }
    public static List<Customer> searchByName(List<Customer> list, String firstName)
    {
        System.out.println("\nName SEARCHED: ");
        List<Customer> newList = list.stream()
            .filter(e->(e.getName().equals(firstName)))
            .collect(Collectors.toList());
       return newList;
    }
    public static void printCustomers(List <Customer> list)
    {
        list.stream()
                .forEach(System.out::println);
    }
    
}