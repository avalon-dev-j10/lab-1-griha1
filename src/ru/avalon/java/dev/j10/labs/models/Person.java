package ru.avalon.java.dev.j10.labs.models;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    /*
    объявляем атрибуты класса, в их числе Полное имя и Адрес, которые
    инициализируются в классе Мэйн после создания объектов класса Персон 
    */
      public String fullName;
      public Passport passport; 
      public String address; 

      public Person (String serN, String name, String surname, String patroname, 
              String bd, String issD, String issOff, String country, String city,
              String street, String building, String app){
          this.passport = new Passport(serN, name, surname, patroname, bd, issD, issOff);
          this.fullName = name + " " + surname + " " + patroname;
          this.address = country + ", " + city + ", " + street + ", " + building + 
                  ", " + app;
    }
      public Person (String serN, String name, String surname, 
              String bd, String issD, String issOff, String country, String city,
              String street, String building, String app){
          this.passport = new Passport(serN, name, surname, bd, issD, issOff);
          this.fullName = name + " " + surname;
          this.address = country + ", " + city + ", " + street + ", " + building + 
                  ", " + app;
      }
      public Person (String serN, String name, String surname, char secName, 
              String bd, String issD, String issOff, String country, String city,
              String street, String building, String app){
          this.passport = new Passport(serN, name, surname, secName, bd, issD, issOff);
          this.fullName = name + " " + secName + "." + " " + surname;
          this.address = country + ", " + city + ", " + street + ", " + building + 
                  ", " + app;
      }
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        return fullName;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address;
    }
}