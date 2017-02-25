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
public class RegistrarOffice implements CourseRegistrationInterface, TimeInterface, CostInterface, CarbonFootprintInterface, EffortInterface {

	private Attributes attributes;
	
	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked
	 */
	public RegistrarOffice() {
		attributes = new Attributes();
		
		Logger.writeMessage("Constructor of RegistrarOffice class", DebugLevel.CONSTRUCTOR);
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
		attributes.setTime(Constants.REGISTRAR_OFFICE_TIME);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CostInterface#calculateCost()
	 */
	@Override
	public void calculateCostInDollars() {
		CourseRegistrationInterface course = new ComputerLab();
		course.calculateCostInDollars();
		
		float cost = course.getAttributes().getCost();
		attributes.setCost(cost - ((3 * cost) / 100));
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CarbonFootprintInterface#calculateCarbonFootprint()
	 */
	@Override
	public void calculateCarbonFootprintInTonnes() {
		attributes.setCarbonFootprint(Constants.REGISTRAR_OFFICE_CARBON_FOOTPRINT);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.EffortInterface#calculateEffort()
	 */
	@Override
	public void calculateEffortInCalories() {
		attributes.setEffort(Constants.REGISTRAR_OFFICE_EFFORT);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RegistrarOffice [attributes=" + attributes + "]";
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.plan.CourseRegistrationInterface#getDatax()
	 */
	@Override
	public Attributes getAttributes() {
		return attributes;
	}
}