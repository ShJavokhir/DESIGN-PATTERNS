package factory_method.cars;

public class CarFactory {
	public Car getCar(String companyName){
		if(companyName.equals("CHEVROLET")){
			return new Chevrolet();
		}else if(companyName.equals("MERCEDES")){
			return new Mercedes();
		}else if(companyName.equals("ROLLSROYCE")){
			return new RollsRoyce();
		}else{
			// :D
			return new UzAM();
		}
	}
}
