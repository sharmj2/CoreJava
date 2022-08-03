package test;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green World";
		int countIf = 0;
		int countSwitch = 0;
		for(int index = 0;index<str.length();index++)
		{
			char ch = str.charAt(index);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				countIf ++;
			}
			
		}
		System.out.println("Vowel Count using If "+countIf);
		
		
		for(int index = 0;index<str.length();index++)
		{
			char ch = str.charAt(index);
			switch(ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				countSwitch++;
				break ;
				
			}
			
		}
		System.out.println("Vowel Count using Switch "+countSwitch);
	}

}
