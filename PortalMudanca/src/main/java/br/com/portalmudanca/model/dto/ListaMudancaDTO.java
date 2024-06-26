package br.com.portalmudanca.model.dto;

import java.time.LocalDateTime;
import java.util.Objects;

import br.com.portalmudanca.model.TipoMudanca;

public class ListaMudancaDTO {
	
	private Long id_mudanca;	
	private String titulo_mudanca;
	private LocalDateTime dt_criacao;
	private LocalDateTime dt_alteracao;
	private String login_user;
	private String statusMudanca;
	private TipoMudanca tipoMudanca;
	
	public Long getId_mudanca() {
		return id_mudanca;
	}
	public void setId_mudanca(Long id_mudanca) {
		this.id_mudanca = id_mudanca;
	}
	public String getTitulo_mudanca() {
		return titulo_mudanca;
	}
	public void setTitulo_mudanca(String titulo_mudanca) {
		this.titulo_mudanca = titulo_mudanca;
	}
	public LocalDateTime getDt_criacao() {
		return dt_criacao;
	}
	public void setDt_criacao(LocalDateTime dt_criacao) {
		this.dt_criacao = dt_criacao;
	}
	public LocalDateTime getDt_alteracao() {
		return dt_alteracao;
	}
	public void setDt_alteracao(LocalDateTime dt_alteracao) {
		this.dt_alteracao = dt_alteracao;
	}
	public String getLogin_user() {
		return login_user;
	}
	public void setLogin_user(String login_user) {
		this.login_user = login_user;
	}
	public String getStatusMudanca() {
		return statusMudanca;
	}
	public void setStatusMudanca(String statusMudanca) {
		this.statusMudanca = statusMudanca;
	}
	public TipoMudanca getTipoMudanca() {
		return tipoMudanca;
	}
	public void setTipoMudanca(TipoMudanca tipoMudanca) {
		this.tipoMudanca = tipoMudanca;
	}
	@Override
	public String toString() {
		return "ListaMudancaDTO [id_mudanca=" + id_mudanca + ", titulo_mudanca=" + titulo_mudanca + ", dt_criacao="
				+ dt_criacao + ", dt_alteracao=" + dt_alteracao + ", login_user=" + login_user + ", statusMudanca="
				+ statusMudanca + ", tipoMudanca=" + tipoMudanca + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id_mudanca);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaMudancaDTO other = (ListaMudancaDTO) obj;
		return Objects.equals(id_mudanca, other.id_mudanca);
	}
	

	

}
