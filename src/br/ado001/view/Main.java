/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ado001.view;

import br.ado001.model.Employee;
import br.ado001.model.heranca.CommissionEmployee;
import br.ado001.model.heranca.HourlyEmployee;
import br.ado001.model.heranca.SalariedEmployee;
import br.ado001.model.polimorfismo.BasePlusCommissionEmployee;

/**
 *
 * @author jacks
 */
public class Main {
    public static void main(String args []){
        String firstName, lastName, socialSecurityNumber = new String();
        
        double grossSales, commission, salary, weeklySalary,
                wage, hours, commissionRate;
        
        firstName = "Joaquim";
        lastName = "Manuel";
        socialSecurityNumber = "12312312312";
        grossSales = 143.23;
        commission = 0.73;
        salary = 1783.98;
        weeklySalary = 369.65;
        wage = 346.78;
        hours = 44;
        commissionRate = 0.89;
        
        
        
        
        BasePlusCommissionEmployee bpc = new BasePlusCommissionEmployee(firstName, 
                lastName, socialSecurityNumber, grossSales, commission, salary);
        
        HourlyEmployee he = new HourlyEmployee("Francisco", lastName, 
                socialSecurityNumber, wage, hours);
        
        CommissionEmployee ce = new CommissionEmployee("Thiago", lastName, 
                socialSecurityNumber, grossSales, commissionRate);
        
        SalariedEmployee se = new SalariedEmployee("Matheus", lastName, 
                socialSecurityNumber, weeklySalary);
        
        Employee [] employee = new Employee[4];
        employee[0] = se;
        employee[1] = ce;
        employee[2] = he;
        employee[3] = bpc;
        
       for(Employee tmp : employee){
           System.out.println(tmp+"\n\n");
       }
        
    }
    
}
