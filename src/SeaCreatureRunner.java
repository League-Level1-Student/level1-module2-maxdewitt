import javax.swing.JOptionPane;

public class SeaCreatureRunner {
public static void main(String[] args) {
	
	//Spongebob
	SeaCreature spongebob = new SeaCreature("spongebob");
	spongebob.eat();
	spongebob.laugh();
	
	//Squidward
	SeaCreature squidward = new SeaCreature("squidward");
	String squidName = squidward.getName();
	JOptionPane.showMessageDialog(null, "Hi! " + squidName + ".");
	squidward.eat();
	squidward.laugh();
	
	//Patrick
	SeaCreature patrick = new SeaCreature("patrick");
	String patName = patrick.getName();
	JOptionPane.showMessageDialog(null, "Hi! " + patName + ".");
	patrick.eat();
	patrick.laugh();
}
}
