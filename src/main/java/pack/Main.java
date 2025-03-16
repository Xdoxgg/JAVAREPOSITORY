package pack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Миша!");
        Tester tester = new Tester("name","surname",20,"B1",1000);
        Tester.getPerson(tester);
        tester.says();
    }
}
