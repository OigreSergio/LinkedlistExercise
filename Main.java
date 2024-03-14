import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> tropicalFruit = new LinkedList<>();
        tropicalFruit.add(new Fruit("Banana"));
        tropicalFruit.add(new Fruit("Coconut"));
        tropicalFruit.add(new Fruit("Raspberry"));
        tropicalFruit.add(new Fruit("Blueberry"));
        System.out.println(getNameFruit(tropicalFruit));
        tropicalFruit.addFirst(new Fruit("Lemon"));
        tropicalFruit.addLast(new Fruit("Apple"));
        System.out.println(updatedList(tropicalFruit));
    }

    public static String getNameFruit(LinkedList<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            System.out.println("Original list " + fruit.getName());
        }/*Non so se sia giusto , ho cercato altre soluzioni che non
         ritornassero nulla(es. void) ma mi dava errore il compilatore*/
        return null;
    }
    public static String updatedList (LinkedList<Fruit>fruits){
        for (Fruit fruit : fruits){
            System.out.println("Updated list : "+ fruit.getName());
        }/*vale lo stesso discorso qui*/
        return null;
    }

}
