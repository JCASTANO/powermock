package co.ceiba.component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({FileHelper.class})
public class PersonTest {

	@Test
	public void tesGetNameNotNull() {
	    //Arrange
		PowerMockito.mockStatic(FileHelper.class);
		PowerMockito.when(FileHelper.createFile()).thenReturn("Hola Mock");
		Person person = new Person();
		//Act
		System.out.println(person.getName());
		//Assert
	}
}
