package domain;

public class Client {
    String name;
    String cpf;
    String occupation;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
