package Cognizant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOccurenceTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println(new StringOccurence().stringOccurence(str1, str2));

	}

}
