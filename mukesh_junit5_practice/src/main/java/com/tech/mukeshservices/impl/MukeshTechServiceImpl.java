package com.tech.mukeshservices.impl;

import com.tech.mukeshservices.MukeshTechServices;

public class MukeshTechServiceImpl implements MukeshTechServices{
	
	@Override
	public boolean isValidePrimeNumber(int n) {
		
		boolean b = false;
		
		int c =0;
		for(int i = 1 ; i <= n;i++) {
			
			if(n%i == 0) {
				c++;
			}
		}
		
		if(c==2) 
			b =true ;
		else
			b =false;
		
		return b;
	}
	
	@Override
	public boolean isValidePhoneNumber(String contact) {
		boolean b = false;
		
		return b;
	}

}
