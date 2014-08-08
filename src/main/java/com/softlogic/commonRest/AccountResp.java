package com.softlogic.commonRest;

public class AccountResp
{
	public AccountResp()
	{
//	    accountLst = new ArrayList<AccountTx>();
	}
    public AccountResp(String type, String amount, boolean flexi)//, AccountTx ac)
	{
		super();
		this.type = type;
		this.amount = amount;
		this.flexi = flexi;
//		this.accountLst.add(ac);
	}

	String type;
	String amount;
    boolean flexi;
    
//    List<AccountTx> accountLst;
	
    public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getAmount()
	{
		return amount;
	}

	public void setAmount(String amount)
	{
		this.amount = amount;
	}

	public boolean isFlexi()
	{
		return flexi;
	}

	public void setFlexi(boolean flexi)
	{
		this.flexi = flexi;
	}

//	public List<AccountTx> getAccountLst()
//	{
//		return accountLst;
//	}
//
//	public void setAccountLst(List<AccountTx> accountLst)
//	{
//		this.accountLst = accountLst;
//	}    
}
