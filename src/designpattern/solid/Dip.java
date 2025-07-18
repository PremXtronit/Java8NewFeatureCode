package designpattern.solid;

interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }
}

class DataManager {
    private Database db;

    public DataManager(Database db) {
        this.db = db;
    }

    public void init() {
        db.connect();
    }
}

public class Dip {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();  // or new PostgreSQLDatabase();
        DataManager manager = new DataManager(db);
        manager.init();
    }
}
