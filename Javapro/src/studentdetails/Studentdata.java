package studentdetails;

public class Studentdata {
	private void studet(String name) {
		System.out.println(name);
	}
	public void studet(int id) {
		System.out.println(id);
		
	}
	public void studet(long phoneno) {
		System.out.println(phoneno);
	}
	public static void main(String[]args) {
		Studentdata obj =new Studentdata();
		obj.studet("nandhini");
		obj.studet(902);
		obj.studet(698543012);
	}
}
