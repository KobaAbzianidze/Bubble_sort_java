import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = { -9,15,47,4,-25,36,24,9,-8,54 };
        String [] strings = { "Mercury", "Venus", "Earth", "Mars", "Jupiter","Saturn","Uranus", "Neptune"};
        System.out.println(Arrays.toString(integers) + " <-> " + Arrays.toString(strings));
        new BubbleSort<>(integers).sort(); new BubbleSort<>(strings).sort();
        System.out.println(Arrays.toString(integers) + " <-> " + Arrays.toString(strings));
    }
}
