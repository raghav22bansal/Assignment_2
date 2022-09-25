import java.util.*;
public class Question5 {
    public static void main(String args[]){
        int input;
        Scanner sc = new Scanner(System.in);
        input  = sc.nextInt();
        System.out.println("n n^2 n^3 n^4");
        for(int i=1;  i<=input; i++) {
        System.out.print(i + " ");
        System.out.print((int)Math.pow(i ,2) +" ");
        System.out.print((int)Math.pow(i ,3) +" ");
        System.out.print((int)Math.pow(i ,4) +" ");
        System.out.println();
        }
    }
}
