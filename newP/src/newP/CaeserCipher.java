package newP;
import java.util.Scanner;
public class CaeserCipher {


	private String txt="";
	private int key=0;
	private String result="";
	
	
	protected CaeserCipher(){
		
	}
	public CaeserCipher(String txt, int key) {
		this.txt=txt;
		this.key=key;
	}
	
	public String setText() {
		System.out.print("Please enter the text to encrypt:");
		Scanner inTxt = new Scanner(System.in);
		txt=inTxt.nextLine();
		return txt;
	}
	
	public String getTxt() {
		return txt;
	}
	
	public int setKey(){
		System.out.print("Enter key:");
		Scanner inKey = new Scanner(System.in);
		key=inKey.nextInt();
		return key;
		
	}
	
	public int getKey() {
		return key;
	}
	
	public String setCipher(){
		result="";
		String alp = "abcdefghijklmnopqrstuvwxyz";
		String scr = alp.substring(key)+ alp.substring(0, key);
		char ch;
		for(int i=0; i<txt.length(); i++) {
			int x= alp.indexOf(txt.charAt(i));
			
			if(x>=0) {
				ch=scr.charAt(x);
				String s = Character.toString(ch);
				result+=s;
			}
			else {
				result+=" ";
			}
		}
		return result;
	}

	public void getCipher(){
		System.out.println(result);
	}
	
}