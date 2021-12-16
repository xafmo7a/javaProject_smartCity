package Building;


import Collections.*;
public class Floor {
private int level;
private AppartmentCollection appartements;
public Floor(int lvl){
	this.level=lvl;
	this.appartements =new AppartmentCollection();
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
@Override
public String toString() {
	return "Floor [level=" + level + "]";
}

}
