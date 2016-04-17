package wang.jianxu.hello;

public class Adapter {
	public int inV;
	public int inA;
	public int outV;
	public int outA;
	public void in(){
		System.out.println("Input V"+inV);
		System.out.println("Input A"+inA);
	};
	public void out(){
		System.out.println("Output V"+outV);
		System.out.println("Output A"+outA);
	};
}
