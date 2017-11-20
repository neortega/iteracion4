package vos;

public class Gerente extends Usuario{

	public Gerente(Long id, String name) {
		super(id, name, GERENTE, true);
	}
}
