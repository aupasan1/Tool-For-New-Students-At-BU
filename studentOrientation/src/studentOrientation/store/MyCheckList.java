package studentOrientation.store;

import studentOrientation.plan.AdministratorOffice;
import studentOrientation.plan.BookStoreInterface;
import studentOrientation.plan.BusRide;
import studentOrientation.plan.ComputerLab;
import studentOrientation.plan.CourseRegistrationInterface;
import studentOrientation.plan.DormSelectionInterface;
import studentOrientation.plan.MandoBooks;
import studentOrientation.plan.OnFoot;
import studentOrientation.plan.OnlineContest;
import studentOrientation.plan.RegistrarOffice;
import studentOrientation.plan.TourInterface;
import studentOrientation.plan.UniversityBookStore;
import studentOrientation.util.DebugLevel;
import studentOrientation.util.Logger;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public class MyCheckList extends OrientationChecklist{
	
	private float totalTime;
	private float totalCost;
	private float totalEffort;
	private float totalCarbonFootprint;
	
	private BookStoreInterface bookStore;
	private TourInterface tour;
	private DormSelectionInterface dormSelection;
	private CourseRegistrationInterface courseRegistration;

	private int DEBUG_VALUE;
		
	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked
	 * 
	 * @param campusTourIn the tour to set
	 * @param booksIn the book store to set
	 * @param dormIn the dorm to set
	 * @param courseIn the course method to set
	 */
	
	public MyCheckList(CampusTour campusTourIn, Books booksIn, Dorm dormIn, Course courseIn) {
	
		CampusTour campusTour = campusTourIn;
		Books books = booksIn;
		Dorm dorm = dormIn;
		Course course = courseIn;

		totalTime = 0;
		totalCost = 0;
		totalEffort = 0;
		totalCarbonFootprint = 0;

		DEBUG_VALUE = 0;
		Logger.setDebugValue(DEBUG_VALUE);
		
		Logger.writeMessage("Constructor of CheckList class", DebugLevel.CONSTRUCTOR);

		switch (campusTour) {
		case BUS:
			tour = new BusRide();
			break;
		case ON_FOOT:
			tour = new OnFoot();
			break;
		}

		switch (books) {
		case UNIVERSITY_BOOK_STORE:
			bookStore = new UniversityBookStore();
			break;
		case MANDO_BOOKS:
			bookStore = new MandoBooks();
			break;
		}
		
		switch (dorm) {
		case ADMINISTRATOR_OFFICE:
			dormSelection = new AdministratorOffice();
			break;
		case ONLINE_CONTEST:
			dormSelection = new OnlineContest();
			break;
		}
		
		switch (course) {
		case COMPUTER_LAB:
			courseRegistration = new ComputerLab();
			break;
		case REGISTRAR_OFFICE:
			courseRegistration = new RegistrarOffice();
			break;
		}
	}

	/**
	 * This method prints the check list for the student 
	 */
	public void getCheckList() {
		
		totalTime = tour.getAttributes().getTime() + bookStore.getAttributes().getTime() + courseRegistration.getAttributes().getTime() + dormSelection.getAttributes().getTime();
		totalCost = tour.getAttributes().getCost() + bookStore.getAttributes().getCost() + courseRegistration.getAttributes().getCost() + dormSelection.getAttributes().getCost();
		totalCarbonFootprint = tour.getAttributes().getCarbonFootprint() + bookStore.getAttributes().getCarbonFootprint() + courseRegistration.getAttributes().getCarbonFootprint() + dormSelection.getAttributes().getCarbonFootprint();
		totalEffort = tour.getAttributes().getEffort() + bookStore.getAttributes().getEffort() + courseRegistration.getAttributes().getEffort() + dormSelection.getAttributes().getEffort();
 		
		if(DEBUG_VALUE == 1) {
			System.out.println("Campus Tour[" + "Time = " + tour.getAttributes().getTime() + " minutes, Cost = $" + tour.getAttributes().getCost() + ", Effort = " + tour.getAttributes().getEffort() + " calories, Carbon Footprint =  " + tour.getAttributes().getCarbonFootprint() + " tonnes]");
			System.out.println("Book Store[" + "Time = " + bookStore.getAttributes().getTime() + " minutes, Cost = $" + bookStore.getAttributes().getCost() + ", Effort = " + bookStore.getAttributes().getEffort() + " calories, Carbon Footprint = " + bookStore.getAttributes().getCarbonFootprint() + " tonnes]");
			System.out.println("Dorm Selection[" + "Time = " + dormSelection.getAttributes().getTime() + " minutes, Cost = $" + dormSelection.getAttributes().getCost() + ", Effort = " + dormSelection.getAttributes().getEffort() + " calories, Carbon Footprint = " + dormSelection.getAttributes().getCarbonFootprint() + " tonnes]");
			System.out.println("Course Registration[" + "Time = " + courseRegistration.getAttributes().getTime() + " minutes, Cost = $" + courseRegistration.getAttributes().getCost() + ", Effort = " + courseRegistration.getAttributes().getEffort() + " calories, Carbon Footprint = " + courseRegistration.getAttributes().getCarbonFootprint() + " tonnes]");
		}
	}
	
	/**
	 * @return book store object
	 */
	@Override
	public BookStoreInterface getBookStore() {
		return bookStore;
	}

	/**
	 * @param bookStoreIn the book store to set
	 */
	@Override
	public void setBookStore(BookStoreInterface bookStoreIn) {
		bookStore = bookStoreIn;
	}

	/**
	 * * @return tour object
	 */
	@Override
	public TourInterface getTour() {
		return tour;
	}

	/**
	 * @param tourIn the tour to set
	 */
	@Override
	public void setTour(TourInterface tourIn) {
		tour = tourIn;
	}
	
	/**
	 * @return dorm object
	 */
	@Override
	public DormSelectionInterface getDormSelection() {
		return dormSelection;
	}

	/**
	 * @param dormSelectionIn the dorm to set
	 */
	@Override
	public void setDormSelection(DormSelectionInterface dormSelectionIn) {
		dormSelection = dormSelectionIn;
	}

	/**
	 * @return book store object
	 */
	@Override
	public CourseRegistrationInterface getCourseRegistration() {
		return courseRegistration;
	}

	/**
	 * @param courseRegistrationIn the course registration to set
	 */
	@Override
	public void setCourseRegistration(CourseRegistrationInterface courseRegistrationIn) {
		courseRegistration = courseRegistrationIn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		getCheckList();
		
		return String.format("CheckList[Time = %d minutes, Cost = $%.2f, Carbon Footprint = %.2f tonnes, Effort = %.2f calories]", (int)totalTime,totalCost,totalCarbonFootprint,totalEffort);
	}
}