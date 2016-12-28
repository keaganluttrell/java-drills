package galvanize;

import encapsulation01_lib.Proposal;

public class Encapsulation01 {
  public static void main(String[] args){
    Proposal prop = new Proposal();
    prop.setName("Some thing");
    System.out.println(prop.getName());

    prop.vote();
    prop.vote();
    prop.vote();
    prop.vote();
    System.out.println(prop.allInFavor());
  }
}
