package midianet.admclan.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MembroVO {
	private Long id;
	private String nome;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
