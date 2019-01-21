public class Apple<F> implements Fruit<F> {
    final float weight = 1.0f;
    final String type = "Apple";

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String getType() {
        return type;
    }
}