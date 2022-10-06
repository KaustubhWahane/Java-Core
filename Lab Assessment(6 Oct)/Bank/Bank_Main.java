public class Bank_Main{
    public static void main(String[] args) {
        //Interest of SBI
        Bank b1 = new SBI();
        b1.bank();

        //Interest of AXIS
        Bank b2 = new AXIS();
        b2.bank();

         //Interest of ICICI
         Bank b3 = new ICICI();
         b3.bank();
    }
}