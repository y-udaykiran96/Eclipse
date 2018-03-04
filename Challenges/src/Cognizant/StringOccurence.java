package Cognizant;

public class StringOccurence {

	public int stringOccurence(String parent, String sub){
		int count=0;
		String parent_tmp = parent.toLowerCase();
		String sub_tmp = sub.toLowerCase();
		int l = 0;
		try {
			while(l!=-1){
				l = parent_tmp.indexOf(sub_tmp, l);
				if(l!=-1){
					count++;
					l += sub_tmp.length();
				}
			}
		} catch (Exception e) {	}
		return count;
	}
}
