import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[7];
        for (int i = ints.length; i > 0; i--)
            ints[i - 1] = random.nextInt(100);
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i], revIdx = ints.length - 1 - i;
            ints[i] = ints[revIdx];
            ints[revIdx] = temp;
        }
        System.out.println(Arrays.toString(ints));
    }
}