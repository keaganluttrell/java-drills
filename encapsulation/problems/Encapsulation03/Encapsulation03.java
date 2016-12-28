package galvanize;

import encapsulation03_lib.*;
import java.util.LinkedList;

class Encapsulation03 {
  public static void main(String[] args){

    LinkedList<String> things = new LinkedList<String>();
    things.add("Hello");
    System.out.println(things.get(0));

    Object[] foo = new Object[5];
    System.out.println("Foo");
    System.out.println(foo[4]);

    Account sourceAccount = new Account();
    Account destinationAccount = new Account();

    sourceAccount.balance = 500;
    destinationAccount.balance = 750;

    Transfer t = new Transfer(sourceAccount, destinationAccount);
    t.transfer(250);

    System.out.println(sourceAccount.balance);
    System.out.println(destinationAccount.balance);
  }
}
