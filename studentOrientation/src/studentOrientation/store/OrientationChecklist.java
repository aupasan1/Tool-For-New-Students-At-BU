package studentOrientation.store;

import studentOrientation.plan.BookStoreInterface;
import studentOrientation.plan.CourseRegistrationInterface;
import studentOrientation.plan.DormSelectionInterface;
import studentOrientation.plan.TourInterface;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public abstract class OrientationChecklist {

	/**
	 * @return tour
	 */
	public abstract TourInterface getTour();

	/**
	 * @param tour the tour to set
	 */
	public abstract void setTour(TourInterface tour);

	/**
	 * @return the dormSelection
	 */
	public abstract DormSelectionInterface getDormSelection();

	/**
	 * @param dormSelection the dormSelection to set
	 */
	public abstract void setDormSelection(DormSelectionInterface dormSelection);

	/**
	 * @return the courseRegistration
	 */
	public abstract CourseRegistrationInterface getCourseRegistration();

	/**
	 * @param courseRegistration the courseRegistration to set
	 */
	public abstract void setCourseRegistration(CourseRegistrationInterface courseRegistration);

	/**
	 * @return book 
	 */
	public abstract BookStoreInterface getBookStore();

	/**
	 * @param bookStore the bookStore to set
	 */
	public abstract void setBookStore(BookStoreInterface bookStore);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrientationChecklist []";
	}
}
