package com.partition;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import com.partition.Partition;


public class PartitionTest {
	Partition partition ; 
	
	@Test
	public  void PartitionFunctionTest() {
		
		List<Integer> testList = new ArrayList() ;
	
		for (int i = 1; i < 6; i++) {
			testList.add(i);
		}
		
		assertEquals(3, partition.partitionFunction(testList , 2).size()) ;
		assertEquals(2, partition.partitionFunction(testList , 2).get(0).size());
		
	}
	

}
