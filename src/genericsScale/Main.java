package genericsScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> comp = new Scale<>(5,4);
        System.out.println(comp.getHeavier());
        Scale<String> compStr = new Scale<>("aaa","ac");
        System.out.println(compStr.getHeavier());
    }
}
