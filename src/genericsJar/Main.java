package genericsJar;

public class Main {
    public static void main(String[] args) {
        Jar<String> stringJar = new Jar<>();
        stringJar.add("Nara");
        stringJar.add("Sara");
        stringJar.add("Bat");
        stringJar.remove();
    }
}
