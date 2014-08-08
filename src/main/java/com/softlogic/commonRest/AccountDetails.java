package com.softlogic.commonRest;

//import java.util.List;

public class AccountDetails
{
    int accountNumber;
    String saltedPasswordHash;
    String jurisdiction;
    String channel;
    String tier;
//    List<Preference> customerPref;
    
    public AccountDetails()
    {
    	
    }
    public AccountDetails(int accountNumber, String saltedPasswordHash, String jurisdiction, 
    						String channel, String tier, Preference prefer)
	{
		this.accountNumber = accountNumber;
		this.saltedPasswordHash = saltedPasswordHash;
		this.jurisdiction = jurisdiction;
		this.channel = channel;
		this.tier = tier;
	}
    public String toString()
    {
    	return "AccountDetails " + accountNumber + " jurisdiction " + jurisdiction 
    			+ " channel " + channel + " tier " + tier; 
    }

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public String getSaltedPasswordHash()
	{
		return saltedPasswordHash;
	}

	public void setSaltedPasswordHash(String saltedPasswordHash)
	{
		this.saltedPasswordHash = saltedPasswordHash;
	}

	public String getJurisdiction()
	{
		return jurisdiction;
	}

	public void setJurisdiction(String jurisdiction)
	{
		this.jurisdiction = jurisdiction;
	}

	public String getChannel()
	{
		return channel;
	}

	public void setChannel(String channel)
	{
		this.channel = channel;
	}

	public String getTier()
	{
		return tier;
	}

	public void setTier(String tier)
	{
		this.tier = tier;
	}

//	public List<Preference> getCustomerPref()
//	{
//		return customerPref;
//	}
//
//	public void setCustomerPref(List<Preference> customerPref)
//	{
//		this.customerPref = customerPref;
//	};
//    
}
