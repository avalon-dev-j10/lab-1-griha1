package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    public static void main(String args []) {

        Person ivanov = new Person("4007 548521", "Иван", "Иванов", "Иванович",
                "15.02.1990", "12.02.2008", "50 отдел УФМС России по СПб и ЛО",
                "Россия", "Санкт-Петербург", "ул. Бассейная", "дом 51", "кв. 72"); // создается объект Иванов - экземпляр класса Персон
        Person smith = new Person("AB90 123547", "John", "Smith", 'E',
                "20.05.1975", "10.05.1993", "Federal migration service Alabama",
                "US", "Birmingham", "26th street", "building 51", "app. 10"); // создается объект Смит - экземпляр класса Персон

         
        
        String a = ivanov.getFullName();
        String b = smith.getFullName();
        
        String aa = ivanov.getAddress();
        String ab = smith.getAddress();
       
           System.out.println(a);
           System.out.println(b);
           System.out.println(aa);
           System.out.println(ab);
        
        
    }
}
