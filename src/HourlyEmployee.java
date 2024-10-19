/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
public class HourlyEmployee extends Employee {
    private final double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, String cpf, String address, String phone, String department, double hoursWorked, double hourlyRate) {
        super(name, cpf, address, phone, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePayment() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void applyRaise(double percentage) {
        hourlyRate += hourlyRate * (percentage / 100);
    }
}
