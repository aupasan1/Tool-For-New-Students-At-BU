package studentOrientation.plan;

import studentOrientation.store.CostInterface;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public interface DormSelectionInterface extends CostInterface{
	
	/**
	 * Override this method to select a dorm
	 */
	public void selectDorm();
	
	/**
	 * @return attributes
	 */
	public Attributes getAttributes();
}
