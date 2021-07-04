/**
 * ****************************************************************************
 * Purpose: This class is Address book test class where the test cases are included.
 * 
 * @author Syeda Naziya
 * @version 1.0
 * @since 22-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.AddressBook;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {
	@Test
	public void given3Contact_WhenWrittenTo_CSVFileShouldPass() {
		AddressBookCSV addressBookCSVobject = new AddressBookCSV("src/test/java/resources/AddressBookCSVTester.csv");
		int readCSVContacts = addressBookCSVobject.readAddressBookFromCSVFile();
		Assert.assertEquals(3, readCSVContacts);
	}
}
