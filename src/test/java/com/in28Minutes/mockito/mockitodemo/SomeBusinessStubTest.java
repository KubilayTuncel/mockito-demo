package com.in28Minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class SomeBusinessStubTest {

	@Test
	public void findTheGreatestFromAllDAta() {
		SomeBusinessImp businessImp = new SomeBusinessImp(new DataServiceStub());
		int result = businessImp.findTheGreatestFromAllDAta();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService{
	
	@Override
	public int[] retrieveAllData() {
		return new int[] {24,6,15};
	}
}
