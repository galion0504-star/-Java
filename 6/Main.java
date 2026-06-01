public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager();

        manager.addSale(new Product("Телефон", 500));
        manager.addSale(new Product("Планшет", 100));
        manager.addSale(new Product("Телефон", 500));
        manager.addSale(new Product("Приставка", 200));
        manager.addSale(new Product("Науники", 520));

        manager.printAll();

        System.out.println("Сумма: " + manager.total());
        System.out.println("Популярный: " + manager.mostPopular());
    }
}
