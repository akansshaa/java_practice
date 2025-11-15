import java.util.Scanner;
public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = sc.nextLine();
        System.out.print("enter your age: ");
        int age = sc.nextInt();
        System.out.println("hello " + name);
        if(age>=18){
            System.out.print("Yayy! " + name + " ,You are eligible to vote.she");
        }
        else{
            System.out.print("Sorry! You can't vote.");
        }
        sc.close();
    }
}
