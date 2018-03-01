package Petle;
/*
1. Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1)
2. Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument. Na przykład “pies” przekształci w “seip”,
3. Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.).
4. Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie.
 */
public class NumbersStrings {

    //Ad.1
    public static void printNumberInSeparateLines(int x){
        int digits=howManyDigits(x);
        int div=10;
        for(int i=0; i<digits;i++){
            System.out.println(x%div);
            x=x/div;
            if(x%div==0) break;
        }
    }

    //helper method for printNumberInSeperateLines
    public static int howManyDigits(int x){
        int count=0;
        do{
            count++;
            x=x/10;
        }
        while (x>0);
        return count;
    }

    //Ad.2
    public static String reverseString(String a){
        int stringlength=a.length();
        String newString="";
        for(int i=stringlength;i>0;i--){
            newString=newString+a.substring(i-1,i);
        }
        return newString;
    }

    //Ad.3
    public static String intToBinary(int x){
        String binary="";
        int tmp;
        do{
            tmp=x%2;
            x=x/2;
            binary=tmp+binary;
        }
        while(x>0);
        return binary;
    }

    //Ad.4
    public static boolean isPalindrom(String a){
        char[] chars=a.toCharArray();
        int length=chars.length;
        for(int i=0;i<length/2+1;i++){
            if(chars[i]!=(chars[length-1-i])) return false;
        }
        return true;
    }


}
