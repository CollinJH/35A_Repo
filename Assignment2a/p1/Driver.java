/*
Collin      Hargreaves
CIS 35A          00441
Assignment          2a
Due         05-08-2023
Submitted   05-06-2023
*/

package p1;

import java.util.Scanner;



public class Driver {
    static Scanner s1 = new Scanner(System.in);
    public static void main(String [] args)
    {
        Driver d1 = new Driver();
        Person Stacey = d1.readValue();
        Stacey.print();
        Person Ross = d1.readValue();
        Ross.print();
        Person Mia = d1.readValue();
        Mia.print();
    }
    public Person readValue() {

        //use methods in Scanner to read values - create a Person object and return it.

        // declare four variables to store values in to create object
        String name;
        String address;
        int age;
        String phoneNum;

        // taking input from user 
        System.out.printf("Enter name: ");
        name = s1.nextLine();
        System.out.printf("Enter address: ");
        address = s1.nextLine();
        System.out.printf("Enter age: ");
        age = s1.nextInt();
        s1.nextLine();
        System.out.printf("Enter phone number: ");
        phoneNum = s1.nextLine();

        // return Person object using overloaded constructor
        return new Person(name, address, age, phoneNum);
    }
}
