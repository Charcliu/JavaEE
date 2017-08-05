package _6._7._1;

public class AccountProxy implements Account {

	private AccountImpl actImpl;
	
	public AccountProxy(AccountImpl actImpl) {
		this.actImpl = actImpl;
	}
	
	@Override
	public void queryAccount() {
		System.out.println("业务处理之前...");    
		actImpl.queryAccount();
		System.out.println("业务处理之后...");  
	}

	@Override
	public void updateAccount() {
		System.out.println("业务处理之前...");    
		actImpl.updateAccount();
		System.out.println("业务处理之后...");  
	}

}
