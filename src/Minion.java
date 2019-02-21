
public class Minion {
	String name; 
	int eyes;
	String color;
	String master;
Minion(String name , int eyes, String color, String master){
	this.name = name;
	this.eyes = eyes;
	this.color = color;
	this.master = master;
}
public String getName() {
	return name;
}
public String getColor() {
	return color;
}
public String getMaster() {
	return master;
}
public int getEyes() {
	return eyes;
}
void setMaster(String masterValue) {
	master = masterValue;
}
}
