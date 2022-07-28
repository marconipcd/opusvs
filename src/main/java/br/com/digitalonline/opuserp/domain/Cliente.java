package br.com.digitalonline.opuserp.domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NOME_RAZAO")
	private String nome_razao;
	
	@Column(name = "EMPRESA_ID")
	private Integer empresa;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	@Temporal(value=TemporalType.TIMESTAMP)
    @Column(name="DATA_CADASTRO", nullable = false)
    private Date data_cadastro;   
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    @Temporal(value=TemporalType.TIMESTAMP)
    @Column(name="DATA_ALTERACAO", nullable = false)
    private Date data_alteracao;
    
    @Column(name="STATUS_2",unique=false, nullable=false)
	private String status; //ok
    
    @Column(name="DOC_CPF_CNPJ", unique=false, nullable=false)
	private String doc_cpf_cnpj; //ok
	@Column(name="DOC_RG_INSC_ESTADUAL", unique=false, nullable=false)
	private String doc_rg_insc_estadual; //ok
	@Column(name="ORGAO_EMISSOR_RG")
	private String orgao_emissor_rg;
	
	@Column(name="TRATAMENTO", unique=false, nullable=false)
	private String tratamento; //ok
	
	@Column(name="CONTATO",unique=false, nullable=false)
	private String contato; //ok
	
	@Column(name="NOME_FANTASIA", unique=false, nullable=true)
	private String nome_fantasia; //ok
	
	@Column(name="SEXO",unique=false, nullable=false)
	private String sexo; //ok
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Temporal(value=TemporalType.DATE)
	@Column(name="DATA_NASCIMENTO",unique=false, nullable=false)
	private Date data_nascimento; 		
	@Column(name="TELEFONE1",unique=false, nullable=false)
	private String telefone1; //ok
	@Column(name="TELEFONE2",unique=false, nullable=true)
	private String telefone2; //ok
	@Column(name="CELULAR1",unique=false, nullable=true)
	private String celular1; //ok
	@Column(name="CELULAR2",unique=false, nullable=true)
	private String celular2; 
	@Column(name="WHATSAPP",unique=false, nullable=true)
	private String whatsapp; 
	
	@Column(name="EMAIL",unique=false, nullable=true)
	private String email; //ok
	@Column(name="SENHA",unique=false, nullable=true)
	private String senha; 
	@Column(name="MSN",unique=false, nullable=true)
	private String msn; 	
	@Column(name="PROFISSAO", nullable=true, unique=false, length=50)
	private String profissao;	
	@Column(name="DDD_FONE1", nullable=true, unique=false, length=50)
	private String ddd_fone1;
	@Column(name="DDD_FONE2", nullable=true, unique=false, length=50)
	private String ddd_fone2;
	@Column(name="DDD_CEL1", nullable=true, unique=false, length=50)
	private String ddd_cel1;
	@Column(name="DDD_CEL2", nullable=true, unique=false, length=50)
	private String ddd_cel2;	
	@Column(name="SITE", nullable=true, unique=false, length=100)
	private String site;
	
	@OneToOne
	@JoinColumn(name="COMO_NOS_CONHECEU_ID")
	private ComoNosConheceu como_nos_conheceu; 
	@Column(name="OBS",unique=false, nullable=true)
	private String obs; 
	
	@OneToOne
	@JoinColumn(name="CATEGORIAS_ID")
	private Categorias categoria;
	@Column(name="REDE_SOCIAL", nullable=true, unique=false, length=100)
	private String rede_social;
	
	public Cliente() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_razao() {
		return nome_razao;
	}

	public void setNome_razao(String nome_razao) {
		this.nome_razao = nome_razao;
	}

	public Integer getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public Date getData_alteracao() {
		return data_alteracao;
	}

	public void setData_alteracao(Date data_alteracao) {
		this.data_alteracao = data_alteracao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDoc_cpf_cnpj() {
		return doc_cpf_cnpj;
	}

	public void setDoc_cpf_cnpj(String doc_cpf_cnpj) {
		this.doc_cpf_cnpj = doc_cpf_cnpj;
	}

	public String getDoc_rg_insc_estadual() {
		return doc_rg_insc_estadual;
	}

	public void setDoc_rg_insc_estadual(String doc_rg_insc_estadual) {
		this.doc_rg_insc_estadual = doc_rg_insc_estadual;
	}

	public String getOrgao_emissor_rg() {
		return orgao_emissor_rg;
	}

	public void setOrgao_emissor_rg(String orgao_emissor_rg) {
		this.orgao_emissor_rg = orgao_emissor_rg;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getCelular1() {
		return celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getCelular2() {
		return celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getDdd_fone1() {
		return ddd_fone1;
	}

	public void setDdd_fone1(String ddd_fone1) {
		this.ddd_fone1 = ddd_fone1;
	}

	public String getDdd_fone2() {
		return ddd_fone2;
	}

	public void setDdd_fone2(String ddd_fone2) {
		this.ddd_fone2 = ddd_fone2;
	}

	public String getDdd_cel1() {
		return ddd_cel1;
	}

	public void setDdd_cel1(String ddd_cel1) {
		this.ddd_cel1 = ddd_cel1;
	}

	public String getDdd_cel2() {
		return ddd_cel2;
	}

	public void setDdd_cel2(String ddd_cel2) {
		this.ddd_cel2 = ddd_cel2;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public ComoNosConheceu getComo_nos_conheceu() {
		return como_nos_conheceu;
	}

	public void setComo_nos_conheceu(ComoNosConheceu como_nos_conheceu) {
		this.como_nos_conheceu = como_nos_conheceu;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public String getRede_social() {
		return rede_social;
	}

	public void setRede_social(String rede_social) {
		this.rede_social = rede_social;
	}

	public Cliente(Long id, String nome_razao) {
		super();
		this.id = id;
		this.nome_razao = nome_razao;
	}
	
	
}

