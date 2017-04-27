package homework;

/**
 * Created by prots on 26.04.2017.
 */
public class Number {
    public static String checkNumber(double number1, double number2, double number3) {//TASK 1
        if (number1 >= -5 && number1 <= 5 && number2 >= -5 && number2 <= 5 && number3 >= -5 && number3 <= 5) {
            return "All numbers >= -5 and <= 5.";
        } else {
            return "The numbers do not satisfy the conditions";
        }
    }

    public static int minNumber(int number1, int number2, int number3) {//TASK 2
        int min = number1 <= number2 ? (number1<=number3?number1:number3) : number2 <= number3 ? (number1 <= number2 ? number1 : number2) : number3;
        return min;
    }

    public static int maxNumber(int number1, int number2, int number3) {
        return number1 >= number2 ? (number1>=number3?number1:number3) : number2 >= number3 ? (number1 >= number2 ? number1 : number2) : number3;
    }
    public enum HTTPErrors{//TASK 3
        BAD_REQUEST, PAIMENT_REQUIRET, FORBIDDENT, NOT_FOUND, LOOP_DETECTED
    }

    public static String getErrors(int numberError){
            switch (numberError){
                case 400:{
                    return HTTPErrors.BAD_REQUEST.toString();
                }
                case 401:{
                    return HTTPErrors.PAIMENT_REQUIRET.toString();
                }
                case 402:{
                    return HTTPErrors.FORBIDDENT.toString();
                }
                case 403:{
                    return HTTPErrors.BAD_REQUEST.toString();
                }
                case 404:{
                    return HTTPErrors.NOT_FOUND.toString();
                }
                case 508:{
                    return HTTPErrors.LOOP_DETECTED.toString();
                }
                default:{
                    return "Wrong!!!";
                }
            }
    }
    public static void main(String[] args) {
        System.out.println(checkNumber(2.0, 0.9, 1.8));

        System.out.println("Max number = " + maxNumber(25, 1, 83));
        System.out.println("Min number = " + minNumber(2, 18, 30));

        System.out.println("Number mistake is 404 - "+getErrors(404));
    }
}