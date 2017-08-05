package _6._7._1;

public class AccountProxy implements Account {

	private AccountImpl actImpl;
	
	public AccountProxy(AccountImpl actImpl) {
		this.actImpl = actImpl;
	}
	
	@Override
	public void queryAccount() {
		System.out.println("ҵ����֮ǰ...");    
		actImpl.queryAccount();
		System.out.println("ҵ����֮��...");  
	}

	@Override
	public void updateAccount() {
		System.out.println("ҵ����֮ǰ...");    
		actImpl.updateAccount();
		System.out.println("ҵ����֮��...");  
	}

}
