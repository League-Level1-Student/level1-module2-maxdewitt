
public class SmurfRunner {
	public static void main(String[] args) {
		
	
Smurf handysmurf = new Smurf("Handy");
String handyname = handysmurf.getName();
System.out.println(handyname);
String handyhat = handysmurf.getHatColor();
System.out.println("Hat Color: " + handyhat);
String handyIsGirlOrBoy = handysmurf.isGirlOrBoy();
System.out.println(handyIsGirlOrBoy);
System.out.println("--------------");

Smurf papasmurf = new Smurf("Papa");
String papaname = papasmurf.getName();
System.out.println(papaname);
String papahat = papasmurf.getHatColor();
System.out.println("Hat Color: " + papahat);
String papaIsGirlOrBoy = papasmurf.isGirlOrBoy();
System.out.println(papaIsGirlOrBoy);
System.out.println("--------------");

Smurf smurfettesmurf = new Smurf("Smurfette");
String smurfettename = smurfettesmurf.getName();
System.out.println(smurfettename);
String smurfettehat = smurfettesmurf.getHatColor();
System.out.println("Hat Color: " + papahat);
String smurfetteIsGirlOrBoy = smurfettesmurf.isGirlOrBoy();
System.out.println(smurfetteIsGirlOrBoy);
System.out.println("--------------");
}
}
