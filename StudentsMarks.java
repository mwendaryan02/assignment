

public class StudentsMarks{
    public static void main(String[] args) {
        // Declare and initialize the scores for five units
        int java = 60;
        int hci = 70;
        int network = 55;
        int cables = 45;
        int api = 65;
        
        // Compute the average score
        int totalScore = java + hci + network + cables +api;
        double averageScore = totalScore / 5.0;
        
        // Print the average score
        System.out.println("Average Score: " + averageScore);
        
        // Determine if the student passed or failed
        if (averageScore >= 50) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
          }
		}

}