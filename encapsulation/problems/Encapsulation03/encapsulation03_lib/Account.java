package encapsulation03_lib;

public class Account {
  private int balance = 0;
  private int[] transactions = new int[10];
  private int index = 0;

  public int balance() {
    int sum = 0;
    for(int i = 0; i < this.index; i++) {
      sum += this.transactions[i];
    }
    return sum;
  }

  public void deposit(int d) {
    this.transactions[this.index] = d;
    this.index++;
  }

  public void withdraw(int w) {
    this.transactions[this.index] = w * -1;
    this.index++;
  }


}
