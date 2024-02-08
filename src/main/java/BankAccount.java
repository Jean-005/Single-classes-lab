import java.time.LocalDate;

public class BankAccount {

    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    String accountNumber;
    int balance;

//     Adding Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


// Deposit
    public void deposit (int amount) {
        balance += amount;

    }

//    Withdrawal

    public void withdrawal (int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
//        Interest Calculation
        public void addInterest(int interestRate) {
            int interest = balance * interestRate;
            balance += interest;

        }


}
