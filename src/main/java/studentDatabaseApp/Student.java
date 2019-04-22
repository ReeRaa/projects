package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String cources=null;
    private int tuitionBalance=0;
    private static int costOfCource=600;
    private static int id=1000;

    //contructor: prompt user to enter student name + year
    public Student(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName=in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName=in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sphmore\n3 - Junior\n4 - Senior. \nEnter student class level: ");
        this.gradeYear=in.nextInt();
        setStudentID();


    }

    //Generate 5-digit ID
    private void setStudentID(){
        id++;
        //grade level + ID
        this.studentID= gradeYear+""+id;
    }

    //Enroll in cources
    public void enroll(){
        //get inside a loop, student hits 0
        do {
            System.out.print("Enter cource to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String cource = in.nextLine();
            if (!cource.equals("Q")) {
                cources = cources + "\n   " + cource;
                tuitionBalance = tuitionBalance + costOfCource;
            } else {
                break;
            }
        }while (1 != 0);
        }


    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $"+tuitionBalance);
    }

    // pay tuition
    public  void payTuition(){
        viewBalance();
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your payment of $ ");
        int payment= in.nextInt();
        tuitionBalance= tuitionBalance-payment;
        System.out.println("Thank your for your payment of $ "+payment);
        viewBalance();
    }

    //Show status
    public String showInfo(){
        return "Name: "+firstName+" "+lastName+
                "\nGrade level: "+gradeYear+
                "\nStudent ID: "+studentID +
                "\nCources enrolled: "+cources+
                "\nBalance: "+tuitionBalance;
    }
}
