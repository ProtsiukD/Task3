package practical;

/**
 * Created by prots on 25.04.2017.
 */
public class Number {
    private static int total;
    private int number1, number2, number3;

    Number(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int numbers() {
        if(number1%2==1){
            total++;
        }
        if(number2%2==1){
            total++;
        }
        if(number3%2==1){
            total++;
        }
        return total;
    }

    public static void main(String[] args) {
        Number number = new Number(2, 41, 358);
        System.out.println("Odd variables: "+number.numbers());
    }
}
