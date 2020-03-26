/*
       Copyright 2017 IBM Corp All Rights Reserved

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ibm.hybrid.cloud.sample.stocktrader.stockquote.json;

/** JSON-B POJO class representing a Quote JSON object */
public class QuoteV2 {
    private String symbol;
    private double latestPrice;
    private String latestTime;
    private long highTime = 0; //marker for time of day not being set


    public QuoteV2() { //default constructor
    }

    public QuoteV2(String initialSymbol) { //primary key constructor
        setSymbol(initialSymbol);
    }

    public QuoteV2(String initialSymbol, double initialPrice, String initialDate) {
        setSymbol(initialSymbol);
        setLatestPrice(initialPrice);
        setLatestTime(initialDate);
    }

    public QuoteV2(String initialSymbol, double initialPrice, String initialDate, long initialTime) {
        setSymbol(initialSymbol);
        setLatestPrice(initialPrice);
        setLatestTime(initialDate);
        setHighTime(initialTime);
    }

    
    public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getLatestPrice() {
		return latestPrice;
	}

	public void setLatestPrice(double latestPrice) {
		this.latestPrice = latestPrice;
	}

	public String getLatestTime() {
		return latestTime;
	}

	public void setLatestTime(String latestTime) {
		this.latestTime = latestTime;
	}

	public long getHighTime() {
		return highTime;
	}

	public void setHighTime(long highTime) {
		this.highTime = highTime;
	}

	public boolean equals(Object obj) {
        boolean isEqual = false;
        if ((obj != null) && (obj instanceof QuoteV2)) isEqual = toString().equals(obj.toString());
        return isEqual;
   }

    public String toString() {
        return "{\"symbol\": \""+symbol+"\", \"price\": "+latestPrice+", \"date\": \""+latestTime+"\", \"time\": "+highTime+"}";
    }
}
