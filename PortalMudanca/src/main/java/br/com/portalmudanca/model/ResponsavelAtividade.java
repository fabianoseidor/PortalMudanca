package br.com.portalmudanca.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "RESPONSAVEL_ATIVIDADE")
@SequenceGenerator(name = "seq_responsavel_atividade", sequenceName = "seq_responsavel_atividade", allocationSize = 1, initialValue = 1)
public class ResponsavelAtividade implements Serializable{

	private static final long serialVersionUID = 8948847623642655986L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_responsavel_atividade")
	@Column(name = "ID_RESPONSAVEL_ATIVIDADE")
	private Long id_responsavel_atividade;
	
	@Column(name = "RESPONSAVEL_ATIVIDADE", nullable = false, length = 200)
	private String responsavel_atividade;
	
	@Column(name = "LOGIN_RESPONSAVEL_ATIVIDADE", length = 200)
	private String login_responsavel_atividade;

	@Column(name = "EMAIL_RESPONSAVEL_ATIVIDADE", nullable = false, length = 200)
	private String email_responsavel_atividade;
	
	public String getLogin_responsavel_atividade() {
		return login_responsavel_atividade;
	}

	public void setLogin_responsavel_atividade(String login_responsavel_atividade) {
		this.login_responsavel_atividade = login_responsavel_atividade;
	}

	public Long getId_responsavel_atividade() {
		return id_responsavel_atividade;
	}

	public void setId_responsavel_atividade(Long id_responsavel_atividade) {
		this.id_responsavel_atividade = id_responsavel_atividade;
	}

	public String getResponsavel_atividade() {
		return responsavel_atividade;
	}

	public void setResponsavel_atividade(String responsavel_atividade) {
		this.responsavel_atividade = responsavel_atividade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_responsavel_atividade);
	}

	public String getEmail_responsavel_atividade() {
		return email_responsavel_atividade;
	}

	public void setEmail_responsavel_atividade(String email_responsavel_atividade) {
		this.email_responsavel_atividade = email_responsavel_atividade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponsavelAtividade other = (ResponsavelAtividade) obj;
		return Objects.equals(id_responsavel_atividade, other.id_responsavel_atividade);
	}

	@Override
	public String toString() {
		return "ResponsavelAtividade [id_responsavel_atividade=" + id_responsavel_atividade + ", responsavel_atividade="
				+ responsavel_atividade + "]";
	}

}
