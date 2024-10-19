/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oneide
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Employee> employees = new ArrayList<>();
            boolean continueAdding = true;

            while (continueAdding && employees.size() < 10) {
                System.out.println("Enter the type of employee (1 - Salaried, 2 - Hourly): ");
                int type = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("CPF: ");
                String cpf = scanner.nextLine();
                System.out.println("Address: ");
                String address = scanner.nextLine();
                System.out.println("Phone: ");
                String phone = scanner.nextLine();
                System.out.println("Department: ");
                String department = scanner.nextLine();

                if (type == 1) {
                    System.out.println("Monthly salary: ");
                    double monthlySalary = scanner.nextDouble();
                    boolean add = employees.add(new SalariedEmployee(name, cpf, address, phone, department, monthlySalary));
                } else if (type == 2) {
                    System.out.println("Hours worked: ");
                    double hours = scanner.nextDouble();
                    System.out.println("Hourly rate: ");
                    double hourlyRate = scanner.nextDouble();
                    employees.add(new HourlyEmployee(name, cpf, address, phone, department, hours, hourlyRate));
                }

                System.out.println("Do you want to add more employees? (Y/N)");
                String response = scanner.next().toLowerCase();
                continueAdding = response.equals("y");
                scanner.nextLine();  // Consume newline
            }

            // Display initial details and payments
            System.out.println("\nInitial details and payments:");
            for (Employee emp : employees) {
                emp.showDetails();
                System.out.println("Payment: " + emp.calculatePayment());
                System.out.println();
            }

            System.out.println("Enter the percentage raise: ");
            double raise = scanner.nextDouble();

            for (Employee emp : employees) {
                emp.applyRaise(raise);
            }

            System.out.println("\nDetails and payments after raise:");
            for (Employee emp : employees) {
                emp.showDetails();
                System.out.println("Payment: " + emp.calculatePayment());
                System.out.println();
            }
        }

        System.out.println("Test completed. Application closed.");
    }
}
