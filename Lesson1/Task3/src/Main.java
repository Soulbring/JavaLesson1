//Напишите метод sumDigits, который принимает целое число n и возвращает
//сумму его цифр.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Summ sm = new Summ();
        System.out.print("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = sm.sumDigits(number);
        System.out.println(result);


    }

}

class Summ {
    public int sumDigits(int n){
        int sum = 0;
        while(n>0){
            int digit = n %10;
            n = n / 10;
            sum = sum + digit;
        }
        return sum;
    }

}