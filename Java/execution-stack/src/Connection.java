public class Connection implements AutoCloseable {

    public Connection(){
        System.out.println("Starting connection");
        throw new IllegalStateException();
    }

    public void readData(){
        System.out.println("Reading data");
        throw new IllegalStateException();
    }

    @Override
    public void close(){
        System.out.println("Closing connection");
    }
}
