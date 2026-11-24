import java.util.Scanner;
public class exercise_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Q1
        System.out.println("Enter tne role :admin,superuser,user");
        String role = input.next();
        if (role.equals("admin")) {
            System.out.println("Welcome admin");
        } else if (role.equals("superuser")) {
            System.out.println("Welcome superuser");
        } else if (role.equals("user")) {
            System.out.println("Welcome user");
        }
        //Q2
        System.out.println("Enter tne number ");
        int number1 = input.nextInt();
        System.out.println("Enter tne number2 ");
        int number2 = input.nextInt();
        System.out.println("Enter tne number3 ");
        int number3 = input.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("the greatest" + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("the greatest" + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("the greatest" + number3);
        }
        //Q3
        System.out.println("please inter integer between 1 and 7 ");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday ");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday ");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("please inter integer between 1 and 7 ");
        }
        //Q4
        System.out.println("enter the number score");
        int grade = input.nextInt();
        if (grade >= 90) {
            System.out.println("Numeric Score" + grade);
            System.out.println("Letter grade A");
        } else if (grade >= 80) {
            System.out.println("Numeric Score" + grade);
            System.out.println("Letter grade B");
        } else if (grade >= 70) {
            System.out.println("Numeric Score" + grade);
            System.out.println("Letter grade C");
        } else if (grade >= 60) {
            System.out.println("Numeric Score" + grade);
            System.out.println("Letter grade D");
        } else if (grade >= 59) {
            System.out.println("Numeric Score" + grade);
            System.out.println("Letter grade F");
        }
        //Q5
        System.out.println("enter the age ");
        int age = input.nextInt();
        if (age <13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else
            System.out.println("Adult");
        }
    }

