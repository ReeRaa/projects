package emailApp;

import java.math.MathContext;
import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private  String password;
    private String department;
    private int mailBoxCapacity=500;
    private String alternativeEmail;
    private int defaultPasswordLength=6;
    private String email;
    private String comapnySuffix="eesti.ee";

    //Constructor receive firstname and lastname

    public Email(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
        //System.out.println("EMAIL CREATED: "+this.firstname+ " "+this.lastname);

        //Call method asking for department - return department
        this.department=setDepartment();
       // System.out.println("Department: "+this.department);

        //Call method to return random password
        this.password=randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: "+this.password);

        //combine elements to email
        email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+comapnySuffix;
        //System.out.println("Your email is: "+email);
    }

    //Ask department
    private String setDepartment(){
        System.out.print("New worker: "+firstname+" "+lastname+". Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in=new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice ==1){return  "sales";}
        else if (departmentChoice == 2) {return   "development";}
        else if (departmentChoice ==3){return  "accounting";}
        else{return "";}

        }

    //Generate random password
    private String randomPassword(int length){
        String passwordSet="ASDFGHJKLÖÄQWERTYUIOPÜZXCVBNM,.%";
        char[] password = new char[length];
        for (int i=0;i<length;i++ ){
            int rand= (int)( Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
    return new String (password);
    }



    //Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailBoxCapacity=capacity;

    }

    //Set alternative email
    public void setAlternateEmail(String altEmail){
        this.alternativeEmail=altEmail;
    }


    //Change password
    public void changePassword(String password){

    }

    public int getMailBoxCapacity(){return mailBoxCapacity;}
    public String getAlternativeEmail(){return alternativeEmail; }
    public String getPassword(){return password;}

    public String showInfo(){
        return "DISPLAY NAME: "+firstname+" "+lastname +
                "\nCOMPANY EMAIL: "+email+
                "\nMAILBOX CAPACITY: "+mailBoxCapacity+" mb";
    }

}
