class Account
{//logic of P1Q4
    private int id = 0;
    double balance = 500, annualInterest = 7, amount;
    String dateCreated;

    Account()
    {
        id = 0;
        balance = 50000;
        annualInterest = 7;
    }
    Account(int i, double bal)
    {
        id = i;
        balance = bal;
    }
    void setdata(int i, double bal, double aInt, String dt)
    {
        id = i;
        balance = bal;
        annualInterest = aInt;
        dateCreated = dt;
    }
    int getId()
    {
        return id;
    }
    double getBal()
    {
        return balance;
    }
    double getAnn()
    {
        return annualInterest;
    }
    double getMonthlyInterestRate()
    {
        return (annualInterest * 100) / 12;
    }
    double getMonthlyInterest()
    {
        return balance * (annualInterest * 100) / 12;
    }
    String getDt()
    {
        return dateCreated;
    }
    void withdraw(double amount)
    {
        balance -= amount;
        if (balance > 0)
        {
            System.out.println("The balance left after withdrawal of Rs " + amount + " is Rs. " + balance);
        }
        else
        {
            System.out.println("Withdrawal of Rs " + amount + " is not possible ");
        }
    }
    void deposit(double amount)
    {
        balance += amount;
        System.out.println("The balance left after deposit of Rs." + amount + " is Rs. " + balance);
    }
}