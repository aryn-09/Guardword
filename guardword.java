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
}