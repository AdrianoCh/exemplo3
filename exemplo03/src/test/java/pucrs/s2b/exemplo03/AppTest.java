package pucrs.s2b.exemplo03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

	@Test
	public void fiveAndFiveGivesExam() {
		String expected = "Em exame";
		String actual = Medias.calcular(5.0, 5.0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void sevenAndSevenGivesApproved() {
		String expected = "Aprovado";
		String actual = Medias.calcular(7.0, 7.0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void threeAndThreeGivesReproved() {
		String expected = "Reprovado";
		String actual = Medias.calcular(3.0, 3.0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void three99AndThree99GivesReproved() {
		String expected = "Reprovado";
		String actual = Medias.calcular(3.99, 3.99);
		assertEquals(expected, actual);
	}
	
	@Test
	public void three99AndFour01GivesReproved() {
		String expected = "Em exame";
		String actual = Medias.calcular(3.999, 4.001);
		assertEquals(expected, actual);
	}
}
