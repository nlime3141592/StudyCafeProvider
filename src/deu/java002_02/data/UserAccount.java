package deu.java002_02.data;

public class UserAccount
{
	private int uuid;
	private String account;
	private String password;

	public UserAccount()
	{
		uuid = -1;
		account = null;
		password = null;
	}

	public UserAccount(int uuid, String account, String password)
	{
		this.uuid = uuid;
		this.account = account;
		this.password = password;
	}

	public int getUuid()
	{
		return uuid;
	}

	public String getAccount()
	{
		return account;
	}

	public String getPassword()
	{
		return password;
	}
}
