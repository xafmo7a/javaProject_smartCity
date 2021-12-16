package sensors;
import java.util.*;		
public class Sensors {
private float minTemp;
private float maxTemp;
private float minHumidity;
private float maxHumidity;
private int motion;
private int noMotion;
private Random r;

public Sensors (){
	
	minTemp = 0;
	maxTemp = 30;
	minHumidity = 0;
	maxHumidity = 100;
	motion = 1;
	noMotion = 0;
}
public float getRandom_Temp(float minTemp , float maxTemp){
	float RandomTemp = (float)Math.floor(Math.random()*(maxTemp-minTemp+1)+minTemp);
	return RandomTemp;
	
}
public float getRandom_Humidity(float minHumidity , float maxHumidity){
	float RandomHum = (float)Math.floor(Math.random()*(maxHumidity-minHumidity+1)+minHumidity);
	return RandomHum;

}
public int getRandom_Motion ( int motion ){
		int IsThereaMotion = r.nextInt(motion);
		return IsThereaMotion;
}}
