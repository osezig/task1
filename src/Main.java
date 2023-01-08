import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Введите число:");
                String n = s.nextLine().trim();
                char[] array = n.toCharArray();
                int sum = 0;
                for (char c : array) {
                    if (!Character.isDigit(c)) {
                        throw new IllegalArgumentException();
                    }
                    sum += Character.getNumericValue(c);
                }
                System.out.println("Суммф цифр в числе: " + sum);

                }
            }

