
import java.util.LinkedList;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        for (int i = 1; i <= 50;i++){
            Animal cat = new Animal("cat" + i,i,"cat");
            Animal dog = new Animal("dog" + i,i,"dog");
            animals.add(cat);
            animals.add(dog);
        }
    }
    public static void deleteFivesCat(LinkedList<Animal> animals){
        for (int i = 0; i< 50; i++){
            if (animals.get(i).getAge() % 5 == 0 && animals.get(i).getType().equals("Cat")){
                animals.remove(i);
            }
        }
    }
    public static void addMouse(LinkedList<Animal> animals){
        for (int i = 0; i< 50; i++){
            Animal dog = animals.get(i);
            if (dog.getAge() % 3 == 0 && dog.getType().equals("Dog")){
                Animal mouse = new Animal("mouse" + i,i,"mouse");
                animals.add(i + 1, mouse);
            }
        }
    }
    public static LinkedList<Animal> getNeighborCatAndMouse(LinkedList<Animal> animals){
        LinkedList<Animal> newList = new LinkedList<>();
        for (int i = 0; i < animals.size(); i++){
            ListIterator<Animal> animalsIterator = animals.listIterator();
            if (animalsIterator.hasNext()){
                if (animalsIterator.next().getType().equals("cat") || animalsIterator.next().getType().equals("mouse")){
                    if (animalsIterator.next().equals("cat") && animals.get(animalsIterator.nextIndex()).getType().equals("cat"));
                }
            }
        }
    }
}