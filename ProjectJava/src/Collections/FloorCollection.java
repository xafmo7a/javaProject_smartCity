package Collections;
import java.util.*;
import Building.*;
public class FloorCollection {
public ArrayList <Floor> floors;
int n_floors;

public FloorCollection(){
	this.floors = new ArrayList<Floor>();
	this.n_floors = n_floors;
	n_floors = 0;
	for (int i=0 ; i<this.n_floors ; i++ ){
		Floor f = new Floor(i);
		this.addFloor(f);
	}
}
public ArrayList<Floor> getFloor() {
	return floors;
}
public void setFloor(ArrayList<Floor> floor) {
	floors = floor;
}
public int getN_Floor() {
	return n_floors;
}
public void setN_Floor(int n_Floor) {
	this.n_floors = n_Floor;
}
public Floor getFloor(int n){
	
	if (n<floors.size())
		return floors.get(n);
else return null;
	
	
}
public boolean addFloor(Floor floor){
	if(floor.getLevel()!=floors.size())return false;
	else {
		return floors.add(floor);
		 
	}
}
}
