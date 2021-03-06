// (C) Copyright IBM Corp. 2015

package com.ibm.stdp;

/*
 * Bitmap pattern of Ich bin ein Musikante
 * @author osogami
 */
public class BitMapMusic {
    static int[][] musician = {
	{0},
	
	{3,-4},
	{3,0},
	{4,-1},
	{4,0},
	
	{5,-4},
	{0},
	{7,-2},
	{6,0},
	
	{5,0,-4},
	{5,0,-4},
	{4,0,-1},
	{4,0,-1},
	
	{3,0,-2},
	{0,-2},
	{0,-2},
	{0},
	
	{3,-4},
	{0},
	{4,-1},
	{4,0},
	
	{5,-4},
	{0},
	{7,-2},
	{6,0},
	
	{5,0,-4},
	{5,0,-4},
	{4,0,-1},
	{4,0,-1},
	
	{3,0,-2},
	{0,-2},
	{0,-2},
	{7},
	
	{3,5,-4},
	{3,5,-2},
	{3,5,0},
	{6},
	
	{2,4,-3},
	{2,4,-1},
	{2,4,0},
	{7},
	
	{3,5,-4},
	{3,5,-2},
	{3,5,0},
	{6},
	
	{2,4,-3},
	{2,4,-1},
	{2,4,0},
	{7},
	
	{5,0},
	{3},
	{4,-1},
	{4},
	
	{3,0,-2},
	{0,-2},
	{0,-2}
    };
    
    public TimeSeries getMusician(){
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	for(int i=0;i<musician.length;i++){
	    for(int j=0;j<musician[i].length;j++){
		int n = musician[i][j];
		if(n<min){
		    min = n;
		}
		if(n>max){
		    max = n;
		}
	    }
	}
	
	boolean[][] data = new boolean[musician.length][max-min+1];
	for(int i=0;i<musician.length;i++){
	    for(int j=0;j<musician[i].length;j++){
		int n = musician[i][j]-min;
		data[i][n] = true;
	    }
	}
	
	TimeSeries ts = new TimeSeries(data);
	
	return ts;
    }
}
