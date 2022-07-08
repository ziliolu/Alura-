public class SystemTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setPassword(404094);

        Administrator a = new Administrator();
        a.setPassword(55);

        Client c = new Client();
        c.setPassword(404044);

        InternalSystem s = new InternalSystem();
        s.validateManager(m);
        s.validateManager(a);
        s.validateManager(c);

    }

}
