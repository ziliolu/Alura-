public class ConnectionTest {
    public static void main(String[] args){

        try (Connection connection = new Connection()) {
            connection.readData();
        } catch(IllegalStateException e){
            System.out.println("Connection error");
        }

//        Connection connection = null;
//        try {
//            connection = new Connection();
//            connection.readData();
//        } catch (Exception e) {
//            System.out.println("Connection Error");
//        } finally { //will always be executed (with exception or not)
//            connection.close();
//        }
    }
}
