package testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
/*        String sentence="";
        String input="";
        while (! input.equals("Q")){
            Scanner in=new Scanner(System.in);
            System.out.print("Please give a name: ");
            input=in.nextLine();
            sentence= sentence +"\n"+input;
        }
        System.out.println("This is sentence from Sting: ");
        System.out.println(sentence);*/


        //using String array
        String input2="";

        List<String> names=new ArrayList<String>();
        while (!input2.equals("Q")){
            Scanner in=new Scanner(System.in);
            System.out.print("Give names: ");
            input2=in.nextLine();
            names.add(input2);
        }
        System.out.println("Names from ListArray: ");
        for (String str:names){System.out.println(str);};
    }
}
