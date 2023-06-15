package level2;

public class test {

    public static void main(String[] args) {

        //        Создаем три экземпляра класса Phone.

        Phone samsung = new Phone(222333999,"samsung",80);
        Phone iPhone = new Phone(333777555,"iPhone",120);
        Phone huawei = new Phone(999555777,"huawei",200);



//        Выведите на консоль значения переменных .
        samsung.printPhoneList();
        iPhone.printPhoneList();
        huawei.printPhoneList();

        System.out.println();

//        Вызваем методы для каждого из объектов  (определение имени звонящего и его номера)
        samsung.receiveCall("Наталья");
        iPhone.receiveCall("Алексей");
        huawei.receiveCall("Игорь");

    }

}
