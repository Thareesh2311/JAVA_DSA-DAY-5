package DAY_5;

class BankingSystem {
    private String HolderName;
    private int AccountNumber;
    private double balance;

    BankingSystem(String HolderName , int AccountNumber , double balance){
        this.HolderName = HolderName;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("The Amount " + amount);
            System.out.println("The New balance is:  " + balance);
        }else{
            System.out.println("Enter The valid Amount to deposit");
        }
    }

    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficent balance");
        }else{
            balance -= amount;
            System.out.println("Withdrawel Successful");
            System.out.println("The new balance is: " + balance);
        }
    }

    void display(){
        System.out.println("Account Holder: " + HolderName);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: " + balance);
    }

    class Main{
        public static void main(String[] args) {
            BankingSystem b1 = new BankingSystem("Thareesh", 1001, 5000);

            b1.display();
            b1.deposit(2000);
            b1.withdraw(4999);
            b1.display();

        }
    }
    
}
