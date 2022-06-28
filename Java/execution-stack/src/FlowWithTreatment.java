public class FlowWithTreatment {
    public static void main(String[] args) {
        System.out.println("Start of main");
        try {
            method1();
        } catch (ArithmeticException | NullPointerException e) {
            String msg = e.getMessage();
            System.out.println("Exception ---> " + msg);
            //e.printStackTrace();
        }
        System.out.println("End of main");
    }

    private static void method1() {
        System.out.println("Start of method 1");
        method2();
        System.out.println("End of method 1");
    }

    private static void method2() {
        System.out.println("Start of method 2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Account account = null;
            account.deposit();
            int a = i / 0;
        }
        System.out.println("End of method 2");
    }
}
