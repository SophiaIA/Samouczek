package Metody;

/*
Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli metoda jest podzielna przez 3 i przez 5.
Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości
przekazanych w argumentach można zbudować trójkąt prostokątny.
*/

public class Tasks {

    public static void countTwoNumbers(int a, int b){
        System.out.println("a+b="+(a+b));
        System.out.println("a*b="+(a*b));
        System.out.println("a-b="+(a-b));
    }

    public static boolean isEven(int a){
        return (a%2==0);
    }

    public static boolean canDivideBy3And5(int a){
        return (a%3==0 && a%5==0);
    }

    public static boolean isTriangle(int a, int b, int c){
       if(Math.sqrt(Math.pow(a,2)+Math.pow(b,2))==c) return true;
       else if (Math.sqrt(Math.pow(c,2)+Math.pow(b,2))==a) return true;
       else if (Math.sqrt(Math.pow(a,2)+Math.pow(c,2))==b) return true;
       return false;
    }

}