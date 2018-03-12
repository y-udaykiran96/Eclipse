
public class Sample {

	private String name;
	private int age;
	public Sample(){}
	public Sample(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void Samplef(int a){
		int b;
		b = 20;
		a = b;
	}
	public static void main(String[] args) {
		/*Sample s1 = new Sample("uday", 22);
		Sample s2 = new Sample("kiran", 23);
		Sample s3 = s2;
		System.out.println(s3.name+" "+s3.age);
		s3.name = "reddy";
		System.out.println(s2.name);*/
		
/*//		String s = ""+1;
		String s1 = "b";
		String s2 = "a";
		System.out.println(s1.compareTo(s2));
//		System.out.println("hello");
		*/
		int a = 10;
		Sample s = new Sample();
		s.Samplef(a);
		System.out.println(a);
		
		

	}

}
