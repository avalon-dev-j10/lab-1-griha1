/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address {

    private String Country;
    private String City;
    private String Street;
    private String Building;
    private String App;
    
    

    public Address(String Country, String City, String Street) {
        this.Country = Country;
        this.City = City;
        this.Street = Street;
    }

    public Address(String Country, String City, String Street, String Building, String App) {
        this.Country = Country;
        this.City = City;
        this.Street = Street;
        this.Building = Building;
        this.App = App;
    }
    
    

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return City;
    }

    public String getStreet() {
        return Street;
    }

    public String getBuilding() {
        return Building;
    }

    public String getApp() {
        return App;
    }
    
    
     
  
    }
    
