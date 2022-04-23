package week2.day1;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int k=0;
		
		char[] array1 = str.toCharArray();
		int length =str.length();
		System.out.println(length);
		for(int i=0;i<array1.length;i++)
		{
			if(array1[i]== 'e')
			{
				k=k+1;
			}	
				
        }
		System.out.println("Number of occurance of e"+k);
    }			
		
	}




