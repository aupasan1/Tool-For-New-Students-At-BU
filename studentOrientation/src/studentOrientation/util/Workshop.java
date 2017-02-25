package studentOrientation.util;

import studentOrientation.store.OrientationChecklist;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public class Workshop implements WorkshopInterface {

	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked 
	 */
	public Workshop() {
		Logger.writeMessage("Constructor of Workshop class", DebugLevel.CONSTRUCTOR);
	}

	/* (non-Javadoc)
	 * @see studentOrientation.util.WorkshopInterface#construct(studentOrientation.store.CheckList)
	 */
	@Override
	public void construct(OrientationChecklist myCheckListIn) {
		OrientationChecklist myCheckList = myCheckListIn;
		
		myCheckList.getTour().takeTour();
		myCheckList.getBookStore().buyBooks();
		myCheckList.getDormSelection().selectDorm();
		myCheckList.getCourseRegistration().register();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Workshop []";
	}	
}