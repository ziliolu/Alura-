public class AccountTestWithCheckedException {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.deposit();
        } catch (Exception ex){
            System.out.println("Treating exceptions");
            System.out.println(ex.getCause());
        }


    }
}
