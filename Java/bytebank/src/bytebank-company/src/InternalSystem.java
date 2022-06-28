public class InternalSystem {

    private int password = 404044;

    public void validateManager(EmployeeWithValidation employee){
       boolean validation = employee.validatePassword(this.password);
       if(validation){
           System.out.println("Permission success");
           return;
       }
        System.out.println("Permission denied");
    }
}
