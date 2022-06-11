public class ReferencesTest {

    public static void main(String[] args) {
        Manager g1 = new Manager();  //more generic class on the left side
        g1.setName("Marcos");
        g1.setSalary(5000);

        Director d = new Director();
        d.setSalary(7000);

        BonusControl control = new BonusControl();
        control.register(g1);
        control.register(d);

        System.out.println(control.getCounter());



    }
}
