public class ByteShortIntLong {
	
	public static void main(String[] args) {
		
		/*
			Float = 32 bits = 4 bytes;
			Double = 64 bits = 8 bytes
		**/
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Mínimo float:" + myMinFloatValue);
		System.out.println("Máximo float:" + myMaxFloatValue);
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubletValue = Double.MAX_VALUE;
		System.out.println("Mínimo double" + myMinDoubleValue);
		System.out.println("Máximo double:" + myMaxDoubletValue);
		
		int myIntValue = 5;
		int myIntValueDividedBy = 5 / 3;
		
		float myFloatValue = 5f;
		float myFloatDecimalValue =  (float) 5.99;
		float myFloatValueDividedBy = 5f / 3f;
		
		double myDoubleValue = 5d;
		double myDoubleDecimalValue =  (double) 5.99;
		double myDoubleValueDividedBy = 5 / 3.00;
		
		System.out.println("MyIntValue" + myIntValue);
		System.out.println("MyFloatValue" + myFloatValue);
		System.out.println("MyDoubleValue" + myDoubleValue);
		
		System.out.println("MyIntValueDividedBy" + myIntValueDividedBy);
		System.out.println("MyFloatValueDividedBy" + myFloatValueDividedBy);
		System.out.println("MyDoubleValueDividedBy" + myDoubleValueDividedBy);
		
		double pounds =  87d;
		double poundsConvertionFactor = 0.45359237d;
		double poundsConverted = pounds * poundsConvertionFactor;
		System.out.println( pounds + "Converted into kilograms, in iqual to: " + poundsConverted);
		
		
	}
}