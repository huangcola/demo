package GIT;

import java.util.ArrayList;
import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.util.Map;
import java.util.Properties;
public class ParkingSystem implements IParking{
	private int big;
	private int medium;
	private int small;
	public ParkingSystem(int big,int medium,int small){
     this.big=big;
	this.medium=medium;
	this.small=small;
	}
	@Override
		public boolean addCar(int carType){
			if(carType==1) {
				if(big>0) {
					big--;
					return true;
				}
				}
				 if(carType==2) {
					if(medium>0) {
						medium--;
						return true;					
				}			
			}			
				 if(carType==3) {
					if(small>0) {
						small--;
						return true;
					}
					
				}return false;
		}
		public void print() {
			System.out.println("输入要输出的内容即可");
		}
public static void main(String[] args) throws Exception{
	for (int i=0;i<args.length; i++) {
		IParking.planParking.add(Integer.parseInt(args[i]));
	}
	IParams iparams =IParking.parse();
	
	ParkingSystem parkingSystem =new ParkingSystem(iparams.getbig(), iparams.getmedium(),iparams.getsmall());
	
	System.out.println(parkingSystem.addCar(1));
	System.out.println(parkingSystem.addCar(2));
	System.out.println(parkingSystem.addCar(3));
	System.out.println(parkingSystem.addCar(1));
	parkingSystem.print();
}
		

}

