package week1day2ass;

public class Car {
	public String applybreak() {
		//System.out.println("applybreak:");
		return "applybreak:";
	}
	public void applygear() {
		System.out.println("applygear:");
		
		
	}
	public void switchOnAc() {
		System.out.println("switchOnAc:");
		
	}
	public void applyAccelerate() {
		System.out.println("applyAccelerate:");
		
	}
	
	public static void main(String[] arg ) {
		System.out.println("car:");

	//classname objname = new constructorname();
	 Car carObj = new Car();
	 carObj.applybreak();
	 System.out.println(""+ carObj.applybreak());
	 carObj.applygear();
	 carObj.switchOnAc();
	 carObj.applyAccelerate();
	   
	}
}
