
public class OOC {

	private String data;
	private OOC value;
	public OOC(String name){
		this.data = name;
	}
	public static void main(String[] args) {
		OOC o1 = new OOC("uday");
		OOC o2 = new OOC("kiran");
		OOC o3 = new OOC("reddy");
		o1.value = o2;
		o2.value = o3;
		o3.value = null;
		OOC tmp = o1;
//		tmp.data = "sample";
//		tmp = tmp.value;
//		tmp.value.data = tmp.value;
		
		System.out.println("tmp:"+tmp.value.data);
		System.out.println("o1:"+o1.data+" o2:"+o2.data+" o3:"+o3.data);
		
		

	}

}
