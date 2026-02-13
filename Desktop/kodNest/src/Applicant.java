import java.util.Scanner;

public class Applicant {
    int age;
    void takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age=");
        int age=sc.nextInt();
    }
    void validate(){
        if(age >=21 && age<=41){
            System.out.println("Eligible to marry..");
        } else if(age <21){
            //genearte under age Exception
            System.out.println("Your are too old to marry..");
        } else {
            //generate Overage Exception

        }
    }
}
