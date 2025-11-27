/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

/**
 Salary Slip Generator 
Build an Employee class that stores name, employee ID, and basic salary.
* Calculate HRA (20%), PF (12%), and net salary. Print a professional formatted salary slip.
* This is similar to payroll modules in HR software.
 */
class employee {
    String name;
    int empid;
    double basicsalary;
// constructor

    public employee(String name, int empid, double basicsalary) {
        this.name = name;
        this.empid = empid;
        this.basicsalary = basicsalary;
    }
    // here iam directly writing formula of method 
    double calculateHRA(){
        return basicsalary*0.20;
    }
    double calculatePf(){
        return basicsalary*0.12;
    }
    double calculatenetsalary(){
        return basicsalary + calculateHRA() - calculatePf();
    }
    public void printsalaryslip(){
        System.out.println("Employee name :"+ name);
        System.out.println("Employee Id:"+ empid);
        System.out.println("Basuc salary:" + basicsalary);
        System.out.println("HRA(20):" + calculateHRA());
        System.out.println("pf(12):" + calculatePf());
        System.out.println("Net salary :"+ calculatenetsalary());
    }
}
public class Salaryslip {
    public static void main(String[] args) {
        employee e = new employee("Ashwika", 100, 20000);
        e.printsalaryslip();
    }
}
