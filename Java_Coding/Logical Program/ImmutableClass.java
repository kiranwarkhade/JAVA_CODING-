
public final class ImmutableClass {

	private final int id;
	private final String name;
	
	public ImmutableClass(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		
		  ImmutableClass t=new ImmutableClass(5, "Kiran");	  
		System.out.println(t.getId());
		System.out.println(t.getName());

	}

}
