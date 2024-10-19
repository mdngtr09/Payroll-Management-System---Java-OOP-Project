/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, String cpf, String address, String phone, String department, double monthlySalary) {
        super(name, cpf, address, phone, department);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePayment() {
        return monthlySalary;
    }

    @Override
    public void applyRaise(double percentage) {
        monthlySalary += monthlySalary * (percentage / 100);
    }
}
