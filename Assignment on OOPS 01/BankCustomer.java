public class BankCustomer {
    int accountNumber;
    boolean isSavings;
    String banker;

    BankCustomer(int accN){
         accountNumber = accN;
    }

    BankCustomer(int accN, boolean isSave){
         accountNumber = accN;
         isSavings = isSave;

    }

    BankCustomer(int accN, boolean isSave, String bank){
         accountNumber = accN;
         isSavings = isSave;
        banker= bank;

    }
    public static void main(String[] args) {
        // This is made one integer value
        BankCustomer b1 = new BankCustomer(605);
        System.out.println("Your Id is " + b1.accountNumber);

        //This is made by one integer and boolean value
        BankCustomer b2 = new BankCustomer(605 ,false);
        System.out.println("Your Id and savings or current account is " + " "+  b2.accountNumber +" "+ b2.isSavings);

        //This is made by one integer, string  and boolean value
        BankCustomer b3 = new BankCustomer(605 ,true, "Loanprocessor");
        System.out.println("Your Id ,savings or current account is and field is " + b3.accountNumber +" "+ b3.isSavings+  " "+ b3.banker);
    }
}
