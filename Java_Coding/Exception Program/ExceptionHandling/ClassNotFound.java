package Exception;

public  class ClassNotFound {

	public static void main(String[] args)throws Exception {
		
	try {

		Class.forName("com.interview.exception.myclass");
		//Class.forName("Exception.ClassNotFound");
	}
	 catch(ClassNotFoundException e)
	 {
		 e.printStackTrace();
	 }
	}

}
