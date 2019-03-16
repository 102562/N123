package DifferentGrade;

public class Grades {
    public static void main(String[] args) {
        int marks = 70;
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 70 && marks <= 89)
            System.out.println("Grade B");
        else if (marks >= 37 && marks <= 69)
            System.out.println("Grade C");
        else if (marks == 36) {
            System.out.println("Grade Pass Class");
        }  else
                System.out.println("Fail");

        }
    }
