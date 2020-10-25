package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Student studentE = new Student("Edward", 20000);
		
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(3);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();

		Taxi incheonTaxi= new Taxi("incheon");
		studentE.takeTaxi(incheonTaxi, 10000);
		
		studentE.showInfo();
		incheonTaxi.showInfo();
		
	}

}
