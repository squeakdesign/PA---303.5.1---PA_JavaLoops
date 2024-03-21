import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Write a program that uses nested for loops to print a multiplication table.*/

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println("\n");
        }


    /*Find the Greatest Common Divisor
    ❖ Write a program that prompts the user to enter two positive
    integers, and find their greatest common divisor (GCD).
    ❖ Examples:
    ➢ Enter 2 and 4. The gcd is 2.
    ➢ Enter 16 and 24. The gcd is 8.
    ❖ How do you find the gcd? */
        Scanner input = new Scanner(System.in);
        System.out.println("enter two positive integers");
        int n1=input.nextInt();

        int n2= input.nextInt();

        int GCD=1;int k=2;int temp;
        if(n1>n2)
        {temp=n1;}
        else temp=n2;
        for(k=2;k<temp;k++){

            if((n1%k==0)&&(n2%k==0)){
                GCD=k;
            }

        }
        System.out.println(GCD);

        /*Suppose the tuition for a university is $10,000 for the current year
        and increases by 7 percent every year.
❑ In how many years will the tuition be doubled? */

        double tuition_fee=10000;
        double temp1=tuition_fee;
                int year=0;
        while(tuition_fee<20000){
            tuition_fee=tuition_fee*1.07;
            year++;
        }
        System.out.println("tuition feel will be doubled in  "+year +"years");
        System.out.printf("Tuition will be %f in %d years",tuition_fee,year);
    }

}
