package practical;

import java.util.Scanner;

/**
 * Created by prots on 25.04.2017.
 */
public class Days {
    private int number;
    Days(int number){
        setNumber(number);
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String setDay() {
        switch (getNumber()) {
            case 1:
                return "Monday, Понеділок, Понедельник";
            case 2:
                return "Tuesday, Вівторок, Вторник";
            case 3:
                return "Wednesday, Середа, Среда";
            case 4:
                return "Thursday, Четвер, Четверг";
            case 5:
                return "Friday, П'ятниця, Пятница";
            case 6:
                return "Saturday, Субота, Субота";
            case 7:
                return "Sunday, Неділя, воскресенье";
            default:
                return "You wrong! Please enter number: 1 - 7.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        Days day = new Days(number);
        day.setDay();
    }
}