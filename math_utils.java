public class MathUtils {
	public static int add(int... numbers) {
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum;
}
public static double divide(int a, int b) {
    if (b == 0) throw new IllegalArgumentException("División por cero no permitida");
    return (double) a / b;
}
