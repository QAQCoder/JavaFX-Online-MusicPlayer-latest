package database;

public class TestDB {

    public static void main(String[] args) {
        DbServiceImpl dbService = new DbServiceImpl();

        System.out.println(dbService.createDB());

        System.out.println(dbService.createTable(null));
    }
}
