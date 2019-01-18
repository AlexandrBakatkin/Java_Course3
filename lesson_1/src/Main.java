public class Main {
    public static void main(String[] args) {
        String[] strArr = {"Один", "Два", "Три", "Четыре", "Пять"};
        Integer[] intArr = {1, 2, 3, 4, 5};

        ArrayMod<Integer> intArrMod = new ArrayMod<>(intArr, 1, 2);
        System.out.println();
        ArrayMod<String> stringArrayMod = new ArrayMod<>(strArr, 0, 2);
    }
}
