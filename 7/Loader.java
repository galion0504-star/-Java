public class Loader extends Thread {
    private Warehouse warehouse;

    public Loader(String name, Warehouse warehouse) {
        super(name);
        this.warehouse = warehouse;
    }

    public void run() {
        while (true) {
            Product product = warehouse.takeProduct(getName());

            if (product == null) {
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " был прерван.");
            }
        }

        System.out.println(getName() + " закончил работу.");
    }
}
