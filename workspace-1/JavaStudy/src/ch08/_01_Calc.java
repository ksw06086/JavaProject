package ch08;

public abstract class _01_Calc implements _01_CalcImpl{
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}
}
