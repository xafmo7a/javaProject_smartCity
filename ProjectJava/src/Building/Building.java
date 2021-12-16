package Building;

import Collections.*;

public class Building  {
	private String ID;
	private BuildingType BuildingT;
	private FloorCollection floors;
	private int n_floors;
	public Building (String I , String BT , int n_floors){
		this.ID=I;
		this.n_floors=n_floors;
		setBuildingT(BT);
		this.floors=new FloorCollection();
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public BuildingType getBuildingT() {
		return BuildingT;
	}
	public void setBuildingT(String bT) {
		 if (bT.equalsIgnoreCase(BuildingType.RESIDENTIAL.name())
	                || bT.equalsIgnoreCase(BuildingType.INSTENTIAL.name())
	                || bT.equalsIgnoreCase(BuildingType.BUSINESS.name())
	                || bT.equalsIgnoreCase(BuildingType.INDUSTRIAL.name())) {
			 bT = bT.toUpperCase();
	            this.BuildingT = BuildingType.valueOf(bT);
	}}
	@Override
	public String toString() {
		return "Building [ID=" + ID + ", BuildingT=" + BuildingT + "]";
	}
	

	
}
