public class Assignment3 {
    public static void main(String[] args) {

        int score = 85;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Needs Improvement");
                break;
            default:
                System.out.println("Poor Performance");
        }

        String status = score >= 40 ? "Passed" : "Failed";

        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
    }
}