import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangeleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int area = firstNum * secondNum;

        System.out.println(area);

    }
}
