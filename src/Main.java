import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        String subject;
        int option;
        int course;
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to University Management System");
        System.out.println("");
        System.out.println("Please select an option to proceed");
        System.out.println("Press [1] Register as a Student");
        System.out.println("Press [2] Register as a Lecturer");

        option=input.nextInt();
        
        switch (option){
            case 1:
                System.out.println("Student Registration");
                System.out.println("");
                System.out.println("Please Submit following information");
                System.out.println("1:  Name:");
                name=input.next();
                System.out.println("2:  Age:");
                age=input.nextInt();
                System.out.println("3:");
                System.out.println(modules.SENG1111);
        }


    }
}
