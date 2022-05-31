package com.in28Minutes.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImp businessImp;
	
	@Test
	public void findTheGreatestFromAllDAta() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {24,15,3});
		assertEquals(24, businessImp.findTheGreatestFromAllDAta());
	}

	@Test
	public void findTheGreatestFromAllDAta_ForOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {15});
		int result = businessImp.findTheGreatestFromAllDAta();
		assertEquals(15, result);
	}

}
