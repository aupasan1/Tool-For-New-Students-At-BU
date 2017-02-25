package studentOrientation.driver;

import studentOrientation.store.Books;
import studentOrientation.store.CampusTour;
import studentOrientation.store.Course;
import studentOrientation.store.Dorm;
import studentOrientation.store.MyCheckList;
import studentOrientation.store.OrientationChecklist;
import studentOrientation.util.Workshop;
import studentOrientation.util.WorkshopInterface;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public class Driver {
	
	/**
	 * Driver code to run the program
	 * 
	 * @param args the argument set 
	 */
	public static void main(String[] args) {

		if(args.length != 0) {
			System.err.println("Invalid arguments !!");
			System.exit(1);
		}
		
		//Parameters are enums
		OrientationChecklist myCheckList = new MyCheckList(CampusTour.ON_FOOT ,Books.MANDO_BOOKS, Dorm.ADMINISTRATOR_OFFICE, Course.COMPUTER_LAB);
		
		//Workshop constructs the CheckList by putting together the various choices in the right order
		WorkshopInterface shop = new Workshop();
		shop.construct(myCheckList);
		
		//Display the CheckList
		System.out.println(myCheckList);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Driver []";
	}
}