package helloworld;

public class Hello {
    public static void main(String[]args){
        System.out.println("hello world");
        int myFirstNumber = (10 + 5)+(2*10), mySecondNumber  = 12, myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int lastOne = 1000 - myTotal;
        System.out.println(lastOne);
    }
}
