package test;

public class ExceptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,4,5,6,7};
		try {
			
			//int num = 5/0;
			System.out.println(array[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception is  "+e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is  "+e.getMessage());
		}finally {
			System.out.println("Final Block");
		}
		
		System.out.println("Came out");
	}

}
