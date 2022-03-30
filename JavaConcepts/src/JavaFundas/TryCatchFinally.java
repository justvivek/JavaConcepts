package JavaFundas;

public class TryCatchFinally {
	@SuppressWarnings("finally")
	public int m1() {
		try {
			int a=1;
			System.exit(0);//if we exit from here then finally will not execute
			return 1;
		}catch(Exception e) {
			return 2;
		}finally {//finally will always execute unless JVM get codes explicitly by us in try or catch block
			return 3;
		}
	}
	public static void main(String[] args) {
		System.out.println(new TryCatchFinally().m1());
	}
}
