package strategy.calculation;

public class Context {
	private CalculationStrategy calculationStrategy;
	
	public void setStrategy(CalculationStrategy calculationStrategy){
		this.calculationStrategy = calculationStrategy;
	}
	
	public void doCalculation(int a, int b){
		this.calculationStrategy.calculate(a, b);
	}
}
