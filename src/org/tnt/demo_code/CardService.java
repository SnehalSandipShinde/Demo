package org.tnt.demo_code;

import java.io.File;

//@Service
public class CardService {
	
	public static void main(String[] args) 
	{
		File file = new File("abc.txt");
		
		Card card = new Card(1234);
		int num= card.getNumber();
		
		file.canRead();
		
		if(num != 0)
		{
			System.out.println("The number is not present ");
//			num.save();
		}
		else
			System.out.println(num);
	}
}
