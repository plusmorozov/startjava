public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Самец";
        wolfOne.nickname = "Новый волк 1";
        wolfOne.weight = 55.5f;
        wolfOne.age = 4;
        wolfOne.color = "Серый";

        System.out.println("Пол = " + wolfOne.gender);
        System.out.println("Кличка = " + wolfOne.nickname);
        System.out.println("Вес = " + wolfOne.weight);
        System.out.println("Возраст = " + wolfOne.age);
        System.out.println("Окрас = " + wolfOne.color);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}