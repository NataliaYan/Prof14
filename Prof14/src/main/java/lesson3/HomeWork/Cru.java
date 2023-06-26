package lesson3.HomeWork;

public enum Cru {

    //     1 уровень сложности: Создайте перечисление Cru со значениями
//    AUTRE
//    PREMIER
//    GRAND
    //    проинициализируйте значения
    //    AUTRE(80),
//    PREMIER(90),
//    GRAND(100)

    AUTRE (80),
    PREMIER(90),
    GRAND(100);

    //    добавьте конструктор,
    Cru(int quality) {
        this.quality = quality;
    }

    //    Добавьте поле private int quality,
    private int quality;

    //    и добавьте геттер.


    public int getQuality() {
        return quality;
    }
}
