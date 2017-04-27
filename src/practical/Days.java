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

    public void setDay() {
        switch (getNumber()) {
            case 1:
                System.out.println("Monday, Понеділок, Понедельник"); break;
            case 2:
                System.out.println("Tuesday, Вівторок, Вторник"); break;
            case 3:
                System.out.println("Wednesday, Середа, Среда"); break;
            case 4:
                System.out.println("Thursday, Четвер, Четверг"); break;
            case 5:
                System.out.println("Friday, П'ятниця, Пятница"); break;
            case 6:
                System.out.println("Saturday, Субота, Субота"); break;
            case 7:
                System.out.println("Sunday, Неділя, воскресенье"); break;
            default:
                System.out.println("You wrong! Please enter number: 1 - 7."); break;
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