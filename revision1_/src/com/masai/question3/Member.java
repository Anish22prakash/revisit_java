package com.masai.question3;

public class Member {
    String  Name ;
     int Age ;
   String Phone_number;
    String  Address ;
    double Salary ;

    public Member(String name, int age, String phone_number, String address, double salary) {
        Name = name;
        Age = age;
        Phone_number = phone_number;
        Address = address;
        Salary = salary;
    }

  void  printSalary(){
        System.out.println("the salary is :"+Salary);
    }
}
