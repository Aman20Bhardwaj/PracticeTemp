package MyPracticeJava;

public class Manager  extends SrManager{
	void test(){
		SrManager srManager = new SrManager();
		srManager.m1();  // IT
		srManager.processData(); //Networking
		srManager.resetValue(); //IT
	}
	public void main(String[] args) {
		SrManager mng = new SrManager();
		mng.m1(); 
		mng.processData();
 		mng.resetValue(); 
	}
	
	
//	static void test5(){
//		SrManager mng = new SrManager();
//		mng.m1(); 
//		mng.processData();
// 		mng.resetValue(); 
//	}
	
//	static void test4(){
//		Manager mng = new Manager();
//		mng.m1(); 
//		mng.processData();
// 		mng.resetValue(); 
//	}
//	
//	static void test3(){
//		m1(); //CE
//		processData(); //CE
// 		resetValue(); // CE
//	}
//	
//	void test2(){
//		m1();
//		processData();
//		resetValue();
//	}
//	
//	void test1(){
//		Manager srManager = new Manager();
//		srManager.m1();
//		srManager.processData();
//		srManager.resetValue();
//	}
//	
//	void test(){
//		SrManager srManager = new SrManager();
//		srManager.m1();
//		srManager.processData();
//		srManager.resetValue();
//	}
}
