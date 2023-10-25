package deu.java002_02.data;

public class UserAccountRegistration
{
	private UserAccount userAccount;
	private String day;

	public UserAccount getUserAccount()
	{
		return userAccount;
	}

	public String getDay()
	{
		return day;
	}

	public UserAccountRegistration(UserAccount userAccount, String day)
	{
		this.userAccount = userAccount;
		this.day = day;
	}
}
