package studentOrientation.plan;

import studentOrientation.store.CarbonFootprintInterface;
import studentOrientation.store.Constants;
import studentOrientation.store.CostInterface;
import studentOrientation.store.EffortInterface;
import studentOrientation.store.TimeInterface;
import studentOrientation.util.DebugLevel;
import studentOrientation.util.Logger;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public class MandoBooks implements BookStoreInterface, TimeInterface, CostInterface, CarbonFootprintInterface, EffortInterface {

	private Attributes attributes;
	
	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked
	 */
	public MandoBooks() {
		attributes = new Attributes();
		
		Logger.writeMessage("Constructor of MandoBooks class", DebugLevel.CONSTRUCTOR);
	}

	/* (non-Javadoc)
	 * @see studentOrientation.plan.BookStoreInterface#buyBooks()
	 */
	@Override
	public void buyBooks() {
		calculateTimeInMinutes();
		calculateCostInDollars();
		calculateCarbonFootprintInTonnes();
		calculateEffortInCalories();
		
		Logger.writeMessage("Entry added to Results", DebugLevel.RESULT);
	}

	/* (non-Javadoc)
	 * @see studentOrientation.store.TimeInterface#calculateTime()
	 */
	@Override
	public void calculateTimeInMinutes() {
		attributes.setTime(Constants.MANDO_BOOKS_TIME);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CostInterface#calculateCost()
	 */
	@Override
	public void calculateCostInDollars(){
		BookStoreInterface book = new UniversityBookStore();
		book.calculateCostInDollars();
		float cost = book.getAttributes().getCost();
		attributes.setCost(((5 * cost)/100) + cost);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CarbonFootprintInterface#calculateCarbonFootprint()
	 */
	@Override
	public void calculateCarbonFootprintInTonnes() {
		attributes.setCarbonFootprint(Constants.MANDO_BOOKS_CARBON_FOOTPRINT);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.EffortInterface#calculateEffort()
	 */
	@Override
	public void calculateEffortInCalories() {
		attributes.setEffort(Constants.MANDO_BOOKS_EFFORT);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MandoBooks [attributes=" + attributes + "]";
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.plan.BookStoreInterface#getDatax()
	 */
	@Override
	public Attributes getAttributes() {
		return attributes;
	}
}