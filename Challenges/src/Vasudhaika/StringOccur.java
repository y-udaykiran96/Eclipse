package Vasudhaika;

import java.util.Scanner;

public class StringOccur {
	public static String[] slist;
	public static String target;
	
	public static int SubstrOccur() {
		int occur=0, same = 0;
		int i=0, j=0, k=0;
		for(i = 0; i<slist.length; i++) {
			for(j = 0; ((j<slist[i].length())&&(slist[i].length()-j>=target.length())); j++) {
				if((target.charAt(0)==slist[i].charAt(j))&&
						(target.charAt(target.length()-1)==slist[i].charAt(j+target.length()-1))) {
					for(k = 0; k<target.length(); k++) {
						if((target.charAt(k)==slist[i].charAt(j+k))){
							same += 1;
						}
					}
					if(same == target.length()) {
						occur += 1;
						same = 0;
						j = j+k;
					}
				}
			}
		}
		return occur;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String list[] = {"www.google.com", "www.google.net", "ukr.google.com", "ukr.google.net"};
		slist = list;
		target = sc.nextLine();
		System.out.println(SubstrOccur());
		
	}

}
