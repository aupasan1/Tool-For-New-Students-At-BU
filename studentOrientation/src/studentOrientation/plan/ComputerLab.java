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
public class ComputerLab implements CourseRegistrationInterface, TimeInterface, CostInterface, CarbonFootprintInterface, EffortInterface {

	private Attributes attributes;
	
	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked
	 */
	public ComputerLab() {
		attributes = new Attributes();
		
		Logger.writeMessage("Constructor of ComputerLab class", DebugLevel.CONSTRUCTOR);
	}

	/* (non-Javadoc)
	 * @see studentOrientation.plan.CourseRegistrationInterface#register()
	 */
	@Override
	public void register() {
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
		attributes.setTime(Constants.COMPUTER_LAB_TIME);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CostInterface#calculateCost()
	 */
	@Override
	public void calculateCostInDollars() {
		attributes.setCost(Constants.COMPUTER_LAB_COST);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CarbonFootprintInterface#calculateCarbonFootprint()
	 */
	@Override
	public void calculateCarbonFootprintInTonnes() {
		attributes.setCarbonFootprint(Constants.COMPUTER_LAB_CARBON_FOOTPRINT);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.EffortInterface#calculateEffort()
	 */
	@Override
	public void calculateEffortInCalories() {
		attributes.setEffort(Constants.COMPUTER_LAB_EFFORT);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ComputerLab [attributes=" + attributes + "]";
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.plan.CourseRegistrationInterface#getDatax()
	 */
	@Override
	public Attributes getAttributes() {
		return attributes;
	}
}