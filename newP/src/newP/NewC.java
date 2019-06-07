package newP;
import java.util.*;
public class NewC {
	
	public static void main(String args[]) {

		VigenereCipher v1 = new VigenereCipher("dice","flagship flag" );

		System.out.println(v1.makeKey());

		System.out.println(v1.setCipher());


		CaeserCipher c1 = new CaeserCipher();


		Scanner ch1 = new Scanner(System.in);
		Scanner ch2 = new Scanner(System.in);
		
		

			System.out.print("press 1 to cipher, press 2 to decipher, 3 to show encrypted text:");
			int i1=ch1.nextInt();
			switch(i1) {
				case 1:i1 = 1;
				System.out.print("1 to use Caeser, 2 to use Vigenere:");
				int i2=ch1.nextInt();
				if(i2==1){


				}
				else if(i2==2){

				}



				int choiceMade[] = {0, 0};
				while (choiceMade[0] == 0 || choiceMade[1] == 0) {
					System.out.println("1 to enter text, 2 to enter key");

					if (i2 == 1) {
						c1.setText();
						if (c1.getTxt().length() > 0) {
							choiceMade[0] = 1;
						}
					}
				}

				case 2:i1 = 2;
					//case body

				case 3:i1 = 3;
					//case3 body

			}


		


	}
}
