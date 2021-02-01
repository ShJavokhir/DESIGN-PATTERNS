package strategy.calculation;

public class Addition implements CalculationStrategy{
	public void calculate(int a, int b){
		System.out.println(a+b);
	}
}
