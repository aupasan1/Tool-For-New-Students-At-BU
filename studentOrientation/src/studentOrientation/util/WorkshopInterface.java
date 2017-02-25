/**
 * 
 */
package studentOrientation.util;

import studentOrientation.store.OrientationChecklist;


/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public interface WorkshopInterface {

	/** 
	 * Override this method to calculate the checklist
	 * @param checkList the ChekList to create
	 */
	public void construct(OrientationChecklist checkList);
}
