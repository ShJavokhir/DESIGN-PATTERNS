/*
    Code written by Javokhir Shomuratov
    13-april 2021, 12:28
    Facade pattern hides complex actions from client
    For example in the example below we hide car starting and stopping process from client by using CarFacade.java

    NOTE THAT i could not run this app because I had problems while installing java on my mac. 
    So you can expect some errors :P

*/


import "Car.java";
import "CarFacade.java";

class Main{
    public static void main(String args[]){
        CarFacade carFacade = new CarFacade(new Car());
        carFacade.startMotor();
        System.out.println("----------------------");
        carFacade.stopMotor();
    }
}