package homework12;
import java.util.Random;
import java.util.Scanner;


public class CalculationHelper {
public int calculate(){
    Scanner scanner =new Scanner(System.in);
    System.out.println("Kérem az első számot");
    int x=scanner.nextInt();
    System.out.println("Kérem a második számot ");
    int y =scanner.nextInt();
    System.out.println("Kérem a műveletet");
    char operation=scanner.next().charAt(0);
    switch (operation) {
        case '+':
            return x+y;
        break;
        case '-':
            return x-y;
        break;
           case '*':
            return x*y;
        case '/':
            return x/y;
        break;
        default:
            return 1;
    }
    return 1;
}
public void randomNumber(){
    int number =0;
    Random random =new Random();
    number=random.nextInt(50)+25;
    if(number%1==0);
    {
        System.out.println("A szám egész szám");
    }
    else{
        System.out.println("A szám nem egész");
    }
}
public void twoNumber(){
    int number1=0;
    int number2=0;
    Random random = new Random();
    number1=random.nextInt(150)+100;
    number2=random.nextInt(150)+100;

    if(number1>number2 && number1%2==0){
        System.out.println(number1);
    }
    else if(number1<number2 && number1%2!=0){
        System.out.println(number1);
    }
    else if(number1<number2 && number2%2!=0) {
        System.out.println(number2);
    }
    else{
        System.out.println(number1*number2);
    }
}

}
