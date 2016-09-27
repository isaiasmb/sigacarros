package br.sigacarros.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carrocerias")
public class CarroceriasData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_carroceria")
	private int idCarroceria;
	private String nome;
	private String descricao;
	
	public int getIdCarroceria() {
		return idCarroceria;
	}
	public void setIdCarroceria(int idCarroceria) {
		this.idCarroceria = idCarroceria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
