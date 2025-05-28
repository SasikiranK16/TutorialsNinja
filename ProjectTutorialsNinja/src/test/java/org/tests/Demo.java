package org.tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Demo {

	@Test
	void testTwo() throws Exception {
		System.out.println("hielo");
	}
	@Test
	public void testOne() throws Exception {
		System.out.println("jiis");
	}
	
}
