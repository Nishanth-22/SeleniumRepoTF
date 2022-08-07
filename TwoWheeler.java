/**
 * 
 */
package week1.day1;

/**
 * @author nishanths
 *
 */
public class TwoWheeler {
	
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber =893993999l;
	boolean isPunctured = true;
	String bikeName = "TVS Raider";
	double runningKM = 20000;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler bike = new TwoWheeler();
		System.out.println(bike.noOfWheels+ " "+bike.noOfMirrors+ " "+bike.chassisNumber+" "+bike.isPunctured+" "+bike.bikeName+" "+bike.runningKM);
		

	}

}
