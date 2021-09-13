package GIT;
import java.util.ArrayList;
public interface IParking {
static ArrayList<Integer>planParking =new ArrayList<>();
void print();
boolean addCar(int carType);
public static IParams parse() throws Exception{
	return new IParams() {
		@Override
		public int getbig() {
			// TODO Auto-generated method stub
			return Integer.parseInt(System.getProperty("big"));
		}

		@Override
		public int getmedium() {
			// TODO Auto-generated method stub
			return Integer.parseInt(System.getProperty("medium"));
		}

		@Override
		public int getsmall() {
			// TODO Auto-generated method stub
			return Integer.parseInt(System.getProperty("small"));
		}

		@Override
		public ArrayList<Integer> getPlanParking() {
			// TODO Auto-generated method stub
			return planParking;
		}
};
}
}