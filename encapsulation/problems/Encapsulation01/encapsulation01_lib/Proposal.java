package encapsulation01_lib;

public class Proposal {
  String name = "";
  int[] allInFavor = new ;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void vote() {
    allInFavor++;
  }

  public int allInFavor() {
    return allInFavor;
  }

}
