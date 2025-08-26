package p1;
import java.util.*;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Numbers of characters in string are: "+str.length());
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        System.out.println("Reverse of string is: "+str1);
        if(str1.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}