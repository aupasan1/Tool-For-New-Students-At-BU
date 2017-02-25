package studentOrientation.plan;

import studentOrientation.util.DebugLevel;
import studentOrientation.util.Logger;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public class Attributes {

	private float time;
	private float cost;
	private float carbonFootprint;
	private float effort;

	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked
	 */
	public Attributes() {
		time = 0;
		cost = 0;
		carbonFootprint = 0;
		effort = 0;
		
		Logger.writeMessage("Constructor of Attributes class", DebugLevel.CONSTRUCTOR);
	}

	/**
	 * @return time
	 */
	public float getTime() {
		return time;
	}

	/**
	 * @param timeIn the time to set
	 */
	public void setTime(float timeIn) {
		time = timeIn;
	}

	/**
	 * @return cost
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * @param costIn the cost to set
	 */
	public void setCost(float costIn) {
		cost = costIn;
	}

	/**
	 * @return carbon footprint
	 */
	public float getCarbonFootprint() {
		return carbonFootprint;
	}

	/**
	 * @param carbonFootprintIn the carbon footprint to set
	 */
	public void setCarbonFootprint(float carbonFootprintIn) {
		carbonFootprint = carbonFootprintIn;
	}

	/**
	 * @return effort
	 */
	public float getEffort() {
		return effort;
	}

	/**
	 * @param effortIn the effort to set
	 */
	public void setEffort(float effortIn) {
		effort = effortIn;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Attributes [time=" + time + ", cost=" + cost + ", carbonFootprint="
				+ carbonFootprint + ", effort=" + effort + "]";
	}
}