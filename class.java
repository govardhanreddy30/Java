class Account {
    String name = "Govardhan";
    int balance = 1000;

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(500);
        a.withdraw(200);
        a.display();
    }
}