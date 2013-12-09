public class MobilePhone extends OldPhone {
	private int[] lastNums;
	public MobilePhone(String brand){
		super(brand);
		lastNums = new int[10];
		for(int i=0;i<10;i++){
			lastNums[i] = 0;
		}
	}
	public void ringAlarm(String alarm){
		System.out.println("ALARM!!! " + alarm);
	}
	public void playGame(String game){
		System.out.println("Game is: " + game);
	}
	public void addLastNum(int num){
		//if array is not full
		for(int i=0;i<10;i++){
			if(lastNums[i] == 0){
				lastNums[i] = num;
				return;
			}
		}
		//if array is full already
		for(int i=0;i<9;i++){
			lastNums[i] = lastNums[i+1];
		}
		lastNums[9] = num;
	}
	public void printLastNumbers(){
		for(int i=0;i<10;i++){
			if(lastNums[9-i] != 0){
				System.out.println(String.valueOf(lastNums[9-i]));
			}
		}
	}
}