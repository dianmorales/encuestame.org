package org.jp.developer.persistence.pojo;

// Generated 01-17-2009 11:50:28 AM by Hibernate Tools 3.2.2.GA

/**
 * ProyectLocation generated by hbm2java
 */
public class ProyectLocation implements java.io.Serializable {

	private ProyectLocationId id;
	private int idEstado;

	public ProyectLocation() {
	}

	public ProyectLocation(ProyectLocationId id, int idEstado) {
		this.id = id;
		this.idEstado = idEstado;
	}

	public ProyectLocationId getId() {
		return this.id;
	}

	public void setId(ProyectLocationId id) {
		this.id = id;
	}

	public int getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

}
