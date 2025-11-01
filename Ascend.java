public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random()*lim);
        int b = (int) (Math.random()*lim);
		int c = (int) (Math.random()*lim);
		int x = Math.min(a,b);
		int num1 = Math.min(x,c);
		int y = Math.max(a,b);
		int num2 = Math.max(y,c);
		int z = a+b+c;
		int i = num1+num2;
		int num3= z-i;
		System.out.println( a + " " + b + " " + c);
		System.out.println(num1 + " " + num3 + " " + num2);
	}
}
