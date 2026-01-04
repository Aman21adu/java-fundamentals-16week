class SavingsAccount {
    private double balance;
    private static double interestRate;
    private static int numberOfAccounts = 0;

    public SavingsAccount(double initial) {
        if (initial < 0) initial = 0;
        this.balance = initial;
        numberOfAccounts++;
    }

    public static void setInterestRate(double r) {
        if (r >= 0) interestRate = r;
    }

    public void deposit(double m) {
        if (m > 0) balance += m;
    }

    public void addAnnualInterest() {
        balance *= (1 + interestRate);
    }

    public double getBalance() { return balance; }

    public static void showBalance(SavingsAccount acc) {
        System.out.println("Account: balance = " + acc.getBalance());
    }

    public static int getNumberOfAccounts() { return numberOfAccounts; }

    public static double roundUpToInt(double x) {
        return Math.ceil(x);
    }
}

public class SavingsAccountDemo {
    public static void main(String[] args) {
        SavingsAccount.setInterestRate(0.01);

        SavingsAccount a = new SavingsAccount(1000.0);
        SavingsAccount b = new SavingsAccount(500.0);

        a.deposit(0); // no-op
        b.deposit(0);

        a.addAnnualInterest();
        b.addAnnualInterest();

        System.out.println("Number of accounts: " + SavingsAccount.getNumberOfAccounts());
        System.out.println();
        System.out.println("Account A: balance = 1000.0 \u2192 after interest = " + a.getBalance());
        System.out.println();
        System.out.println("Account B: balance = 500.0 \u2192 after interest = " + b.getBalance());
        System.out.println();
        System.out.println("ceil(3.3) = " + (int)SavingsAccount.roundUpToInt(3.3));
        System.out.println();
        System.out.println("Integer.valueOf(\"123\") + 1 = " + (Integer.valueOf("123") + 1));
        System.out.println();
        System.out.println("Double.parseDouble(\"3.14\") * 2 = " + (Double.parseDouble("3.14") * 2));
    }
}