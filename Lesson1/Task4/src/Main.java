//Нахождение максимального из трех чисел
//Реализуйте две функции:
//        1. Функция findMaxOfTwo должна принимать два числа и возвращать
//максимальное из них, используя только знак сравнения.
//        2. Функция findMaxOfThree должна принимать три числа и находить
//максимальное из них, используя первую функцию.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ReadCommLine rcl = new ReadCommLine();
        Compare com = new Compare();

        System.out.print("Enter First number:");
        int fnum = rcl.readNumber();
        System.out.print("Enter Second number:");
        int snum = rcl.readNumber();
        System.out.print("Enter Third number:");
        int tnum = rcl.readNumber();
        int result = com.findMaxOfThree(fnum,snum,tnum);
        System.out.print("Max number is:" + result);


    }
}


class Compare {
    public int findMaxOfTwo(int numberOne, int numberTwo){
        if (numberOne > numberTwo) {
            return numberOne;
        }else {
                return numberTwo;}
        }

    public int findMaxOfThree(int numberOne, int numberTwo, int numberThree){
        int maxOfTwo = findMaxOfTwo(numberOne,numberTwo);
        int max = findMaxOfTwo(maxOfTwo,numberThree);
        return max;
    }
}

class ReadCommLine{
    public int readNumber(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}