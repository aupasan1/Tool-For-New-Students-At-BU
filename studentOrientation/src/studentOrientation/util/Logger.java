package studentOrientation.util;

/**
 * @author Abhishek Niranjan Upasani
 * @version 1.0
 * @since 2016-10-27
 * 
 */
public class Logger {

	private static DebugLevel debugLevel;
	
	
	/**
	 * This method does not have a return type. When an object is 
	 * created this constructor is invoked 
	 */
	public Logger() {
		Logger.writeMessage("Constructor of Logger class", DebugLevel.CONSTRUCTOR);
	}

	/** 
	 * @param levelIn The debug level to set
	 */
	public static void setDebugValue(int levelIn) {
		switch (levelIn) {
		case 0:
			debugLevel = DebugLevel.CHECKLIST;
			break;
		case 1:
			debugLevel = DebugLevel.DATA;
			break;
		case 2:
			debugLevel = DebugLevel.RESULT;
			break;
		case 3:
			debugLevel = DebugLevel.CONSTRUCTOR;
			break;
		default:
			debugLevel = DebugLevel.CHECKLIST;
			break;
		}
	}

	/**
	 * @param levelIn The debug value to set
	 */
	public static void setDebugValue(DebugLevel levelIn) {
		debugLevel = levelIn;
	}

	/**
	 * This method prints the message passed as per the debug level
	 * 
	 * @param message the message to print
	 * @param levelIn the debug level set
	 */
	public static void writeMessage(String message, DebugLevel levelIn) {
		if (levelIn == debugLevel)
			System.out.println(message);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Debug Level is " + debugLevel;
	}
}
