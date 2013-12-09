public class SmartPhone extends MobilePhone {
	private String location;

	public SmartPhone(String brand){
		super(brand);
		location = "London, UK";
	}
	public void browseWeb(String site){
		System.out.println("Taking you to the following site: " + site);
	}
	public String findPosition(){
		return location;
	}
	@Override
	public void call(String number){
		int firstDigit = Integer.parseInt(number.substring(0,1));
		int secondDigit = Integer.parseInt(number.substring(1,2));
		System.out.println("The first two digits of that number are: " + String.valueOf(firstDigit) + String.valueOf(secondDigit));
		if(firstDigit == 0 && secondDigit ==0){
			System.out.println("Calling: " + number + " through the internet to save money!");
		} else {
			super.call(number);
		}
	}
}