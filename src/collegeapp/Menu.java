package collegeapp;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Menu {
    Scanner sc=new Scanner(System.in);
    AllStudents setStudent=new AllStudents();

    public void run() {
        while (true){
            displayMainMenu();
        }
    }

    private void displayMainMenu() {
        System.out.println("MAIN MENU");
        System.out.println();
        System.out.println("1-Student, 2-Admin, 3-Exit");
        int choice=sc.nextInt();
        displayMenu(choice);
    }

    private void displayMenu(int choice) {
        switch (choice){
            case 1://student menu
                displayStudentMenu();
                break;
            case 2://admin menu
                displayAdminMenu();
                break;
            case 3://exit
                displayExiting();
                break;
            case 4://new student registration
                displayNewStudentRegistration();
                break;
            case 5://update student info
                displayUpStudentInfo();
                break;
            case 6://student registration report, for admin
                displayStudentRegReport();
                break;
            case 7://admin settings:data file locations, etc...
                displaySettingMenu();
                break;
            case 8://summery:name, id, gpa- for admin
                displayStudentSummery();
                break;
            case 9://exit
                displayExiting();
                break;
        }
    }

    private void displayExiting() {
        System.out.println("Are you sure you would like to exit? 'YES' to exit.");
        sc.nextLine();
        String s=sc.nextLine();
        if (s.equals("YES")){
            System.exit(0);
        }else displayMainMenu();
    }

    private void displayStudentSummery() {

    }

    private void displaySettingMenu() {
    }

    private void displayStudentRegReport() {
    }

    private void displayUpStudentInfo() {
        System.out.println("Student info update menu");
        sc.nextLine();
        System.out.println();
        System.out.println("Please enter your student ID");

        int studentId;

        while (true) {
            try {
                studentId = sc.nextInt();
                break;
            }
            catch (Exception e){
                System.out.println("Please enter your ID that was created when you registered, Example 100.");
            }
        }

        Student st = StudentAppDemo.allStudents.findStudent(studentId);
        System.out.println(st.toString());

        System.out.println("1-Update student weight, 2-Update first name, 3-Update last name.");
        int choice=sc.nextInt();
//        if (choice==1) updateStudentRecord();
//        if (choice==2) updateStudentRecord();
//        if (choice==3) udpadeStudentRecord();
    }

    private void displayNewStudentRegistration() {
      StudentAppDemo.allStudents.addNewStudent();
    }

    private void displayAdminMenu() {
    }

    private void displayStudentMenu() {
        sc.nextLine();
        System.out.println();
        System.out.println("4-New student registration, 5-Update your information. ");
        int choice=sc.nextInt();
        if (choice==4) displayNewStudentRegistration();
        if (choice==5) displayUpStudentInfo();

    }
}
