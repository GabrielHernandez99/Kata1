package kata_1;


import java.time.LocalDate;
import java.time.Month;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Kata_1 {
    public static void main(String [] args){
        Person person=new Person("Luis", LocalDate.of(1980, Month.MARCH, 2020));
        System.out.println(person.getName()+" "+person.getAge());
    }
}
