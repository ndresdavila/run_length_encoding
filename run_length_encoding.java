package paquete;

import java.util.Scanner;

public class run_length_encoding {
	
	/*
	 Run-length encoding is a fast and simple method of encoding strings.
	 The basic idea is to represent repeated successive characters as a single count and character.
	 For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
	 Implement run-length encoding and decoding.
	 You can assume the string to be encoded have no digits and consists solely of alphabetic characters.
	 You can assume the string to be decoded is valid.
	*/
	
	public static void encoding(String input) { //O(n)
		int counter = 0;
		for(int i = 0; i < input.length(); i++) {

			if((i == 0) || (input.charAt(i) == input.charAt(i-1))) {
				counter++;
				if(i == input.length()-1) {
					System.out.print(counter);
					System.out.print(input.charAt(i));
				}
			}
			else {
				System.out.print(counter);
				System.out.print(input.charAt(i-1));
				counter = 1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		encoding(input);
		sc.close();
	}

}
