package Petle;
/*
Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X większą od zera. Klasa powinna mieć 2 metody:
int[] oneDimension - zwróci instancję tablicy jednowymiarowej o długości X,
int[][] twoDimension - zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X,
Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”),
 */
public class ArrayFactory {
    private int num;

    ArrayFactory(int num){
        if(num<=0) throw new ArithmeticException("Positive integers only!");
        this.num=num;
    }

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }

    public int[] oneDimension(ArrayFactory factory){
        return new int[factory.getNum()];
    }

    public int[][] twoDimensions(ArrayFactory factory){
        return new int[factory.getNum()][factory.getNum()];
    }

    public static int[][] macierzJednostkowa(ArrayFactory factory){
        int[][] macierz=new int[factory.getNum()][factory.getNum()];
        for(int i=0;i<factory.getNum();i++){
            for(int j=0; j<factory.getNum();j++){
                if(i==j) macierz[i][j]=1;
                else macierz[i][j]=0;
            }
        }

        /*
        print result:

        for(int[] row:macierz){
            for(int col: row){
                System.out.print(col);
            }
            System.out.println();
        }
         */

        return macierz;
    }

}
