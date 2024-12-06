
public class TimeConverter {

	// Robert Porter
	
	private int hours;
	private int minutes;
	private int seconds;
	private boolean notPM;
	
	// default constructor
	public TimeConverter()
	{
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		this.notPM = true;
	}
	
	// parameterized constructor
	public TimeConverter(int xHours, int xMinutes, int xSeconds)
	{
		this.setHours(xHours);
		this.setMinutes(xMinutes);
		this.setSeconds(xSeconds);
	}
	
	// accessors
	public int getHours()
	{
		return this.hours;
	}
	
	public int getMinutes()
	{
		return this.minutes;
	}
	
	public int getSeconds()
	{
		return this.seconds;
	}
	
	public boolean getNotPM()
	{
		return this.notPM;
	}
	
	// mutators
	public void setHours(int xHours)
	{
		if(xHours < 24 && xHours >= 0)
		{
			this.hours = xHours;
		}
		
		else
		{
			System.out.println("Invalid value for hours entered!");
		}
	}
	
	public void setMinutes(int xMinutes)
	{
		if(xMinutes <= 59 && xMinutes > -1)
		{
			this.minutes = xMinutes;
		}
		
		else
		{
			System.out.println("Invalid value for minutes entered!");
		}
	}
	
	public void setSeconds(int xSeconds)
	{
		if(xSeconds <= 59 && xSeconds > -1)
		{
			this.seconds = xSeconds;
		}
		
		else
		{
			System.out.println("Invalid value for seconds entered!");
		}
	}
	
	public void setNotPM(int xHours)
	{
		if(xHours >= 0 && xHours < 12)
		{
			this.notPM = true;
		}
		
		else if(xHours < 24)
		{
			this.notPM = false;
		}
		
		else
		{
			System.out.println("Invalid value for hours entered!");
		}
	}
	
	// methods
	public void updateTime(int xHours, int xMinutes, int xSeconds) throws TimeException
	{
		if (xHours < 0 || xHours >= 24 || xMinutes < 0 || xMinutes >= 60 || xSeconds < 0 || xSeconds >= 60)
		{
			throw new TimeException();
		}
		
		else
		{
			this.setHours(xHours);
			this.setMinutes(xMinutes);
			this.setSeconds(xSeconds);
		}
		
		// 12 AM
		if(xHours == 0)
		{
			this.setHours(12);
			this.notPM = true;
		}
		
		// 12 PM
		else if(xHours == 12)
		{
			this.setHours(12);
			this.notPM = false;
		}
		
		// AM
		else if(xHours < 12)
		{
			this.setHours(xHours);
			this.notPM = true;
		}
		
		// PM
		else
		{
			this.setHours(xHours - 12);
			this.notPM = false;
		}
	}
	
	public void updateTime(String time) throws TimeException
	{
		try
		{
			// time example: 20:59:05
			// index:        01234567
			String hours = time.substring(0, 2);
			String minutes = time.substring(3, 5);
			String seconds = time.substring(6, 8);
			
			// convert strings to integers
			int xHours = Integer.parseInt(hours.trim());
			int xMinutes = Integer.parseInt(minutes.trim());
			int xSeconds = Integer.parseInt(seconds.trim());
			
			if (xHours < 0 || xHours >= 24 || xMinutes < 0 || xMinutes >= 60 || xSeconds < 0 || xSeconds >= 60)
			{
				throw new TimeException();
			}
			
			this.updateTime(xHours, xMinutes, xSeconds);
		}
		
		catch (Exception e)
		{
			throw new TimeException();
		}
	}
	
	public String displayTime()
	{
		String amORpm;
		if(this.notPM)
		{
			amORpm = "AM";
		}
		
		else
		{
			amORpm = "PM";
		}
		
		// account for 0's if minute or second is less than 10
		String minutes;
		String seconds;
		if(this.minutes < 10)
		{
			minutes = "0" +this.minutes;
		}
		
		else
		{
			minutes = String.valueOf(this.minutes);
		}
		
		if(this.seconds < 10)
		{
			seconds = "0" +this.seconds;
		}
		
		else
		{
			seconds = String.valueOf(this.seconds);
		}
		
		return this.hours +":" +minutes +":" +seconds +" " +amORpm;
	}
}
