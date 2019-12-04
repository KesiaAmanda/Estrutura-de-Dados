
public class Pessoa {
	String nome;
	String email;
	Pessoa proxima;
	
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public Pessoa getProxima() {
		return proxima;
	}
	
	public void setProxima(Pessoa nova) {
		this.proxima = nova;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Nome:	"+nome+"	Email:	"+email;
	}
}
