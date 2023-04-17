import java.util.ArrayList;
import java.util.List;


public class FamilyTree {

    private List<FirstPeople> family;

    public FamilyTree(List<FirstPeople> family) {
        this.family = family;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public void addFamily(FirstPeople people){
        family.add(people);
    }

    public String getName(FirstPeople people) {
        return people.getName().toString();
    }

    public String getThemAll(){
      String x = "";
      for (FirstPeople i : family) {
        x = x+"\n"+i.getName()+" ("+i.getYearsOfLife()+")";
    }
    return x;
    }

    public String getInfo(FirstPeople people) {
      return people.toString();
    }

    public void getPersInf(String operator){
      boolean a = true;
      for (FirstPeople i : family) {
        String chat = "";
        if (i.getName().toLowerCase().contains(operator.toLowerCase())){
          a = false;
          if (i.getFather() != null){
            chat = chat+i.getFather();
          }
          if (i.getFather() != null && i.getMother() != null){
            chat = chat+" = ";
          }
          if (i.getMother() != null){
            chat = chat+i.getMother();
          }
          if (!chat.equalsIgnoreCase("")){
            chat = chat+"\n   |родители\n";
          }
          chat = chat+" "+i.getName()+" ("+i.getYearsOfLife()+")";
          if (i.getPartner() != null){
            chat = chat+" =супруг/супруга= "+i.getPartner();
          }
          if (i.getChildren() != null){
            chat = chat+"\n   |дети\n"+i.getChildren();
          }
          System.out.println("_________________________\n\n"+chat);
        }
      }
      if (a){
        System.out.println("Имя не найдено!");
      }
    }

    public void setParents(){
      for (FirstPeople i : family) {
        String x ="";
        for (FirstPeople j : family) {
          if (i.getName().equalsIgnoreCase(j.getFather()) || i.getName().equalsIgnoreCase(j.getMother())){
            if (x.equalsIgnoreCase("")){
              x = j.getName();
            } else {
              x = x+", "+j.getName();
            }
          }
          if (!x.equalsIgnoreCase("")){
            i.setChildren(x);
          }
        }
      }
    }


}
