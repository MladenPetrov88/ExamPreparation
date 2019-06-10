import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGrades = Integer.parseInt(scanner.nextLine());
        String problemName = scanner.nextLine();
        int badGradesCount = 0;
        double sumGrades = 0;
        int problemsSolvedCount = 0;
        boolean hasSolvedAllProblems = true;
        String lastProblemName = "";
        while (!problemName.equals("Enough")) {
            int curentGrade = Integer.parseInt(scanner.nextLine());
            sumGrades = sumGrades + curentGrade;
            problemsSolvedCount++;
            if (curentGrade <= 4) {
                badGradesCount++;
            }
            if (badGradesCount == poorGrades) {
                System.out.printf("You need a break, %d poor grades.", badGradesCount);
                hasSolvedAllProblems = false;
                break;
            }
            lastProblemName = problemName;
            problemName = scanner.nextLine();

            }
        if (hasSolvedAllProblems) {
            double averageScore = sumGrades / problemsSolvedCount;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", problemsSolvedCount);
            System.out.printf("Last problem: %s%n", lastProblemName);

        }

    }
}
