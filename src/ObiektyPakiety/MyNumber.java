package ObiektyPakiety;
/*
Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
MyNumber isOdd() - true jeśli atrybut jest nieparzysty,
MyNumber isEven() - true jeśli atrybut jest parzysty,
MyNumber sqrt() - pierwiastek z atrybutu,
MyNumber pow(MyNumber x) - atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
MyNumber add(MyNumber x) - zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
MyNumber subtract(MyNumber x) - zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
 */

class MyNumber {
    private double number;
    private MyNumber(double number){
        this.number=number;
    }

    MyNumber isOdd(){
        if(number%2!=0) return new MyNumber(1);
        return new MyNumber(-1);
    }

    MyNumber isEven(){
        if(number%2==0) return new MyNumber(1);
        return new MyNumber(-1);
    }

    MyNumber sqrt(){
        return new MyNumber(Math.sqrt(this.number));
    }

    MyNumber pow(MyNumber x){
        return new MyNumber(Math.pow(this.number,x.number));
    }

    MyNumber add(MyNumber x){
        return new MyNumber(this.number+x.number);
    }

    MyNumber subtract(MyNumber x){
        return new MyNumber(this.number-x.number);
    }
}
