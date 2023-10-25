package deu.java002_02.data;

public class Blacklist
{
	private int uuid;
	private String userName;
	private String offDay;

	public Blacklist(int uuid, String userName, String offDay)
	{
		this.uuid = uuid;
		this.userName = userName;
		this.offDay = offDay;
	}

	public int getUuid()
	{
		return uuid;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getOffDay()
	{
		return offDay;
	}
}