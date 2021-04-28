package encapsulation03_lib;

public class Account {
  private int balance = 0;

  public int balance() {
    return this.balance;
  }

  public void deposit(int d) {
    this.balance += d;
  }

  public void withdraw(int w) {
    this.balance -= w;
  }


}
