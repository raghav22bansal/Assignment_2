public class Question2 {
    public static void main(String args[]){
        int a=5;
        int b=7;
        int c=9;
        int min;
        if(a<b && a<c)
            min=a;
        else if(b<a && b<c)
            min=b;
        else
            min=c;
        System.out.println(min);
    }
}
