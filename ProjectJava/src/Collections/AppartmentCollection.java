package Collections;
import java.util.ArrayList;
import java.util.Iterator;

import Building.Appartement;
public class AppartmentCollection {
public ArrayList <Appartement> appartement;
public int n_appartement;
	public AppartmentCollection (){
		this.appartement= new ArrayList<Appartement>();
		n_appartement = 0;
		
	}
	public Appartement getAppartement(String ID) {
		for (Appartement st : appartement){
			if(st.getID()==ID){
				return st;
			}
				
		}
		return null;
	}
	public void setAppartement(ArrayList<Appartement> appartement) {
		this.appartement = appartement;
	}
	public Appartement getn_Appartement(int index){
		if(index >= n_appartement) return null;
		return appartement.get(index);
		
	}
	
	
	public void setN_appartement(int n_appartement) {
		this.n_appartement = n_appartement;
	}
	public boolean addAppartement(Appartement appartememt){
		Iterator<Appartement> app = appartement.iterator();
		String g =appartememt.getID();
		while(app.hasNext()){
		if(g==app.next().getID())
			return false;
	}
		return appartement.add(appartememt);
}
}
