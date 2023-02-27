import java.util.Scanner;

public class Leet_9checkPalindromeNumber{
    public static Boolean checkPalindrome(int num){
        int orignalNum=num;
        int revnum=0;
        while(num>0){
            int ld=num%10;
            revnum=(revnum*10)+ld;
            num=num/10;
        }
        return orignalNum==revnum;
    }

    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter Number To Check It Is Palindrome Or Not: ");
        // int num=sc.nextInt();
        // sc.nextLine();
        int num=121;

        System.out.println(checkPalindrome(num));
        // sc.close();

    }
}