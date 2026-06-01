import java.util.LinkedList;
import java.util.Queue;

public class Warehouse {
    private Queue<Product> products = new LinkedList<>();
    private int currentWeight = 0;
    private final int MAX_WEIGHT = 150;

    public synchronized void addProduct(Product product) {
        products.add(product);
    }

    public synchronized Product takeProduct(String loaderName) {
        if (products.isEmpty()) {
            return null;
        }

        Product product = products.peek();

        if (currentWeight + product.getWeight() <= MAX_WEIGHT) {
            products.poll();
            currentWeight += product.getWeight();

            System.out.println(loaderName + " взял товар: " + product);
            System.out.println("Текущий вес груза: " + currentWeight + " кг");

            if (currentWeight == MAX_WEIGHT) {
                System.out.println("Грузчики набрали 150 кг и отправились на другой склад.");
                currentWeight = 0;
            }

            return product;
        } else {
            System.out.println("Вес превысит 150 кг. Грузчики отправляются на другой склад.");
            currentWeight = 0;
            return null;
        }
    }
}
