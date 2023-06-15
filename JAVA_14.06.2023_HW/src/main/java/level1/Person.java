package level1;

// Создаем класс Person, который содержит:
//        переменные fullName, age;
public class Person {
    String fullName;
    int age;

    //        Добавляем геттеры и сеттеры.

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //        Добавьте два конструктора  - Person() и Person(fullName, age).
    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }




}
