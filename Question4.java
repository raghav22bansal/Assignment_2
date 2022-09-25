public class Question4 {
    public static void main(String args[]){
        int people=80000;
        int years=0;
        while(people<=150000){
            people*=105;
            people/=100;
            years++;
        }
        System.out.println(years);
    }
}
