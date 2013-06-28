/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lahiru.jpademo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Lahiru Ruhunage
 */
@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Basic
    private String name;
    @Basic
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
