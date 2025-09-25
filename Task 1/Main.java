// 1.a

public class Main{

	public static void main(String[] args){

		// 1.g
		Team t1 = new Team("DD");

		// 1.k
		Team t2 = new Team("Blue");
		Team t3 = new Team("Red");
		Team t4 = new Team("Yellow");
		Team t5 = new Team("Green");
		Team t6 = new Team("Orange");

		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());
		System.out.println(t5.toString());
		System.out.println(t6.toString());

		t1.setRank(1);
		t1.addPlayer("Igor");
		t1.addPlayer("John");
		System.out.println(t1.toString());

	}
}