package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
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
    String serAndNumb;
    String name;
    String surname;
    String patroname;
    char secName;
    String birthDate;
    String issueDate;
    String issueOff;
    
    public Passport(String serAndNumb, String name, String surname,
            String birthDate, String issueDate, String issueOff){
        this.serAndNumb = serAndNumb;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.issueDate = issueDate;
        this.issueOff = issueOff;
    }
    public Passport(String serAndNumb, String name, String surname,
            String patroname, String birthDate, String issueDate,
            String issueOff){
        this.serAndNumb = serAndNumb;
        this.name = name;
        this.surname = surname;
        this.patroname = patroname;
        this.birthDate = birthDate;
        this.issueDate = issueDate;
        this.issueOff = issueOff;
    }
    public Passport(String serAndNumb, String name, String surname,
            char secName, String birthDate, String issueDate,
            String issueOff){
        this.serAndNumb = serAndNumb;
        this.name = name;
        this.surname = surname;
        this.secName = secName;
        this.birthDate = birthDate;
        this.issueDate = issueDate;
        this.issueOff = issueOff;
}

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
