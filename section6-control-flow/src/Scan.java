import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0, sum = 0;
        while (true) {
            String line = scanner.nextLine();
            try {
                sum += Integer.parseInt(line);
                size++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) (sum) / size));
    }
}
