package strategy.calculation;

public class Division implements CalculationStrategy{
	public void calculate(int a, int b){
		System.out.println(a*1.0/b);
	}
}
