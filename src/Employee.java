/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
public abstract class Employee {
    private final String name;
    private final String cpf;
    private final String address;
    private final String phone;
    private final String department;

    public Employee(String name, String cpf, String address, String phone, String department) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
        this.department = department;
    }

    public abstract double calculatePayment();

    public abstract void applyRaise(double percentage);

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Department: " + department);
    }
}
