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

    private static int calcComplexityScore(String password) {
        int score = 0;
        if (password.matches(".*[a-z].*")) {
            score++;
        }
        if (password.matches(".*[A-Z].*")) {
            score++;
        }
        if (password.matches(".*\\d.*")) {
            score++;
        }
        if (password.matches(".*[@#$%^&+=].*")) {
            score++;
        }
        return score;
    }

    private static int calcUniquenessScore(String password) {
        int score = 2;
        if (password.matches(".*(\\w)\\1+.*")) {
            score--;
        }
        if (password.matches(".*(\\w\\w)\\w*.*")) {
            score--;
        }
        return score;
    }

    private static String getStrengthLevel(int totalScore) {
        if (totalScore <= 2) {
            return "Weak";
        } else if (totalScore <= 4) {
            return "Moderate";
        } else {
            return "Strong";
        }
    }
}