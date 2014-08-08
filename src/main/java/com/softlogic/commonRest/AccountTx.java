package com.softlogic.commonRest;

public class AccountTx
{
        public AccountTx(String type, String id, int ratings)
		{
			this.type = type;
			Id = id;
			this.ratings = ratings;
		}
        
		String type;
        String Id;
        int ratings;
		public String getType()
		{
			return type;
		}
		public void setType(String type)
		{
			this.type = type;
		}
		public String getId()
		{
			return Id;
		}
		public void setId(String id)
		{
			Id = id;
		}
		public int getRatings()
		{
			return ratings;
		}
		public void setRatings(int ratings)
		{
			this.ratings = ratings;
		}
}
