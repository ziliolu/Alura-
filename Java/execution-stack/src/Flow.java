public class Flow {
    public static void main(String[] args) {
        System.out.println("Start of main");
        try {
             method1();
        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println("Exception ---> " + msg);
            e.printStackTrace();
        }
        System.out.println("FIM");
    }

    private static void method1() throws MyException {
        System.out.println("Start of method 1");
        method2();
        System.out.println("End of method 1");
    }

    private static void method2() throws MyException {
        System.out.println("Start of method 2");
        throw new MyException("Something is very wrong!");

        //System.out.println("End of method 2");
    }

}
