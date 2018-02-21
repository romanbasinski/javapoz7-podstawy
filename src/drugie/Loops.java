package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("hello world");
        forLoopExample();
      //  int a = scanner.nextInt();
      //  System.out.println("insert first");
      //  int b =scanner.nextInt();
      //  System.out.println("insert second");
      //  int c=scanner.nextInt();
      //  System.out.println("insert third");
       // int d=scanner.nextInt();
       // System.out.println("insert fourth");


        //System.out.println("sum="+(a+b+c));

    }

    private static void forLoopExample() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert number of elements to multiply");
        int n=scanner.nextInt();


        for (int i=0;i<n; i=i+1) {
            int number = scanner.nextInt();
            if (number >= 5 && number <= 20) {

                System.out.println(i + 1 + ".Pow(" + number + ")=" + (number * number));
            } else {
                System.out.println("Upgrade to premium");
            }

        }
        System.out.println("End of program");
    }
}
