package stackQueueExercise;

import java.util.*;

public class Robots {
    private String name;
    private String product;
    private int time;

    public Robots(String name, String product, int time) {
        this.name = name;
        this.product = product;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<String> queue = new ArrayDeque<>();
        Map<String,Robots> map=new LinkedHashMap<>();
        String[] input = scanner.nextLine().split(";");
        String startTime = scanner.nextLine();
        String product = scanner.nextLine();
        while (!product.equals("End")){

        }
    }
}
