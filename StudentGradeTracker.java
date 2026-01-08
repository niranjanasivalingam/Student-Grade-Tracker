import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

ArrayList<String> names = new ArrayList<>();
ArrayList<Integer> marks = new ArrayList<>();
System.out.print("Enter number of students: ");
int n = sc.nextInt();
sc.nextLine();
for (int i = 0; i < n; i++) {
    System.out.print("Enter student name: ");
    String name = sc.nextLine();

    System.out.print("Enter marks: ");
    int score = sc.nextInt();
    sc.nextLine();

    names.add(name);
    marks.add(score);
}
int total = 0;
int highest = marks.get(0);
int lowest = marks.get(0);
for (int score : marks) {
    total += score;
    if (score > highest)
        highest = score;
    if (score < lowest)
        lowest = score;
}

double average = (double) total / n;
System.out.println("\n--- Student Summary Report ---");

for (int i = 0; i < n; i++) {
    System.out.println("Name: " + names.get(i) + " | Marks: " + marks.get(i));
}

System.out.println("\nAverage Score: " + average);
System.out.println("Highest Score: " + highest);
System.out.println("Lowest Score : " + lowest);
sc.close();


    }
}
