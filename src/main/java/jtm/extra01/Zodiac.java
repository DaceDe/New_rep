package jtm.extra01;

public class Zodiac {

	/**
	 * Determine the sign of the zodiac, use day and month.
	 * 
	 * @param day
	 * @param month
	 * @return zodiac
	 */
	public static String getZodiac(int day, int month) {
		String zodiac = "";
		
		 if (month == 12){ 
             
	            if (day < 22) 
	           zodiac = "Sagittarius"; 
	            else
	            	zodiac ="capricorn"; 
	        } 
	              
	        else if (month == 1){ 
	            if (day < 20) 
	            	zodiac = "Capricorn"; 
	            else
	            	zodiac = "aquarius"; 
	        } 
	              
	        else if (month == 2){ 
	            if (day < 19) 
	            	zodiac = "Aquarius"; 
	            else
	            	zodiac = "pisces"; 
	        } 
	              
	        else if(month ==3){ 
	            if (day < 21)  
	            	zodiac= "Pisces"; 
	            else
	            	zodiac = "aries"; 
	        } 
	        else if (month == 4){ 
	            if (day < 20) 
	            	zodiac = "Aries"; 
	            else
	            	zodiac = "taurus"; 
	        } 
	              
	        else if (month == 5){ 
	            if (day < 21) 
	            	zodiac = "Taurus"; 
	            else
	            	zodiac = "gemini"; 
	        } 
	              
	        else if( month == 6){ 
	            if (day < 21) 
	            	zodiac = "Gemini"; 
	            else
	            	zodiac = "cancer"; 
	        } 
	              
	        else if (month == 7){ 
	            if (day < 23) 
	            	zodiac = "Cancer"; 
	            else
	            	zodiac = "leo"; 
	        } 
	              
	        else if( month == 8){ 
	            if (day < 23)  
	            	zodiac = "Leo"; 
	            else
	            	zodiac = "virgo"; 
	        } 
	              
	        else if (month == 9){ 
	            if (day < 23) 
	            	zodiac = "Virgo"; 
	            else
	            	zodiac = "libra"; 
	        } 
	              
	        else if (month == 10){ 
	            if (day < 23) 
	            	zodiac = "Libra"; 
	            else
	            	zodiac = "scorpio"; 
	        } 
	              
	        else if (month == 11){ 
	            if (day < 22) 
	            	zodiac= "scorpio"; 
	            else
	            	zodiac = "sagittarius"; 
	        } 
	      
	    

		
		
		// TODO #1: Implement method which return zodiac sign names
		// As method parameter - day and month;
		// Look at wikipedia:
		// https://en.wikipedia.org/wiki/Zodiac#Table_of_dates
		// Tropical zodiac, to get appropriate date ranges for signs
		return zodiac;
	}
	
	public static void main(String[] args) {
		// HINT: you can use main method to test your getZodiac method with
		// different parameters
		System.out.println(getZodiac(29, 3));
	}

}
