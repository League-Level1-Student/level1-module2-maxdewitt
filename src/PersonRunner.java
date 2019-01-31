
public class PersonRunner {
 public static void main(String[] args) {
	 
	//Bob
	Person bob = new Person();
	bob.setSuperPower("flight");
	bob.setName("Bob");
	String bobName = bob.getName();
	String bobPower = bob.getSuperPower();
	bobName.toString();
	bobPower.toString();
	System.out.println(bobName + "'s power "+ ": " + bobPower);
	
	//Joe
	Person joe = new Person();
	joe.setSuperPower("super strength");
	joe.setName("Joe");
	String joeName = joe.getName();
	String joePower = joe.getSuperPower();
	joeName.toString();
	joePower.toString();
	System.out.println(joeName + "'s power " + ": " + joePower);
	
	//Billy
	Person billy = new Person();
	billy.setSuperPower("super speed");
	billy.setName("Billy");
	String billyName = billy.getName();
	String billyPower = billy.getSuperPower();
	billyName.toString();
	billyPower.toString();
	System.out.println(billyName + "'s power " + ": " + billyPower);
	
}
}
