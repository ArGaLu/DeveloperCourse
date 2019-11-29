package primitivetypesofvariables;

public class PrimitiveTypesChallenge {
    /*
    Create a variable of type byte, int and short doesn't matter the number.
    Create a variable long and make that equal 50,000 plus 10 times
    the sum of the byte plus the short plus the integer values.
    */
    public static void main(String[] args) {
        byte myByte  = 30;
        short myShort = 60;
        int myInt  = 1000;
        long  myLong = 50000l+10l*(myByte+myShort+myInt);
        /*
        (myByte+myShort+myInt) the result of this is an int
        longs work quite nicely with ints
        */
        System.out.println("the result is "+myLong);

        //but in this case a casting is necessary

        short myShortExample =(short) (1000 + 10 * (myByte+myShort+myInt));
    }
}
