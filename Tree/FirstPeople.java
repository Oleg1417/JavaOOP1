public class FirstPeople {

  private String name;
  private String yearsOfLife;
  private String partner;
  private String children;
  private String mother;
  private String father;

  public FirstPeople(String name, String yearsOfLife, String partner, String father, String mother) {
    this.name = name;
    this.yearsOfLife = yearsOfLife;
    this.partner = partner;
    this.children = null;
    this.mother = mother;
    this.father = father;
  }

  public String getFather() {
    return father;
  }

  public String getMother() {
    return mother;
  }

  public String getChildren() {
    return children;
  }

  public void setChildren(String children) {
    this.children = children;
  }

  public String getName() {
    return name;
  }

  public String getYearsOfLife() {
    return yearsOfLife;
  }

  public String getPartner() {
    return partner;
  }

}
