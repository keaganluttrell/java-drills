package encapsulation01_lib;

public class Proposal {
  private String name = "";
  private int allInFavor = 0;
  private int allAgainst = 0;


  public String getName() {
      return name;
  }

  public int getAllInFavor() {
      return allInFavor;
  }

  public int getAllAgainst() {
      return allAgainst;
  }

  public void setAllInFavor(int allInFavor) {
      this.allInFavor = allInFavor;
  }

  public void setName(String name) {
      this.name = name;
  }

  public void setAllAgainst(int allAgainst) {
      this.allAgainst = allAgainst;
  }
}


