import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	static void number (int a, int b, boolean c){
        
		if (a <= 0)
            c = true;
        System.out.print(a + " ");
        
        if (c == false )
            number(a-5,b+1,c);
        else {
            if (b == 0)
                return;
            else
                number(a+5,b-1,c);
        }
    }
	
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int x = inp.nextInt();
        
        number (x,0,false);

    }
}
