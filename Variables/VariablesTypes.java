public class ByteShortIntLong {
	
	public static void main(String[] args) {
		
		int myValue = 10000;
		int myMinValue = Integer.MIN_VALUE;
		int myMaxValue = Integer.MAX_VALUE;
		System.out.println("Integer min val:" + myMinValue);
		System.out.println("Integer max val:" + myMaxValue);
		/*
			Ao usar o "Integer" vocêa cessar uma "Wapper class",
			que dse aplica a todos outros tipos primitivos
			Overflow - Ao tentar adicionar algum valor positivo ao maximo
				do Integer, vai ocorrer o overflow, transformando o numero
				em no minimo possivel do Integer.
			Underflow - Ao tentar adicionar um número negativo ao mínimo
				de um Integer vai ocorrer o underflow, deixando o número
				resultante no maximo posisitov
			Byte = 8 Bits = Boolean
			Short = 16 Bits
			Integer = 32 Bits
			Long = 64 Bits
			
		**/
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte min val:" + myMinByteValue);
		System.out.println("Byte max val:" + myMaxByteValue);
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short min val:" + myMinShortValue);
		System.out.println("Short max val:" + myMaxShortValue);
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		long myLongValue = 100L;
		System.out.println("Short min val:" + myMinLongValue);
		System.out.println("Short max val:" + myMaxLongValue);
		
		// Se não especificar o tipo esperado do resultado de um calculo
		// vai ser assumido como sendo um int por default
		byte byteSum = (byte) (myminByteValue / 2 );
		short shrotSum = (short) (myMinShortValue / 2);
	}
}