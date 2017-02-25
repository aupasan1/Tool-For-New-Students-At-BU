package studentOrientation.plan;

import studentOrientation.store.CostInterface;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public interface CourseRegistrationInterface extends CostInterface {
	/**
	 * Override this method to register for the courses
	 */
	public void register();
	
	/**
	 * @return attributes
	 */
	public Attributes getAttributes();
}
