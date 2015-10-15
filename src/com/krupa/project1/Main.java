package com.krupa.project1;

import java.math.BigInteger;
import java.util.Scanner;


public class Main { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner scan=new Scanner(System.in);
		N=scan.nextInt();
		BigInteger[] arr=new BigInteger[N];
		
		for(int i=0;i<N;i++)
		{
			arr[i]=scan.nextBigInteger();
		}
		
		BigInteger result=new BigInteger("1");
		for(int i=0;i<N;i++)
		{
			result=result.multiply(arr[i]);
		}
		for(int i=0;i<N;i++)
		{
			System.out.println(result.divide(arr[i]).toString());
		}
			
		
		
	}

}
