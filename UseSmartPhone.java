public class UseSmartPhone {
	public static void main(String[] args){
		UseSmartPhone uSP = new UseSmartPhone();
		uSP.launch();
	}
	public void launch(){
		MobilePhone myPhone = new SmartPhone("Apple");
		testPhone(myPhone);
		//downcasting to SmartPhone so I can use .findPosition() & .browseWeb()
		SmartPhone dcPhone = (SmartPhone) myPhone;
		dcPhone.browseWeb("www.bbc.co.uk");
		System.out.println("Your location is currently: " + dcPhone.findPosition());
		myPhone.call("0073291");
		myPhone.ringAlarm("Don't forget your swimming togs");
		myPhone.playGame("Scrabble");
		myPhone.addLastNum(12354);
		myPhone.addLastNum(45445);
		myPhone.addLastNum(666664);
		myPhone.addLastNum(79999);
		myPhone.printLastNumbers();
		myPhone.call("663291");
		System.out.println("Your phone is a "+ myPhone.getBrand());
	}
	public void testPhone(Phone testPh){
		SmartPhone tp = (SmartPhone) testPh;
		tp.browseWeb("www.guardian.co.uk");
		System.out.println("Your location is currently: " + tp.findPosition());
		tp.call("00286644");
		tp.ringAlarm("Don't forget your gym gear");
		tp.playGame("Cricket");
		tp.addLastNum(33411);
		tp.addLastNum(52537);
		tp.addLastNum(92753);
		tp.addLastNum(98763);
		tp.printLastNumbers();
		tp.call("23485");
		System.out.println("Your phone is a "+ tp.getBrand());
	}
}