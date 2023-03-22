//Enter 5 numbers form user and print those numbers;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        int[] A=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter 5 numbers");
        for(int i=0;i<5;i++){
            A[i]=sc.nextInt();
        }

       System.out.println("You have entered numbers:");
        for(int i=0;i<5;i++){
            System.out.println(A[i]+3);
        }

        

    }
}
