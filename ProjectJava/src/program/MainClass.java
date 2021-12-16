package program;
import user.*;
import account.*;
import Building.*;
import Collections.*;
import GUI.loginn;
import GUI.registration;
import sensors.*;
public class MainClass {

	public static AccountCollection accounts;
	public static BuildingCollection buildings;
	public static StreetCollection streets;
	public static AppartmentCollection appart;
	public static FloorCollection floor;
	public static void main(String[] args) {
		accounts = new AccountCollection();
		Account admin = new Account("admin","admin");
		accounts.addAccount(admin);	
		User admiin = new User("h123" , "hachem" ,"hachembouhamidi@gmail.com" , 671939906);
		admin.setUser(admiin);
		admin.setAdmin();
		buildings = new BuildingCollection();
		streets = new StreetCollection();
		appart = new AppartmentCollection();
		floor = new FloorCollection();
		Building bldg1 = new Building ("Bldg1" , "RESIDENTIAL" ,4);
		Building bldg2 = new Building ("Bldg2" , "INSTENTIAL" ,2);
		Building bldg3 = new Building ("Bldg3" , "BUSINESS" ,3);
		Building bldg4 = new Building ("Bldg4" , "INDUSTRIAL" ,5);
		buildings.addBuilding(bldg1);
		buildings.addBuilding(bldg2);
		buildings.addBuilding(bldg3);
		buildings.addBuilding(bldg4);
		
		Street str1 = new Street ("streetA" , "str1");
		Street str2 = new Street ("streetb" , "str2");
		Street str3 = new Street ("streetc" , "str3");
		Street str4 = new Street ("streetd" , "str4");
		streets.addStreet(str1);
		streets.addStreet(str2);
		streets.addStreet(str3);
		streets.addStreet(str4);
		
		Appartement appat1 = new Appartement ("A1");
		Appartement appat2 = new Appartement ("A1");
		Appartement appat3 = new Appartement ("A1");
		Appartement appat4 = new Appartement ("A1");
		appart.addAppartement(appat1);
		appart.addAppartement(appat2);
		appart.addAppartement(appat3);
		appart.addAppartement(appat4);
		
		Floor F0 = new Floor (0);
		Floor F1 = new Floor (1);
		Floor F2= new Floor (2);
		Floor F3 = new Floor (3);
		floor.addFloor(F0);
		floor.addFloor(F1);
		floor.addFloor(F2);
		floor.addFloor(F3);

		
		loginn frame = new loginn();
		frame.setVisible(true);

	}

}
