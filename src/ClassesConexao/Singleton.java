package ClassesConexao;

public class Singleton {
	
	public String nomeUsuario;
	public String cpfUsuario;
	public String nomeFuncionario;
	public String nomeVaga;
	
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
