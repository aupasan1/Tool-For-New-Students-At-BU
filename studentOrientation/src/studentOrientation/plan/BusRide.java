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
public class BusRide implements TourInterface, TimeInterface, CostInterface, CarbonFootprintInterface, EffortInterface {
	
	private Attributes attributes;
	
	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked
	 */
	public BusRide() {
		attributes = new Attributes();
		
		Logger.writeMessage("Constructor of BusRide class", DebugLevel.CONSTRUCTOR);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.plan.TourInterface#takeTour()
	 */
	@Override
	public void takeTour() {
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
		attributes.setTime(Constants.BUS_TIME);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CostInterface#calculateCost()
	 */
	@Override
	public void calculateCostInDollars() {
		attributes.setCost(Constants.BUS_COST);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.CarbonFootprintInterface#calculateCarbonFootprint()
	 */
	@Override
	public void calculateCarbonFootprintInTonnes() {
		attributes.setCarbonFootprint(Constants.BUS_CARBON_FOOTPRINT);
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.store.EffortInterface#calculateEffort()
	 */
	@Override
	public void calculateEffortInCalories() {
		attributes.setEffort(Constants.BUS_EFFORT);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BusRide [attributes=" + attributes + "]";
	}
	
	/* (non-Javadoc)
	 * @see studentOrientation.plan.TourInterface#getDatax()
	 */
	@Override
	public Attributes getAttributes() {
		return attributes;
	}
}