package homework12;

public class CalculatorService {
    public boolean isItEven(int number){
        if (number%2==0){
            return true;
        }
        return false;
    }
    public int calculate(int x, int y, char operation){
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
}
