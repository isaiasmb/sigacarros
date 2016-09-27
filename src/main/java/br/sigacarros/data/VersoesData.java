package br.sigacarros.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="versoes")
public class VersoesData {
	public VersoesData() {
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_versao")
	private int idVersoes;
	
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_modelo")
	private ModelosData modelosData;

	@ManyToOne
	@JoinColumn(name="id_combustivel")
	private CombustiveisData combustiveisData;

	@ManyToOne
	@JoinColumn(name="id_cambio")
	private CambiosData CambiosData;
	
	@ManyToOne
	@JoinColumn(name="id_carroceria")
	private CarroceriasData CarroceriasData;
	
	public int getIdVersoes() {
		return idVersoes;
	}
	public void setIdVersoes(int idVersoes) {
		this.idVersoes = idVersoes;
	}
	public ModelosData getModelosData() {
		return modelosData;
	}
	public void setModelosData(ModelosData modelosData) {
		this.modelosData = modelosData;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CombustiveisData getCombustiveisData() {
		return combustiveisData;
	}
	public void setCombustiveisData(CombustiveisData combustiveisData) {
		this.combustiveisData = combustiveisData;
	}
	public CambiosData getCambiosData() {
		return CambiosData;
	}
	public void setCambiosData(CambiosData cambiosData) {
		CambiosData = cambiosData;
	}
	public CarroceriasData getCarroceriasData() {
		return CarroceriasData;
	}
	public void setCarroceriasData(CarroceriasData carroceriasData) {
		CarroceriasData = carroceriasData;
	}	
	
}
