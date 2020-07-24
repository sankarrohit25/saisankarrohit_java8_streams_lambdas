package com.epam.streams_and_lambda_expressions;

import java.util.List;

public class Operations {
	public static int average(List<Integer> listofnum)
    {
    	int avg=0;
    	for(Integer iterator:listofnum)
    	{
    		avg=avg+iterator;
    	}
    	return avg/listofnum.size();
    }

}
