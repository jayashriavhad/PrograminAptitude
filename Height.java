import java.util.Scanner;

public class Height
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of students: ");
        int no =sc.nextInt();

        int[] heights = new int[numStudents];
        int totalHeight = 0;

        for (int i = 0; i < no; i++) {
            System.out.printf("Enter the height of student %d (in cm): ", i + 1);
            heights[i] = sc.nextInt();
            totalHeight += heights[i];
        }

        double averageHeight = (double) totalHeight / numStudents;

        System.out.printf("The average height of the class is %.2f cm", averageHeight);
    }
}