public class WarehouseMain {
    public static void main(String[] args) throws InterruptedException {
        Warehouse warehouse = new Warehouse();

        warehouse.addProduct(new Product("Компьютер", 40));
        warehouse.addProduct(new Product("Монитор", 20));
        warehouse.addProduct(new Product("Стол", 50));
        warehouse.addProduct(new Product("Стул", 15));
        warehouse.addProduct(new Product("Доска", 80));
        warehouse.addProduct(new Product("Принтер", 25));

        Loader loader1 = new Loader("Грузчик 1", warehouse);
        Loader loader2 = new Loader("Грузчик 2", warehouse);
        Loader loader3 = new Loader("Грузчик 3", warehouse);

        loader1.start();
        loader2.start();
        loader3.start();

        loader1.join();
        loader2.join();
        loader3.join();

        System.out.println("Перенос товаров завершён.");
    }
}
