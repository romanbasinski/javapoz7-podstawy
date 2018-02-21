import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        System.out.println("wpisz liczbe");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Wpsiz pierwsza liczbe");
        int firstValue=scanner.nextInt();
        System.out.println("Wpisz druga liczbe");
        int secondValue=scanner.nextInt();
        System.out.println("Wpisz trzecia liczbe");
        int thirdValue=scanner.nextInt();

        if ((firstValue+secondValue>thirdValue&&firstValue+thirdValue>secondValue&&secondValue+thirdValue>firstValue)&&(firstValue*firstValue+secondValue*secondValue==thirdValue*thirdValue)) {
            double area = 0.5 * firstValue * secondValue;
            int circuit = firstValue + secondValue + thirdValue;
            double avg = circuit / 3.0;

            System.out.println("Area=" + area);
            System.out.println("Circuit=" + circuit);
            System.out.println("Avg+" + avg);
        }else {
            System.out.println("Wartosci niepoprawne");


            //  if (firstValue+secondValue>thirdValue){
            //    System.out.println("Trojkat nie jest ");
            //          }
            //if (firstValue+thirdValue>secondValue){
            //  System.out.println("Trojkat nie jest");
            //}
            //if (secondValue+firstValue>thirdValue) {
            //   System.out.println("Trojkat nie jest");
            //}

        }
      //  double addresult = (firstValue*secondValue)*0.5;
       // System.out.println("add"+addresult);









    }
}
