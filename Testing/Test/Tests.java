import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ejercicioCredencial.Credencial;
class Tests {

	private static Credencial credencial;
	
	@BeforeAll
	public static void creacionDePassword() {
		credencial= new Credencial("lola", "flores","poflsaseeee");
	}
	
	
	@Test
	void testEsPasswordSegura() {
		assertFalse(credencial.esPasswordSegura());
	}

	@Test 
	void testComprobarConstrasena() {
		assertTrue(credencial.comprobarPassword("poflsaseeee"));
	}
}
