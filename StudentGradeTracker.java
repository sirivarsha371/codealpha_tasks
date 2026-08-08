import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name:");
            String name = sc.nextLine();
            System.out.print("enter marks:");
            double marks = sc.nextDouble();
            sc.nextLine();
            students.add(new Student(name, marks));
        }
        double total = 0;
        double highest = students.get(0).getMarks();
        double lowest = students.get(0).getMarks();
        String highestStudent = students.get(0).getName();
        String lowestStudent = students.get(0).getName();
        for (Student student : students) {
            double marks = student.getMarks();
            total += marks;
            if (marks > highest) {
                highest = marks;
                highestStudent = student.getName();
            }
                if (marks < lowest) {
                    lowest = marks;
                    lowestStudent = student.getName();
                }
            }
            double average = total / students.size();
            System.out.println("\n----Student Grade Summary----:");
            for (Student student : students) {
                System.out.println(student.getName() + ":" + student.getMarks());
            }
            System.out.print("\n Average Marks:" + average);
            System.out.print("Highest Marks:" + highest + "(" + highestStudent + ")");
            System.out.print("Lowest Marks:" + lowest + "(" + lowestStudent + ")");
            sc.close();
        }
    }

