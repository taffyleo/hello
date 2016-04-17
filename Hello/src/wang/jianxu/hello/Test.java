package wang.jianxu.hello;

public class Test {
	public static void main(String[] args) {
		Humanbeing liushizhen = new Humanbeing();
		liushizhen.age = 25;
		liushizhen.height = 170;
		liushizhen.weight = 130;
		liushizhen.firstName = "石镇";
		liushizhen.lastName  ="王";
		liushizhen.act();
		
		
		Humanbeing jiangmuyan = new Humanbeing();
		jiangmuyan.age = 35;
		jiangmuyan.country="Korean";
		jiangmuyan.height = 160;
		jiangmuyan.weight = 90;
		jiangmuyan.firstName="慧桥";
		jiangmuyan.lastName = "宋";
		
		
		jiangmuyan.act();
		
		
		
		
		for (int i = 0; i < 100; i++) {
			Humanbeing fish = new Humanbeing();
			fish.age = i;
			fish.height=i/100;
			fish.weight=i*2;
			fish.lastName = "fish"+i;
			
			fish.act();
		}
		
		
	}
}
