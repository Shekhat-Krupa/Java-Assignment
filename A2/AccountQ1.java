class AccountQ1{//logic of P1Q2
    private int id;
    private double balance=500;
    private double air=7;//annual interest rate
    AccountQ1(){}//default constuctor
    AccountQ1(int id, double balance,double air){//parameterized constructor
        this.id=id;
        this.balance=balance;
        this.air=air;
    }
    void setid(int id) {//setter method
        this.id=id;
    }
    int getid() {//getter method
        return id;
    }
    void setbalance(double balance) {//setter method
        this.balance=balance;
    }
    double getbalance() {//getter method
        return balance;
    }
    void setair(double air) {
        this.air=air;
    }
    double getair() {//getter method
        return air;
    }
    double  getMonthlyInterestRate() {//getter method
        return air/12;
    }
    double  getMonthlyInterest() {//getter method
        return balance*air/1200;
    }
}