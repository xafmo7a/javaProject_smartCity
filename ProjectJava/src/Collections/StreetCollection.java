package Collections;
import java.util.ArrayList;

import Building.Street;

public class StreetCollection {
	public ArrayList<Street> streets;
	private int n_streets;
	public StreetCollection (){
		this.streets =  new ArrayList<Street>();
		n_streets = 0;
		
	}

	public Street getStreet(String name) {
		for (Street st: streets){
			if(st.getName() == name) return st;
		}
		return null;
	}
	
	public Street getStreet(int index){
		if(index >= n_streets) return null;
		return streets.get(index);
		
	}
	
	

	public void setStreets(ArrayList<Street> streets) {
		this.streets = streets;
	}


	public void setN_streets(int n_streets) {
		this.n_streets = n_streets;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(Street st: streets){
			str.append("Street: " + st.getName() + "\n");
		}
		return str.toString();
	}

	public boolean addStreet(Street S){
		if (streets.contains(S)){
			return false;
		}
			streets.add(S);
		return true;
	}
}
