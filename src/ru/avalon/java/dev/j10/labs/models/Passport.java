package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;
public class Passport { // модификатор доступа паблик дает доступ за пределами пакета
    /*
    ниже указываем атрибуты класса паспорт.
    атрибут второго имени сделал другого типа, чтобы можно было перегрузить 
    конструктор в том случае когда количество атрибутов совпадает,
    а их состав - нет (в частности, когда у человека нет отчества,
    но есть второе имя и когда есть имя фамилия и отчество. В этих двух
    случаях если второе имя тоже стринг, то типы и количество параметров
    совпадут и конструктор не перегрузится)
    */
    private String serAndNumb;
    private String name;
    private String surname;
    private String patroname;
    private char secName;
    private String birthDate;
    private String issueDate;
    private String issueOff;
    
    private Address registration;
    
    public Passport(String serAndNumb, String name, String surname,
            String birthDate, String issueDate, String issueOff, Address registration){
        this.serAndNumb = serAndNumb;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.issueDate = issueDate;
        this.issueOff = issueOff;
        this.registration = registration;
    }
    public Passport(String serAndNumb, String name, String surname,
            String patroname, String birthDate, String issueDate,
            String issueOff, Address registration){
        this.serAndNumb = serAndNumb;
        this.name = name;
        this.surname = surname;
        this.patroname = patroname;
        this.birthDate = birthDate;
        this.issueDate = issueDate;
        this.issueOff = issueOff;
        this.registration = registration;
    }
    public Passport(String serAndNumb, String name, String surname,
            char secName, String birthDate, String issueDate,
            String issueOff, Address registration){
        this.serAndNumb = serAndNumb;
        this.name = name;
        this.surname = surname;
        this.secName = secName;
        this.birthDate = birthDate;
        this.issueDate = issueDate;
        this.issueOff = issueOff;
        this.registration = registration;
       
}
    public String getRegistration(){
        return registration.getCountry() + 
                " " + registration.getCity() + 
                " " + registration.getStreet() + ".";
    }


}
