package strategy;


import java.util.Scanner;

import strategy.calculation.Addition;
import strategy.calculation.Context;
import strategy.calculation.Division;
import strategy.calculation.Multiplication;
import strategy.calculation.Subtraction;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter arithmetic operator:");
		String arithmeticOperator = sc.next();
		
		Context ctx = new Context();
		
		if(arithmeticOperator.equals("+")){
			ctx.setStrategy(new Addition());
		}else if(arithmeticOperator.equals("-")){
			ctx.setStrategy(new Subtraction());
		}else if(arithmeticOperator.equals("*")){
			ctx.setStrategy(new Multiplication());
		}else if(arithmeticOperator.equals("/")){
			ctx.setStrategy(new Division());
		}
		
		ctx.doCalculation(a, b);
		
	}
}
