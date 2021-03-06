package primitivetypesofvariables;

public class ByteShortIntLong {
    public static void main(String[] args) {
        //32bits 
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value ="+myMinIntValue);
        System.out.println("Integer Maximum Value ="+myMaxIntValue);
        System.out.println("Busted Minimum Value ="+(myMinIntValue-1)); //Overflow
        System.out.println("Busted Maximum Value ="+(myMaxIntValue+1)); //Underflow

        int myManIntTest = 2_147_483_647;
        //8bits
        byte myMinByteValue  = Byte.MIN_VALUE;
        byte myMaxByteValue  = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value ="+myMinByteValue);
        System.out.println("Byte Maximum Value ="+myMaxByteValue);
        //16bits
        short myMinShortValue  = Short.MIN_VALUE;
        short myMaxShortValue  = Short.MAX_VALUE;
        System.out.println("Short Minimum Value ="+myMinShortValue);
        System.out.println("Short Maximum Value ="+myMaxShortValue);
        //64bits
        long myMinLongValue  = Long.MIN_VALUE;
        long myMaxLongValue  = Long.MAX_VALUE;
        System.out.println("Long Minimum Value ="+myMinLongValue);
        System.out.println("Long Maximum Value ="+myMaxLongValue);


    }
}
