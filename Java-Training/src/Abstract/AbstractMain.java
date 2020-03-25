package Abstract;

public class AbstractMain extends AbstractExample {

	public static void main(String[] args) {
	
		
	AbstractMain a = new AbstractMain();	
	a.credit();
	a.debit();
	a.loan();
		
	}

	@Override
	public void debit() {
		
		System.out.println(100);
		
	}

	
	
	@Override
	public void credit() {
		
		System.out.println(500);
	}

}

	
