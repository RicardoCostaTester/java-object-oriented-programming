public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("José Miguel",
                10350);

        bankAccount.withdraw(500);
        bankAccount.deposit(500);
        bankAccount.withdraw(500);
        bankAccount.deposit(500);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance() + "$");
    }
}
