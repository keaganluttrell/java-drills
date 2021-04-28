package galvanize;

import encapsulation01_lib.Proposal;

public class Encapsulation01 {
  public static void main(String[] args){
    Proposal prop = new Proposal();
    prop.setName("Some thing");
    System.out.println(prop.getName());

    prop.setAllInFavor(24);
    System.out.println(prop.getAllInFavor());

    prop.setAllInFavor(24);

    prop.setAllAgainst(25);
    System.out.println(prop.getAllAgainst());
  }
}
