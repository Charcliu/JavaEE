package _6._7._1;

public class Simulate {
	public static void main(String[] args) {
		AccountImpl actImpl = new AccountImpl();
		AccountProxy actProxy = new AccountProxy(actImpl);
		actProxy.queryAccount();
		actProxy.updateAccount();
	}
}
