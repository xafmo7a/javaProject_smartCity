package Building;
import Collections.*;
public class Street {
	private String name;
	private String ID;
	private BuildingCollection Buildings;
	public Street (String N , String I){
		this.name=N;
		this.ID=I;
		this.Buildings = new BuildingCollection();
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return this.ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	@Override
	public String toString() {
		return "Street [Name=" + this.name + ", ID=" + ID + "]";
	}
}
