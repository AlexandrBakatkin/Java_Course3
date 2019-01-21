import java.util.ArrayList;

public class Box {
    private ArrayList <Fruit> fruitList;
    private String typeFruit = null;
    private float fruitWeight;

    public Box() {
        this.fruitList = new ArrayList();
    }

    public boolean putFruit(Fruit <Fruit> fruit){
        if (typeFruit == null){
            typeFruit = fruit.getType();
            fruitList.add(fruit);
            fruitWeight = fruit.getWeight();
        } else {
            if (typeFruit == fruit.getType()){
                fruitList.add(fruit);
            } else return false;
        }
        return true;
    }

    public float getWeight(){
        return fruitList.size()*fruitWeight;
    }

    public boolean compare(Box box){
        if (box.getWeight() == getWeight()){
            return true;
        } else return false;
    }

    public boolean dropBox(Box box){
        if (box.getTypeFruit() != getTypeFruit()){
            return false;
        } else {
            for (int i = fruitList.size() - 1; i >= 0; i--) {
                box.getFruitList().add(fruitList.remove(i));
            }
            return true;
        }
    }

    public ArrayList getFruitList() {
        return fruitList;
    }

    public String getTypeFruit() {
        return typeFruit;
    }
}
