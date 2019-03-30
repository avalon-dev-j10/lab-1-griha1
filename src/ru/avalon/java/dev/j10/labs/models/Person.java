package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

public class Person {

    /*
    объявляем атрибуты класса, в их числе Полное имя и Адрес, которые
    инициализируются в классе Мэйн после создания объектов класса Персон 
    */
      private String fullName;
      private Passport passport; 
      private Address address; 

      public Person (String serN, String name, String surname, String patroname, 
              String bd, String issD, String issOff, String country, String city,
              String street, String building, String app){
          this.address = new Address (country, city, street, building, app);
          this.passport = new Passport(serN, name, surname, patroname, bd, issD, issOff, address);
          this.fullName = name + " " + surname + " " + patroname;
          
    }
      public Person (String serN, String name, String surname, 
              String bd, String issD, String issOff, String country, String city,
              String street, String building, String app){
          this.address = new Address (country, city, street, building, app);
          this.passport = new Passport(serN, name, surname, bd, issD, issOff, address);
          this.fullName = name + " " + surname;
          
      }
      public Person (String serN, String name, String surname, char secName, 
              String bd, String issD, String issOff, String country, String city,
              String street, String building, String app){
          this.address = new Address (country, city, street, building, app);
          this.passport = new Passport(serN, name, surname, secName, bd, issD, issOff, address);
          this.fullName = name + " " + secName + "." + " " + surname;
          
      }

    public String getFullName() {

        return fullName;
    }


    public String getAddress() {

        return address.getCountry() + 
                ", " + address.getCity() + 
                ", " + address.getStreet() + 
                ", " + address.getBuilding() + 
                ", " + address.getApp() + ".";
    }
}