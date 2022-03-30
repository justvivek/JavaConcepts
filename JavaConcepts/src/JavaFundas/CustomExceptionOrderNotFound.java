package JavaFundas;

class OrderNotFoundException extends RuntimeException{
	public OrderNotFoundException(String message) {
		super(message);
	}
}
public class CustomExceptionOrderNotFound {
	public void getOrder(int id) throws OrderNotFoundException{
		if(id == 101)
			throw new OrderNotFoundException("order id is invalid "+ id);
		else
			System.out.println(id);
	}
	
	public static void main(String[] args) throws OrderNotFoundException {
		CustomExceptionOrderNotFound order = new CustomExceptionOrderNotFound();
		order.getOrder(101);
	}
}
