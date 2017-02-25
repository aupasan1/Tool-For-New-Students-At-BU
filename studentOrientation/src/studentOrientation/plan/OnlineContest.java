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
public class OnlineContest implements DormSelectionInterface, TimeInterface, CostInterface, CarbonFootprintInterface, EffortInterface {

	private Attributes atributes;
	
	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked
	 */
	public OnlineContest() {
		atributes = new Attributes();
		
		Logger.writeMessage("Constructor of OnlineContest class", DebugLevel.CONSTRUCTOR);
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
		atributes.setTime(Constants.ONLINE_CONTEST_TIME);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CostInterface#calculateCost()
	 */
	@Override
	public void calculateCostInDollars() {
		DormSelectionInterface dorm = new AdministratorOffice();
		dorm.calculateCostInDollars();
		
		float cost = dorm.getAttributes().getCost();
		atributes.setCost(((2 * cost) / 100) + cost);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CarbonFootprintInterface#calculateCarbonFootprint()
	 */
	@Override
	public void calculateCarbonFootprintInTonnes() {
		atributes.setCarbonFootprint(Constants.ONLINE_CONTEST_CARBON_FOOTPRINT);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.EffortInterface#calculateEffort()
	 */
	@Override
	public void calculateEffortInCalories() {
		atributes.setEffort(Constants.ONLINE_CONTEST_EFFORT);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OnlineContest [atributes=" + atributes + "]";
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.plan.DormSelectionInterface#getDatax()
	 */
	@Override
	public Attributes getAttributes() {
		return atributes;
	}
}