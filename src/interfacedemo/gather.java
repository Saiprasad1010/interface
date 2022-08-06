package interfacedemo;

public class gather implements car,motorcycle,bicycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void bicyclerun() {
		// TODO Auto-generated method stub
		System.out.println("Avg Speed of bicycle is 30km/hr");
	}

	@Override
	public void bicyclewheel() {
		// TODO Auto-generated method stub
		System.out.println("total wheels in bicycle are 2");
	}

	@Override
	public void bicycleprice() {
		// TODO Auto-generated method stub
		System.out.println("total MRP of bicycle is 15000 Rs");
	}

	@Override
	public void motorcyclerun() {
		// TODO Auto-generated method stub
		System.out.println(" Avg speed of motorcycle is 80km/hr");
	}

	@Override
	public void motorcyclewheel() {
		// TODO Auto-generated method stub
		System.out.println("Total number of wheels for motorcycle are 2");
	}

	@Override
	public void motorcycleprice() {
		// TODO Auto-generated method stub
		System.out.println("Total MRP of motorcycle is 95000 Rs");
	}

	@Override
	public void carrun() {
		// TODO Auto-generated method stub
		System.out.println("Avg speed of car is 100 km/hr");
	}

	@Override
	public void carwheel() {
		// TODO Auto-generated method stub
		System.out.println("Total wheels in car is 4");
	}

	@Override
	public void carprice() {
		// TODO Auto-generated method stub
		System.out.println("Total MRP price of car is 600000 Rs");
	}

}
