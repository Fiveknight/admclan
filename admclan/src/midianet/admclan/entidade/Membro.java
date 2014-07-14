package midianet.admclan.entidade;

import java.util.Date;


public class Membro {
	
	private Long    id;
	private String  nome;
	private String  email;
	private String  telefone;
	private Integer cv;
	private Integer experiencia;
	private Membro  responsavel;
	private Cargo   cargo;
	private Date	dataNascimento;
	private Date	dataEntrada;
	private Date	dataSaida;
	private Integer status = 1;
	private String  observacao;
	private Integer foto;
	private String  senha;
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Integer getCv() {
		return cv;
	}
	
	public void setCv(Integer cv) {
		this.cv = cv;
	}
	
	public Integer getExperiencia() {
		return experiencia;
	}
	
	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}
	
	public Membro getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Membro responsavel) {
		this.responsavel = responsavel;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Date getDataEntrada() {
		return dataEntrada;
	}
	
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public Date getDataSaida() {
		return dataSaida;
	}
	
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservação(String observacao) {
		this.observacao = observacao;
	}
	
	public String toString(){
		return this.nome;
	}
	
	public Integer getFoto() {
		return foto;
	}
	
	public void setFoto(Integer foto) {
		this.foto = foto;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}