
public class TimeException extends Exception{

	// Robert Porter
	
	public TimeException()
	{
		super("EXCEPTION: Invalid time entered");
	}
	
	public TimeException(String msg)
	{
		super(msg);
	}
}
