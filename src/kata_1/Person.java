package kata_1;

import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Person {
    private final String name;
    private final LocalDate birthdate;


    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }
    public int getAge(){
        return toYears(LocalDate.now().toEpochDay()-birthdate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/365);
    }

    
    
}
