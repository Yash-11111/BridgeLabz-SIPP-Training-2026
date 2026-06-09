import java.util.*;
public class EarthVolume{
	public static void main(String args[]){
		double radiusKm = 6378;
		
		double volumeKm = (4.0/3.0)*Math.PI*Math.pow(radiusKm,3);
		
		double volumemiles = volumeKm / math.pow(1.6,3);
		
		System.out.println("volume of earth in km "+ volumeKm + "and cubic in miles"+ volumemiles );
		
}
}