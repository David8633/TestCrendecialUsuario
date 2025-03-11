import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ejercicioCredencial.Credencial;
import ejercicioCredencial.Usuario;
class Tests {

	private static Credencial credencial;
	private static Credencial credencial1;
	private static Usuario u1;
	@BeforeAll
	public static void creacionDePassword() {
		credencial = new Credencial("lola", "flores","poflsaseeee");
		credencial1 = new Credencial("Sergio","bol","PaosdaEQw12");
		u1 = new Usuario("Sergio", "wedst", "Pqwers1233" );
	}
	
	
	@Test
	void testEsPasswordSegura() {
		assertTrue(credencial.esPasswordSegura("PaosdaEQw12"));
		assertFalse(credencial1.esPasswordSegura("Paos"));
		assertFalse(credencial1.esPasswordSegura("pasdfdsfdf"));
		assertFalse(credencial1.esPasswordSegura("Paos23"));
		assertFalse(credencial1.esPasswordSegura(" "));
		assertFalse(credencial1.esPasswordSegura("11111111111"));
	}
	
	@Test
	void testComprobarPassword() {
		assertFalse(credencial.comprobarPassword("poflsase"));
		assertFalse(credencial1.comprobarPassword("PaosdaEQw1"));
		
	}
	
	@Test
	void testModificarContraseña() {
		assertFalse(u1.modificarPassword("Pqwers1233","erttwed","erttwed"));
	}
	
	@Test
	void testHacerLogin() {
		assertFalse(u1.hacerLogin("asdd","edwqwdqa"));
		assertTrue(u1.hacerLogin("Sewe100","Pqwers1233"));
	}
	
	
}
