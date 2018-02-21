import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");

        Scanner reader = new Scanner(System.in);
        //int someValue = reader.nextInt();
        //System.out.println(someValue);
        //1. pobrac liczby
        //2. wykonac dzialania
        //3. wyswietlic


        System.out.println("Insert first value");
        int firstValue=reader.nextInt();
        System.out.println("Insert second value");
        int secondValue = reader.nextInt();

       //2.
        int addResult = firstValue + secondValue;
                int subtractResult = firstValue - secondValue;
                int multiplyResult = firstValue*secondValue;
                double divideResult=0;
                if(secondValue!=0) {
                   divideResult = (double) firstValue / secondValue;
                }

                //3.
        System.out.println("add="+ addResult);
        System.out.println("subtract=" + subtractResult);
        System.out.println("multiply =" + multiplyResult);
        if (secondValue!=0) {
            System.out.println("divide =" + divideResult);
        }
        //4. ladne wyswietlenie wynikow

        System.out.println(firstValue+"+"+secondValue+"="+(firstValue+secondValue));
        System.out.println(firstValue+"-"+secondValue+"="+(firstValue-secondValue));
        System.out.println(firstValue+"*"+secondValue+"="+(firstValue*secondValue));
        if (secondValue!=0) {
            System.out.println(firstValue + "/" + secondValue + "=" + ((double) firstValue / secondValue));
        }

            //5. wyswietlic infomracje o liczbach
            //czy liczby sa rowne
        if (firstValue==secondValue){
            System.out.println("First Value and second value are equal");
        } else{
            System.out.println("Values are not equal");
        }
        if (firstValue!=secondValue) {
            System.out.println("First value is diiferent than second");
        }

        if (firstValue>secondValue) {
            System.out.println("firstValue bigger");
        }
        if (firstValue<secondValue) {
            System.out.println("secondValue is bigger");

        }
        if (firstValue%secondValue!=0){
            System.out.println("liczby podzielne z reszta");
        }else {
            System.out.println("Liczby podzielne bez reszty");
        }
        if (firstValue%2 ==0){
            System.out.println("First velue is even");
        } else
            System.out.println("First value is odd");
        if (secondValue%2==0){
            System.out.println("Second value is even");
        } else {
            System.out.println("Second value is odd");
        }
        // wyswietlic wieksza liczbe

    }
}
