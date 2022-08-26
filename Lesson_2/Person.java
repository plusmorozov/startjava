public class Person {
    String gender;
    String name;
    int height;
    float weight;
    int age;

    public void walk() {
        System.out.println("Человек может идти");
    }

    public void sit() {
        System.out.println("Человек может сидеть");
    }

    public void run() {
        System.out.println("Человек может бежать");
    }

    public void talk() {
        System.out.println("Человек может говорить");
    }

    public void learnJava () {
        System.out.println("Человек может учить Java");
    }

    public static void main(String[] args) {
        Person student = new Person();
        student.gender = "Мужской";
        student.name = "Максим";
        student.height = 182;
        student.weight = 72;
        student.age = 33;
        student.walk();
        student.sit();
        student.run();
        student.talk();
        student.learnJava();
    }
}