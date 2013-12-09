public class OldPhone implements Phone {
	private String brand = null;

	public OldPhone(String brand){
		this.brand = brand;
	}
	/**
	* Just print on the screen: "Calling <number>...".
	*/
	public void call(String number){
		System.out.println("Calling: " + number);
	}
	public String getBrand(){
		return brand;
	}
}
