package test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green World";
		String revStr = "";
		for(int i = str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			revStr = revStr +ch;
		}
		System.out.println("Reverse string is  "+revStr);
		
		
		int num = 567890585;
		int rev = 0;
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println("Reversre number is  "+rev);
	}

}
