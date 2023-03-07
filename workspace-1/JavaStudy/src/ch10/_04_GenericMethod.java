package ch10;

public class _04_GenericMethod {
	public static <T, V> double value(_04_Point<T, V> p1, _04_Point<T, V> p2) {
		double top = ((Number)p1.getX()).doubleValue();
		double left = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getX()).doubleValue();
		double right = ((Number)p2.getY()).doubleValue();
		System.out.println(top);
		System.out.println(left);
		System.out.println(bottom);
		System.out.println(right);
		double width = right - left;
		double height = bottom - top;
		return width*height;
	}
	public static void main(String[] args) {
		_04_Point<Integer, Double> p1 = new _04_Point<Integer, Double>(0,  0.0);
		_04_Point<Integer, Double> p2 = new _04_Point<Integer, Double>(10,  10.0);
		double rect = value(p1,p2);
	}
}
