package com.softlogic.commonRest;

public class Preference
{
	boolean acceptCounterOfferOnAmount;
	boolean acceptCounterOfferOnPrice;
	boolean acceptCurrentOddsAtReducedPrice;

	
	public Preference(boolean acceptCounterOfferOnAmount, boolean acceptCounterOfferOnPrice, boolean acceptCurrentOddsAtReducedPrice)
	{
		super();
		this.acceptCounterOfferOnAmount = acceptCounterOfferOnAmount;
		this.acceptCounterOfferOnPrice = acceptCounterOfferOnPrice;
		this.acceptCurrentOddsAtReducedPrice = acceptCurrentOddsAtReducedPrice;
	}

	public boolean isAcceptCurrentOddsAtReducedPrice()
	{
		return acceptCurrentOddsAtReducedPrice;
	}

	public void setAcceptCurrentOddsAtReducedPrice(boolean acceptCurrentOddsAtReducedPrice)
	{
		this.acceptCurrentOddsAtReducedPrice = acceptCurrentOddsAtReducedPrice;
	}

	public boolean isAcceptCounterOfferOnAmount()
	{
		return acceptCounterOfferOnAmount;
	}

	public void setAcceptCounterOfferOnAmount(boolean acceptCounterOfferOnAmount)
	{
		this.acceptCounterOfferOnAmount = acceptCounterOfferOnAmount;
	}

	public boolean isAcceptCounterOfferOnPrice()
	{
		return acceptCounterOfferOnPrice;
	}

	public void setAcceptCounterOfferOnPrice(boolean acceptCounterOfferOnPrice)
	{
		this.acceptCounterOfferOnPrice = acceptCounterOfferOnPrice;
	}

}
