package MyPracticeJava;

class SrManager{
	
	protected String deptName = "IT";
	
	protected void m1(){
		System.out.println(deptName);
	}
	
	void processData(){
		deptName = "NetWorking";
		System.out.println(deptName);
	}
	
	public void resetValue(){
		deptName = "IT";
		System.out.println(deptName);
	}
}
