/*
 * Membro.java
 * 
 * Desenvolvido por Midianet.
 *  
 * Todos os direitos reservados.
 */

package midianet.admclan.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import midianet.admclan.constante.Cargo;
import midianet.admclan.constante.Status;


/**
 * Classe que representa uma entidade Membro (pessoal envolvida no clan).
 * 
 * @param Long tipo do identificador da entidade.
 * 
 * @author Marcos Fernando.
 * 
 * @see Enum
 * 
 * @category Dominio
 */ 
@Entity
@Table(name = "TB_MEMBRO")
@SequenceGenerator(	name 			= "seqMembro", 
					sequenceName	= "SQ_MEMBR_ID")
@NamedQueries({
	@NamedQuery(name	= "membro.listarTodos", 
				query	= "SELECT m FROM Membro m order by m.apelido"),
	@NamedQuery(name	= "membro.obterPorEmail",
	            query   = "SELECT m FROM Membro m where m.email = :email")	
})
@XmlRootElement
public class Membro implements Entidade<Long> {
	
	private static final long serialVersionUID = 2642563651095643388L;
	
	@Id
	@GeneratedValue(generator = "seqMembro")
	@Column(name = "MEMBR_ID")
	private Long    id;
	
	@Column(name = "MEMBR_NOME")	
	private String  nome;
	
	@NotNull
	@Column(name = "MEMBR_APELIDO")
	private String  apelido;
	
	@NotNull
	@Column(name = "MEMBR_EMAIL")
	private String  email;
	
	@NotNull
	@Column(name = "MEMBR_SENHA")
	private String  senha;
	
	@Column(name = "MEMBR_FONE")
	private String  telefone;
	
	@Column(name = "MEMBR_NASCIMENTO")
	private Date    nascimento;
	
	@Column(name = "MEMBR_CADASTRO")
	private Date    cadastro;
	
	@Column(name = "MEMBR_CV")
	private Integer cv;
	
	@Column(name = "MEMBR_EXPERIENCIA")
	private Integer experiencia;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEMBR_RESPONSAVEL_ID")
	private Membro  responsavel;
	
	@NotNull
	@Column(name = "MEMBR_CARGO_ID")
	@Enumerated(EnumType.ORDINAL)
	private Cargo   cargo;
	
	@NotNull
	@Column(name = "MEMBR_STATUS_ID")
	@Enumerated(EnumType.ORDINAL)
	private Status	status;
	
	@Column(name = "MEMBR_OBSERVACAO")
	private String  observacao;
	
	public Long getId() {
		return id;
	}
	
	public void setId(final Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(final String nome) {
		this.nome = nome;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(final String apelido) {
		this.apelido = apelido;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(final String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(final String senha) {
		this.senha = senha;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(final String telefone) {
		this.telefone = telefone;
	}
	
	public Date getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(final Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public Date getCadastro() {
		return cadastro;
	}
	
	public void setCadastro(final Date cadastro) {
		this.cadastro = cadastro;
	}
	
	public Integer getCv() {
		return cv;
	}
	
	public void setCv(final Integer cv) {
		this.cv = cv;
	}
	
	public Integer getExperiencia() {
		return experiencia;
	}
	
	public void setExperiencia(final Integer experiencia) {
		this.experiencia = experiencia;
	}
	
	public Membro getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(final Membro responsavel) {
		this.responsavel = responsavel;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(final Cargo cargo) {
		this.cargo = cargo;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(final Status status) {
		this.status = status;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(final String observacao) {
		this.observacao = observacao;
	}
	
}