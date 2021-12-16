package Collections;
import Building.Building;
import java.util.*;

public class BuildingCollection{
	public ArrayList<Building> Building;
	
public BuildingCollection (){
	this.Building= new ArrayList<>();
	
}

public ArrayList<Building> getBuilding() {
	return Building;
}

public void setBuilding(ArrayList<Building> building) {
	Building = building;
}

@Override
public String toString() {
	return Building.toString();
}


public boolean addBuilding(Building B){
	if (Building.contains(B)){
		return false;
	}
	Building.add(B);
	return true;
}
public Building seebuilding(Building k){
	Iterator<Building> b = Building.iterator();
	while (b.hasNext()){
		return b.next();
	}
	return null;
}

}
