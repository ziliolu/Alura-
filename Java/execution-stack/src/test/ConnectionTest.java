package test;

import domain.Connection;

public class ConnectionTest {
    public static void main(String[] args){

        try (Connection connection = new Connection()) {
            connection.readData();
        } catch(IllegalStateException e){
            System.out.println("domain.Connection error");
        }

//        domain.Connection connection = null;
//        try {
//            connection = new domain.Connection();
//            connection.readData();
//        } catch (Exception e) {
//            System.out.println("domain.Connection Error");
//        } finally { //will always be executed (with exception or not)
//            connection.close();
//        }
    }
}
