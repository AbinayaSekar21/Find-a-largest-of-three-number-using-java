import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int max;
        if(num1>=num2 &&  num1>=num3){
            max=num1;
           // System.out.println("Result:"+num1);
        }
        else if(num2>=num3 && num2>=num1){
            max=num2;
           // System.out.println("Result:"+num2);
        }
        else{
            max=num3;
          //  System.out.println("Result:"+num3);
        }
        System.out.println("Result:"+max);
    }
}
