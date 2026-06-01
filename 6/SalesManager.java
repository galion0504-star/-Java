import java.util.*;

public class SalesManager {
    private ArrayList<Product> sales = new ArrayList<>();

    public void addSale(Product product) {
        sales.add(product);
    }

    public void printAll() {
        for (Product p : sales) {
            System.out.println(p);
        }
    }

    public double total() {
        double sum = 0;
        for (Product p : sales) {
            sum += p.getPrice();
        }
        return sum;
    }

    public String mostPopular() {
        Map<String, Integer> map = new HashMap<>();

        for (Product p : sales) {
            String name = p.getName();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        String best = null;
        int max = 0;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                best = e.getKey();
            }
        }

        return best;
    }
}
