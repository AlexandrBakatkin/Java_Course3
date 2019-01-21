public class Orange<F> implements Fruit<F> {
    final float weight = 1.5f;
    final String type = "Orange";

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String getType() {
        return type;
    }
}