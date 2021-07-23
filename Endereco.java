package br.com.accentbank.accentBank.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;





@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    
  @OneToOne(mappedBy = "endereco")
    private Agencia agencia;
//    
//    @OneToOne
//    private Cliente cliente;
    
  //Construtor
    public Endereco() {
        
    }
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
    
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
  
    
//    @Override
//    public String toString() {
//        return "Endereco{" +
//                "cep='" + cep + '\'' +
//                ", logradouro='" + logradouro + '\'' +
//                ", complemento='" + complemento + '\'' +
//                ", bairro=" + bairro +
//                ", localidade='" + localidade + '\'' +
//                ", uf='" + uf + '\'' +
//                ", ibge='" + ibge + '\'' +
//                ", gia='" + gia + '\'' +
//                ", ddd='" + ddd + '\'' +                
//                ", siafi='" + siafi + '\'' +
//                '}';
//    }

}
