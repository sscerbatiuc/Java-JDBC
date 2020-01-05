/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author sscerbatiuc
 */
public class Employee implements Serializable {

    private Integer id; 
    private String name;
    private String surname;
    private String idnp;

    public Employee(String name, String surname, String idnp) {
        this.name = name;
        this.surname = surname;
        this.idnp = idnp;
    }

    public Employee(Integer id, String name, String surname, String idnp) {
        this(name, surname, idnp);
        this.id = id;
    }
    
    

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdnp() {
        return idnp;
    }

    public Integer getId() {
        return id;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee other = (Employee) obj;
        return other.getName().equals(this.getName()) 
                && other.getSurname().equals(this.getSurname())
                && other.getIdnp().equals(this.getIdnp());
    }
    
    

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", idnp=" + idnp + '}';
    }

}
