package studentOrientation.plan;

import studentOrientation.store.CostInterface;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public interface BookStoreInterface extends CostInterface{
	/**
	 * Override this method to buy the books
	 */
	public void buyBooks();
	
	/**
	 * @return attributes
	 */
	public Attributes getAttributes();
}
