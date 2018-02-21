package drugie;

//import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {
        // 0.kolejne 6 liczb
        int n = 4;
        for (int i = 0; i < n; i++)
            System.out.println(i);

//1. n liczby

          for (int i=0; i<n;i++) {
              System.out.println(2*(i+1));
          }

//2. wyswietlic tylko parzyste
        for (int i=0; i<n;i++){
            if (i%2==0) {
                System.out.println(i);
            }
     //3. podzielne przez 3
     for (int i=0;; i<n; i++){
                if (i%3==0) {
                    System.out.println(i);
                }
            }

       // for (int i=2;i<=n;i+=2)   {
      //      System.out.println(i);
      //  }
  //4. n liter ''a

            for (int i1=0; i<n;i++) {
                System.out.println("a");

                //5.
                for (int i2=0; i<n;i++); {
                    System.out.println(i*i);}
                }
            }
    }
}
