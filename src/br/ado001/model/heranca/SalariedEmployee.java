/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ado001.model.heranca;

import br.ado001.model.Employee;


/**
 *
 * @author alijackson.msilva
 */
public class SalariedEmployee extends Employee  {
     private double weeklySalary;
     
     // Contrutor
     public SalariedEmployee(String firstName, String lastName,
             String socialSecurityNumber, double weeklySalary){
         super(firstName, lastName, socialSecurityNumber);
         
         if(weeklySalary < 0.0){
                 throw new IllegalArgumentException(
                         "Weekly salary must be >= 0.0");
             }
         this.weeklySalary = weeklySalary;
     }

     @Override
     public double earnings(){
         return getWeeklySalary();
     }
    
    @Override
    public String toString(){
        return String.format("Salaried employee: %s%n%s: $%,.2f", 
                super.toString(), "weekly salary", getWeeklySalary());
        
    }
     
     
    // Inicio Getters e setters 
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0){
                 throw new IllegalArgumentException(
                         "Weekly salary must be >= 0.0");
             }
        this.weeklySalary = weeklySalary;
    }    
}
