public class Main {

    public static void main(String[] args) {

        try {

            DataManager manager = new DataManager();

            manager.registerDataProcessor(new FilterProcessor());
            manager.registerDataProcessor(new TransformProcessor());
            manager.registerDataProcessor(new SortProcessor());

            manager.loadData("input.txt");

            System.out.println("Исходные данные:");
            System.out.println(manager.getData());

            manager.processData();

            System.out.println("Обработанные данные:");
            System.out.println(manager.getData());

            manager.saveData("output.txt");

            System.out.println("Результат сохранен в output.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
