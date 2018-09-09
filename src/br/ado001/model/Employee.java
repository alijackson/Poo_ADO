/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ado001.model;
/**
 *
 * @author alijackson.msilva
 */
public abstract class Employee {
    
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber; // Atributo = CPF
    
    public Employee(String firstName, String lastName,
            String socialSecurity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    @Override
    public String toString(){
        return String.format("%s %s%nsocial security number: %s", 
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    public abstract double earnings();
}

