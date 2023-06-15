package level2;

//Создайте класс Phone, который содержит переменные number, model и weight.

public class Phone {
    int number;
    String model;
    int weight;


    //     Добавляем метод для определения номера телефона


    public int getNumber() {
        return number;
    }

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    //    Добавляем в класс Phone метод для вывода на консоль объектов созданных
    public void printPhoneList() {
        System.out.println(" номер:" + getNumber()+ " модель: " + model + " вес: " +weight);
    }

    //     Добавляем в класс Phone метод для определения имени звонящего
    public void receiveCall(String nameCall) {
        System.out.println("Звонит " + nameCall + " (номер телефона- " + getNumber() +")");

    }

    }

