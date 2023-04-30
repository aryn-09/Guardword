import java.util.*;

public class guardword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        int lengthScore = calcLengthScore(password);
        int complexityScore = calcComplexityScore(password);
        int uniquenessScore = calcUniquenessScore(password);

        int totalScore = lengthScore + complexityScore + uniquenessScore;

        System.out.println("Password Strength Score: " + totalScore);
        System.out.println("Password Strength Level: " + getStrengthLevel(totalScore));

        scanner.close();
    }

    private static int calcUniquenessScore(String password) {

        return 0;
    }

    private static int calcComplexityScore(String password) {
        return 0;
    }

    private static int calcLengthScore(String password) {
        int length = password.length();
        if (length < 8) {
            return 0;
        } else if (length < 12) {
            return 1;
        } else {
            return 2;
        }
    }
}