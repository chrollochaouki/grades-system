import java.util.ArrayList;
import java.util.Scanner;

public class GradesSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        int choice = 0;

        do {
            System.out.println("\n--- Grades System ---");
            System.out.println("1. Add grade");
            System.out.println("2. Show all grades");
            System.out.println("3. Show average");
            System.out.println("4. Show highest grade");
            System.out.println("5. Show lowest grade");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter a grade: ");
                    int grade = scanner.nextInt();
                    grades.add(grade);
                    System.out.println("Grade added");
                    break;
                case 2:
                    showAll(grades);
                    break;
                case 3:
                    System.out.println("Average: " + average(grades));
                    break;
                case 4:
                    System.out.println("Highest: " + highest(grades));
                    break;
                case 5:
                    System.out.println("Lowest: " + lowest(grades));
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 0);
    }
    public static void showAll(ArrayList<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
    }
    public static double average(ArrayList<Integer> grades){
        int sum = 0;
        for (int i = 0; i < grades.size(); i++){
            sum = sum + grades.get(i);
        }
        return (double) sum / grades.size();
    }
    public static int highest(ArrayList<Integer> grades){
        int max = grades.get(0);
        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) > max) {
                max = grades.get(i);
            }
        }
        return max;
    }
    public static int lowest(ArrayList<Integer> grades){
        int min = grades.get(0);
        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) < min) {
                min = grades.get(i);
            }
        }
        return min;
    }
}