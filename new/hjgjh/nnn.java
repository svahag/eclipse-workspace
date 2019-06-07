package hjgjh;

public class nnn 
{

	public static void main() 
	{
		// TODO Auto-generated method stub
		int generate(int number)
		{
			if (number < 10) {System.out.println(number);}
			else {System.out.println(number%10); generate(number/10);}
		}
        System.out.println (generate(45678));
		
	}


}

