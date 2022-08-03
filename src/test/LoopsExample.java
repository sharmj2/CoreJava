package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		while(num<=10)
		{
			if(num == 6) {
				num++;
				continue;
				};
			
			System.out.println(num);
			num++;
		}
	
	do {
		System.out.println("print Anything");
		num++;
	}while(num==11);
	
	for(int i = num; i>=1;i--)
	{

		System.out.println(i);
	}
	
	int[] arrayForLoop = {12,14,16,18,20};
//	for(int i=0;i<arrayForLoop.length;i++)
//	{
//		System.out.println(arrayForLoop[i]);
//	}
	for(int num1:arrayForLoop)//foreach loop
	{
		System.out.println(num1);
	}
	}
	
	
}
