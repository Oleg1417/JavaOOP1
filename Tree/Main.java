import java.util.Scanner;

// Реализовать, с учетом ооп подхода, приложение.
// Для проведения исследований с генеалогическим древом.
// Идея: описать некоторое количество компонент, например:
// модель человека и дерева
// Под “проведением исследования” можно понимать например получение всех детей выбранного человека.

public class Main {
  public static void main(String[] args) {

    FirstPeople gen1_1 = new FirstPeople("Henry ll", "1133 - 1189", "Eleanor of Aquaitane",
        null, null);
    FirstPeople gen1_2 = new FirstPeople("Eleanor of Aquitane", "1122 - 1204", "Henry ll",
        null, null);

    FirstPeople gen2_1 = new FirstPeople("Henry the Young king", "1155 - 1183", null,
        gen1_1.getName(), gen1_2.getName());
    FirstPeople gen2_2 = new FirstPeople("Richard l", "1157 - 1199", "Berengaria of Navarre",
        gen1_1.getName(), gen1_2.getName());
    FirstPeople gen2_3 = new FirstPeople("Geoffrey ll duke of Brittany", "1158 - 1186", "Constance",
        gen1_1.getName(), gen1_2.getName());
    FirstPeople gen2_4 = new FirstPeople("John", "1167 - 1216", "Isabella of Angoufeme, Isabella of Gloucester",
        gen1_1.getName(), gen1_2.getName());
    FirstPeople gen2_5 = new FirstPeople("Constance", "1160 - 1201", "Geoffrey ll duke of Brittany",
        null, null);
    FirstPeople gen2_6 = new FirstPeople("Isabella of Angoufeme", "1187 - 1246", "John",
        null, null);
    FirstPeople gen2_7 = new FirstPeople("Isabella of Gloucester", "d. 1217", "John",
        null, null);

    FirstPeople gen3_1 = new FirstPeople("Eleanor countes of Richmond", "1184 - 1241", null,
        gen2_3.getName(), gen2_5.getName());
    FirstPeople gen3_2 = new FirstPeople("Arthur duke of Brittany", "1187 - 1203", null,
        gen2_3.getName(), gen2_5.getName());
    FirstPeople gen3_3 = new FirstPeople("Henry lll", "1207 - 1272", "Eleanor of Provence",
        gen2_4.getName(), gen2_6.getName());
    FirstPeople gen3_4 = new FirstPeople("Richard earl of Cornwall", "1209 - 1272", null,
        gen2_4.getName(), gen2_6.getName());
    FirstPeople gen3_5 = new FirstPeople("Joan", "1210 - 1238", "Alexander ll of Scotland",
        gen2_4.getName(), gen2_6.getName());
    FirstPeople gen3_6 = new FirstPeople("Isabella empress of Germany", "1214 - 1241",
        "Fredrich ll king of Sicily emperer of Germany", gen2_4.getName(), gen2_6.getName());
    FirstPeople gen3_7 = new FirstPeople("Eleanor", "1215 - 1275",
        "William Marshal earl of Pembroke, Simon de Montford earl of Leicester", gen2_4.getName(), gen2_6.getName());
    FirstPeople gen3_8 = new FirstPeople("Eleanor of Province", "1223 - 1291", "Henru lll",
        null, null);
    FirstPeople gen3_9 = new FirstPeople("Alexander ll of Scotland", "1198 - 1249", "Joan",
        null, null);
    FirstPeople gen3_10 = new FirstPeople("Fredrich ll king of Sicily emperer of Germany", "d. 1250",
        "Isabella empress of Germany", null, null);
    FirstPeople gen3_11 = new FirstPeople("William Marshal earl of Pembroke", "d. 1231",
        "Eleanor", null, null);
    FirstPeople gen3_12 = new FirstPeople("Simon de Montford earl of Leicester", "+ 1265",
        "Eleanor", null, null);

    FirstPeople gen4_1 = new FirstPeople("Edward l", "1239 - 1307",
        "Eleanor of Castile, Margaret", gen3_3.getName(), gen3_8.getName());
    FirstPeople gen4_2 = new FirstPeople("Margaret", "1240-1275",
        "Alexander lll of Scotland", gen3_3.getName(), gen3_8.getName());
    FirstPeople gen4_3 = new FirstPeople("Beatruce", "1242-1275",
        "Johan ll duke of Brittany", gen3_3.getName(), gen3_8.getName());
    FirstPeople gen4_4 = new FirstPeople("Edmund earl of Lancaster", "1245-1296",
        null, gen3_3.getName(), gen3_8.getName());
    FirstPeople gen4_5 = new FirstPeople("Eleanor", "1252 - 1282",
        "Liwelin ll prince of Wales", gen3_7.getName(), gen3_11.getName());
    FirstPeople gen4_6 = new FirstPeople("Eleanor of Castile", "1241 - 1290",
        "Edward l", null, null);
    FirstPeople gen4_7 = new FirstPeople("Margaret", "1279 - 1318",
        "Edward l", null, null);
    FirstPeople gen4_8 = new FirstPeople("Alexander lll of Scotland", "d. 1286",
        "Margaret", null, null);
    FirstPeople gen4_9 = new FirstPeople("Johan ll duke of Brittany", "d. 1305",
        "Beatruce", null, null);
    FirstPeople gen4_10 = new FirstPeople("Liwelin ll prince of Wales", "+ 1282",
        "Eleanor", null, null);

    FirstPeople gen5_1 = new FirstPeople("Eleanor", "1269 - 1298",
        "Henry lll count of Bar", gen4_1.getName(), gen4_6.getName());
    FirstPeople gen5_2 = new FirstPeople("Henry lll count of Bar", "d. 1302",
        "Eleanor", null, null);
    FirstPeople gen5_3 = new FirstPeople("Joan of Acre", "1272 - 1307",
        null, gen4_1.getName(), gen4_6.getName());
    FirstPeople gen5_4 = new FirstPeople("Margaret", "1275 - 1318",
        null, gen4_1.getName(), gen4_6.getName());
    FirstPeople gen5_5 = new FirstPeople("Edward ll", "1284 - 1372",
        "Isabella", gen4_1.getName(), gen4_6.getName());
    FirstPeople gen5_6 = new FirstPeople("Isabella", "c1292 - 1358",
        "Edward ll", null, null);
    FirstPeople gen5_7 = new FirstPeople("Gwenlliana", "d. 1337",
        null, gen4_1.getName(), gen4_6.getName());

    FamilyTree family = new FamilyTree();

    family.addFamily(gen1_1);
    family.addFamily(gen1_2);
    family.addFamily(gen2_1);
    family.addFamily(gen2_2);
    family.addFamily(gen2_3);
    family.addFamily(gen2_4);
    family.addFamily(gen2_5);
    family.addFamily(gen2_6);
    family.addFamily(gen2_7);
    family.addFamily(gen3_1);
    family.addFamily(gen3_2);
    family.addFamily(gen3_3);
    family.addFamily(gen3_4);
    family.addFamily(gen3_5);
    family.addFamily(gen3_6);
    family.addFamily(gen3_7);
    family.addFamily(gen3_8);
    family.addFamily(gen3_9);
    family.addFamily(gen3_10);
    family.addFamily(gen3_11);
    family.addFamily(gen3_12);
    family.addFamily(gen4_1);
    family.addFamily(gen4_2);
    family.addFamily(gen4_3);
    family.addFamily(gen4_4);
    family.addFamily(gen4_5);
    family.addFamily(gen4_6);
    family.addFamily(gen4_7);
    family.addFamily(gen4_8);
    family.addFamily(gen4_9);
    family.addFamily(gen4_10);
    family.addFamily(gen5_1);
    family.addFamily(gen5_2);
    family.addFamily(gen5_3);
    family.addFamily(gen5_4);
    family.addFamily(gen5_5);
    family.addFamily(gen5_6);
    family.addFamily(gen5_7);

    family.setParents();

    System.out.println(family.getThemAll());
    System.out.println();
    Scanner scanner = new Scanner(System.in);
    System.out.print("введите имя, что бы получить больше информации\ninput: ");
    String operator = scanner.nextLine();
    family.getPersInf(operator);
    scanner.close();
  }
}
