package project2;


public class TestBankAccount {

    public static void main(String[] args) {

        MyDetails myAccount = new MyDetails();

        System.out.println(myAccount.BankAccountNo);

        //System.out.println(myAccount.Pin); /*remove private in reference class*/

        System.out.println(myAccount.accountHolder);

        System.out.println(myAccount.Balance);
    }

}
