class Bank {
    String bankName;
    double depositAmount;
    static double totalAmount = 0; 

    void setBankName(String name) {
        this.bankName = name;
    }

    void setAmount(double amount) {
        if (amount >= 1000) {
            this.depositAmount = amount;
            totalAmount += amount;
        } else {
            System.out.println("Minimum deposit must be 1000.");
        }
    }

    void showData() {
        System.out.println("Bank: " + bankName + " | Deposit: " + depositAmount);
    }

    static void findMinDepositBank(Bank[] banks) {
        Bank minBank = banks[0];
        for (int i = 1; i < banks.length; i++) {
            if (banks[i].depositAmount < minBank.depositAmount) {
                minBank = banks[i];
            }
        }
        System.out.println("\nBank with Minimum Deposit: " + minBank.bankName);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Bank[] banks = new Bank[5];
        String[] names = {"SBI", "HDFC", "ICICI", "Axis", "PNB"};
        double[] amounts = {2000, 1500, 5000, 1200, 3000};

        for (int i = 0; i < 5; i++) {
            banks[i] = new Bank();
            banks[i].setBankName(names[i]);
            banks[i].setAmount(amounts[i]);
            banks[i].showData();
        }

        System.out.println("Total Amount across all banks: " + Bank.totalAmount);
        Bank.findMinDepositBank(banks);
    }
}