public class EncapsulatedAccount {
    
    private double balance;
    private static int Totalobjects=0;
    public EncapsulatedAccount(){
        this.balance = 0;
        Totalobjects++;
    }
    //parametrized constractor
    public EncapsulatedAccount(double initialbalance){
        if(initialbalance >= 0){
            this.balance = initialbalance;
        }else{
            System.out.println("Invalid initial balance! Setting to 0.");
            this.balance = 0;
        }
    }
//method to  deposit money 
public void deposit(double amount){
    if(amount > 0){
        balance = balance + amount;
        System.out.println("Deposited: $" + amount);
    }else{
        System.out.println("Deposit amount must be positive!");
    }
}

//method to withdraw money(check balance)
 void withdraw (double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    } else {
        System.out.println("Invalid withdrawal amount or insufficient balance!");
    }
}
//getter forbalance to allow read-only access
public double getBalance(){
    return balance;
}
public static int getTotalObjects() {
    return Totalobjects;
}

}
