public class Manager extends Employee implements EmployeeWithValidation{

        private ValidationUtil util;

        public Manager(){
            this.util = new ValidationUtil();
        }

        public double getBonus(){
            System.out.println("Manager getBonus() method");
            return super.getSalary(); //super means this attribute is located on base class (Employee on this case)

        }

        @Override
        public void setPassword(int password) {
            this.util.setPassword(password);
        }

        @Override
        public boolean validatePassword(int password) {
            return this.util.validatePassword(password);
        }
}
