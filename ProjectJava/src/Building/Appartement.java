package Building;

public class Appartement {
private String ID;


 
public Appartement (String I){
	this.ID=I;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
@Override
public String toString() {
	return "Appartement [ID=" + ID + "]";
}
}
