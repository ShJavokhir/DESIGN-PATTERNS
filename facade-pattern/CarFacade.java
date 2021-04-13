import "Car.java";

class CarFacade{
    Car car;

    CarFacade(Car car){
        this.car = car;
    }
    void start(){
        car.checkFuel();
        car.turnOnLights();
        car.startMotor();
        car.turnOnFans();
    }

    void stop(){
        car.stopMotor();
        car.turnOffFans();
        car.turnOffLights();
    }
}