package com.in28Minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;


public class SomeBusinessMockTest {
	
	@Test
	public void findTheGreatestFromAllDAta() {
		DataService dataServiceMock= mock(DataService.class);
		//dataServiceMock.retrieveAllData() => new int [] {24,15,3}
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {24,15,3});
		
		SomeBusinessImp businessImp = new SomeBusinessImp(dataServiceMock);
		int result = businessImp.findTheGreatestFromAllDAta();
		assertEquals(24, result);
	}

	@Test
	public void findTheGreatestFromAllDAta_ForOneValue() {
		DataService dataServiceMock= mock(DataService.class);
		//dataServiceMock.retrieveAllData() => new int [] {24,15,3}
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {15});
		
		SomeBusinessImp businessImp = new SomeBusinessImp(dataServiceMock);
		int result = businessImp.findTheGreatestFromAllDAta();
		assertEquals(15, result);
	}

}
