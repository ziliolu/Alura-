package domain;

public class Account {

    /**
     *
     * @throws MyException
     */
    public void deposit() throws MyException{
        throw new MyException("Message of domain.MyException");
    }
}
