package convertisseur;

import java.util.Scanner;

public class ConvertisseurRGBToHexa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("---- Convertisseur RGB Color To Hexadecimal ---- ");
		System.out.println("R:");
		int r = in.nextInt();
		System.out.println("G:");
        int g = in.nextInt();
        System.out.println("B:");
        int b = in.nextInt();
        String R = Integer.toHexString(r).toUpperCase();
        String G = Integer.toHexString(g).toUpperCase();
        String B = Integer.toHexString(b).toUpperCase();
        if(r < 10) {
        	R = "0" + R;
        }
        if(g < 10) {
        	G = "0" + G;
        }
        if(b < 10) {
        	B = "0" + B;
        }
        String hexaColor = "#"+R+G+B;
        System.out.println("("+ r + ", " + g + ", " + b + ") = " + hexaColor + " en Hexadécimal");
	}

}
