import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Grade grade;
        double totalSum = 0;
        double scoreSum = 0;

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");

            double score = Double.parseDouble(input[1]);
            String gradeName = input[2];

            grade = Grade.getGradeEnumerationFromString(gradeName);

            if (!grade.getGrade().equals("P")) {
                totalSum += grade.getScore() * score;
                scoreSum += score;
            }

        }

        System.out.printf("%.6f\n", totalSum/scoreSum);

    }
}

enum Grade {
    APLUS(4.5, "A+"),
    AZERO(4.0, "A0"),
    BPLUS(3.5, "B+"),
    BZERO(3.0, "B0"),
    CPLUS(2.5, "C+"),
    CZERO(2.0, "C0"),
    DPLUS(1.5, "D+"),
    DZERO(1.0, "D0"),
    F(0.0, "F"),
    P(-1.0, "P");

    private final double score;
    private final String grade;

    Grade(double score, String grade){
        this.score = score;
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public String getGrade(){
        return grade;
    }

    public static Grade getGradeEnumerationFromString(String gradeName){
        Grade grade = null;
        Grade[] grades = Grade.values();

        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getGrade().equals(gradeName)) {
                grade = grades[i];
            }
        }

        return grade;
    }
}