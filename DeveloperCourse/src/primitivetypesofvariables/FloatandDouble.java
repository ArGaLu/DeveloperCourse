package primitivetypesofvariables;

public class FloatandDouble {
    public static void main(String[] args) {
        
        float myMinFloatValue  = Float.MIN_VALUE;
        float myMaxFloatValue  = Float.MAX_VALUE;
        System.out.println("Float Minimum Value ="+myMinFloatValue);
        System.out.println("Float Maximum Value ="+myMaxFloatValue);
        
        double myMinDoubleValue  = Double.MIN_VALUE;
        double myMaxDoubleValue  = Double.MAX_VALUE;
        System.out.println("Double Minimum Value ="+myMinDoubleValue);
        System.out.println("Double Maximum Value ="+myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue =(float)5.25; // or f, for example: float myFloatValue = 5.25f;
        double myDoubleValue =5.25;

        System.out.println("MyIntValue " + myIntValue);
        System.out.println("MyFloatValue "+ myFloatValue);
        System.out.println("MyDoubleValue "+ myDoubleValue);

        double pound=200d, convert=pound*0.45359237;
        System.out.println("one pound is "+ (convert)+ " kilograms");
    }
}
