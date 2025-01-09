import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var evensDoubled = list.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .toList();
        var higherThan5 = list.stream().filter(num -> num > 5)
                .toList();
        for (int num : evensDoubled)
            System.out.println(num);
        System.out.println("-".repeat(50));
        for (int num : higherThan5)
            System.out.println(num);
    }
}