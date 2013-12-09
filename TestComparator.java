public class TestComparator {
	public static void main(String[] args){
		TestComparator tc = new TestComparator();
		tc.launch();
	}
	public void launch(){
		Comparator<String> strComp = new Comparator<String>();
		System.out.println(strComp.getMax("345","375"));
		Comparator<Integer> intComp = new Comparator<Integer>();
		System.out.println(intComp.getMax(34,44));
		Comparator<Double> doubleComp = new Comparator<Double>();
		System.out.println(doubleComp.getMax(984.556,332.998));
	}
}