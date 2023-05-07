/*
Collin      Hargreaves
CIS 35A          00441
Assignment          2a
Due         05-08-2023
Submitted   05-06-2023
*/


package p1;

public class Person {
    //declar einstance variables - name, address, age and phoneno
    //write a default constructor
    //write an overloaded constructor - can accept input for all four variables.
    //getter and setter methods.
    //print()

    // instance variables
    public String name;
    public String address;
    public int age;
    public String phoneNum;

    // default constuctor
    public Person(){}

    // overloaded constructor
    public Person(String name, String address, int age, String phoneNum) {

        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNum = phoneNum;
    }
    
    // Getters and Setters for Name, Address, Age, and Phone Number
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phoneNum;
    }

    // Print out name, address, age, and phone number
    public void print() {
        System.err.printf("%s", "\nPrinting values \n");
        System.out.printf("%s%s%s", "Name: ", name, "\n");
        System.out.printf("%s%s%s", "Address: ", address, "\n");
        System.out.printf("%s%s%s", "Age: ", age, "\n");
        System.out.printf("%s%s%s", "Address: ", phoneNum, "\n\n");

    }
}