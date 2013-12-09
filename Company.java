public class Company {
	public static void main(String[] args){
		Company myBiz = new Company();
		myBiz.launch();
	}
	public void launch(){
		DoubleLinkList<String> employeeNames = new GenericDLList<String>();
		DoubleLinkList<Integer> nationalInsuranceNum = new GenericDLList<Integer>();
		employeeNames.addElement("Andrew");
		employeeNames.addElement("Laura");
		employeeNames.addElement("Heather");
		employeeNames.addElement("Kate");
		employeeNames.addElement("Ken");
		employeeNames.addElement("Lynette");
		nationalInsuranceNum.addElement(12345);
		nationalInsuranceNum.addElement(65432);
		nationalInsuranceNum.addElement(77486);
		nationalInsuranceNum.addElement(45637);
		nationalInsuranceNum.addElement(89076);
		nationalInsuranceNum.addElement(35156);
		nationalInsuranceNum.addElement(76375);
		nationalInsuranceNum.addElement(16898);
		employeeNames.printList();
		nationalInsuranceNum.printList();
		System.out.println("The number of employees in the list is: " + employeeNames.listLength());
		System.out.println("The number of National Insurance Numbers in the list is: " + nationalInsuranceNum.listLength());
		if(employeeNames.deleteElement("Kate")){
			System.out.println("Kate was deleted from the employee list");
		} else {
			System.out.println("Kate was NOT deleted from the employee list");
		}
		if(nationalInsuranceNum.deleteElement(89076)){
					System.out.println("89076 was deleted from the National Insurance Number list");
				} else {
					System.out.println("89076 was NOT deleted from the National Insurance Number list");
		}

		employeeNames.printList();
		nationalInsuranceNum.printList();
		System.out.println("The number of employees in the list is: " + String.valueOf(employeeNames.listLength()));
		System.out.println("The number of National Insurance Numbers in the list is: " + String.valueOf(nationalInsuranceNum.listLength()));
	}

}