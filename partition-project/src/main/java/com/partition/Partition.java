package com.partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Partition 
{   
	public static <T> List<List<T>> partitionFunction(List<T> list, Integer partitionSize){
	    int size = list.size();
	    int partitionNumber = size / partitionSize;
	    if (size % partitionSize != 0) {
	    	partitionNumber++;
	    }
	 
	    List<List<T>> partition = new ArrayList();
	    for (int i = 0; i < partitionNumber; i++)
	    {
	        int from= i*partitionSize;
	        int to = (i*partitionSize + partitionSize < size) ? (i*partitionSize + partitionSize) : size;
	 
	        partition.add(list.subList(from, to));
	    }
	    return partition;
 }
 public static void main(String[] args) {

		List<Integer> testList = new ArrayList() ;
		
		for (int i = 1; i < 6; i++) {
			testList.add(i);
		}
		System.out.println(partitionFunction(testList,2));		
 }   
}
