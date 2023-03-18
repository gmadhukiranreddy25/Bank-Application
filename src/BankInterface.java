public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amoount, String Password);
    double calculateInterest(int years);
}
