// 1. Illustrates with an example of using Singleton class.

public class Question_1 {
    // creating a singleton instance of a class
    public static void main(String[] args) {   
        DBConnection conObject_1 = DBConnection.getDBConnection();
        DBConnection conObject_2 = DBConnection.getDBConnection();
        // prints true as they from the same object
        System.out.println(conObject_1 == conObject_2); 
    }
}

class DBConnection {
    private DBConnection() {}
    private static DBConnection conObject;

    public static DBConnection getDBConnection() {
        if(conObject == null) {
            conObject = new DBConnection();
        }
        return conObject;
    }

}