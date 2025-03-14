package ejercicioCredencial;

public class Credencial {

	private String username;
	private String password;
	private static int secuencia;
	
	public Credencial(String nombre, String apellidos, String password) {
	
		this.username = nombre.substring(0, 2) + apellidos.substring(0, 2) + Integer.valueOf(secuencia + 100);
		this.password = password;
		
	}
	
	public boolean comprobarPassword(String password) {
		return this.password.equals(password);
	}

	public String getUsername() {
		return username;
	}
	
	public boolean esPasswordSegura(String newpass) {
		
		boolean esMayusc=false, esDigito=false;
		
		for(int i=0; i<newpass.length(); i++ ) {
		if(Character.isDigit(newpass.charAt(i))) {
			esDigito=true;
		}else {
			if(Character.isLowerCase(newpass.charAt(i))) {
				esMayusc=true;
			}
		}
		}
		
		return esDigito && esMayusc && newpass.length()>=8;
	}
	
	public void setPassword(String newpass) {
	
		this.password = newpass;
		
	}

	@Override
	public String toString() {
		return "Credencial [username=" + this.username + ", password=" + "*".repeat(this.password.length()) + "]";
	}
	
	

}