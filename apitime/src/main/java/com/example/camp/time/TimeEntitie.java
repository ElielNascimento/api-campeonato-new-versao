package com.example.camp.time;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_time")
public class TimeEntitie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	private TimeEnum timeEnum;

	public TimeEntitie() {

	}

	public TimeEntitie(Long id, String nome, TimeEnum timeEnum) {
		this.id = id;
		this.nome = nome;
		this.timeEnum = timeEnum;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public TimeEnum getTimeEnum() {
		return timeEnum;
	}

	public void setTimeEnum(TimeEnum timeEnum) {
		this.timeEnum = timeEnum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeEntitie other = (TimeEntitie) obj;
		return Objects.equals(id, other.id);
	}

}
