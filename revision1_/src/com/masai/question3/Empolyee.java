package com.masai.question3;

public class Empolyee extends  Member{

    String Specialisation;
    String Department;

    public Empolyee(String name, int age, String phone_number, String address, double salary, String specialisation, String department) {
        super(name, age, phone_number, address, salary);
        Specialisation = specialisation;
        Department = department;
    }

    @Override
    void printSalary() {
        super.printSalary();
    }
}
