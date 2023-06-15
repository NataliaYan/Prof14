package level1;

//        Создайте два объекта этого класса. Один объект инициализируйте конструктором Person() и сеттерами, другой - конструктором Person(fullName, age)

public class test {
    public static void main(String[] args) {

        Person maksym = new Person();
        maksym.setFullName("Максим");
        maksym.setAge(11);

        Person nikita = new Person("Никита", 9);

        move(nikita);
        move(maksym);
        talk(nikita);
        talk(maksym);
    }


    //        методы move() и talk(), в которых просто вывести на консоль сообщение - "Person {такой-то} говорит" и
    //        "Person {такой-то} идет" (замените {такой-то} на fullName).
public static void move(Person d){
    System.out.println(d.getFullName()+" идет");
}
    public static void talk(Person d){
        System.out.println(d.getFullName()+" говорит");
    }
}
