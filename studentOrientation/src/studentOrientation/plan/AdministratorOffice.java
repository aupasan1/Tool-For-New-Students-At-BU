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
public class AdministratorOffice implements DormSelectionInterface, TimeInterface, CostInterface, CarbonFootprintInterface, EffortInterface {

	private Attributes attributes;
	
	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked
	 */
	public AdministratorOffice() {
		attributes = new Attributes();
		
		Logger.writeMessage("Constructor of AdministratorOffice class", DebugLevel.CONSTRUCTOR);
	}

	/* (non-Javadoc)
	 * @see studentOrientation.plan.DormSelectionInterface#selectDorm()
	 */
	@Override
	public void selectDorm() {
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
		attributes.setTime(Constants.ADMINISTRATOR_OFFICE_TIME);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CostInterface#calculateCost()
	 */
	@Override
	public void calculateCostInDollars() {
		attributes.setCost(Constants.ADMINISTRATOR_OFFICE_COST);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CarbonFootprintInterface#calculateCarbonFootprint()
	 */
	@Override
	public void calculateCarbonFootprintInTonnes() {
		attributes.setCarbonFootprint(Constants.ADMINISTRATOR_OFFICE_CARBON_FOOTPRINT);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.EffortInterface#calculateEffort()
	 */
	@Override
	public void calculateEffortInCalories() {
		attributes.setEffort(Constants.ADMINISTRATOR_OFFICE_EFFORT);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AdministratorOffice [attributes=" + attributes + "]";
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.plan.DormSelectionInterface#getDatax()
	 */
	@Override
	public Attributes getAttributes() {
		return attributes;
	}
}