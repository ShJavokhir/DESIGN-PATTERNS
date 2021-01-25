//Note that this code runned in first attempt :)
//25.01.2021 11:26

package factory_method;

import java.util.Scanner;

import factory_method.cars.Car;
import factory_method.cars.CarFactory;

public class CarCompanyInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String companyName = sc.next();
		CarFactory carFactory = new CarFactory();
		
		Car car = carFactory.getCar(companyName);
		
		System.out.println(car.about());
		
		sc.close();
	}
}
