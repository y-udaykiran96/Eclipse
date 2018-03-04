
public class Sample {

	public String name;
	public int age;
	public Sample(String name, int age){
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		Sample s1 = new Sample("uday", 22);
		Sample s2 = new Sample("kiran", 23);
		Sample s3 = s2;
		System.out.println(s3.name+" "+s3.age);
		s3.name = "reddy";
		System.out.println(s2.name);

	}

}
