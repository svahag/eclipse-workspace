package newP;

import java.util.Scanner;

public class VigenereCipher {
    final String alp = "abcdefghijklmnopqrstuvwxyz";
    private static String key="";
    private String txt="";
    private String madeKey="";
    private String cipher="";

    public VigenereCipher(){}

    public VigenereCipher(String key, String txt){
        this.key=key;
        this.txt=txt;
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

    public String setKey(){
        System.out.print("Enter key:");
        Scanner inKey = new Scanner(System.in);
        key=inKey.nextLine();
        return key;
    }

    public String getKey() {
        return key;
    }

    public String makeKey(){
        double t=txt.length();
        double k=key.length();
        double tk=Math.ceil(t/k);
        int kt=(int) tk;
        for(int i=0; i<kt; i++){
            madeKey+=key;
        }
        return madeKey;
    }

    public String setCipher(){
        char[] cipherAr=new char[txt.length()];
        char[] txtAr=txt.toCharArray();
        char[] madeKeyAr=madeKey.toCharArray();
        for(int a=0; a<txt.length(); a++){
            if(txtAr[a]==' '){
                cipher+=" ";
            }
            else {
                int madeKeyInd = alp.indexOf(madeKeyAr[a]);
                int txtInd = alp.indexOf(txtAr[a]);
                int cipherInd = madeKeyInd + txtInd;
                cipherAr[a] = alp.charAt(cipherInd);
                cipher += cipherAr[a];
            }
        }

        return cipher;
    }

}
