package com.example.camp.time;

import java.util.Objects;

public class TimeDTO {

	private Long id;
	private String nome;
	private TimeEnum timeEnum;

	public TimeDTO() {
	}

	public TimeDTO(Long id, String nome, TimeEnum timeEnum) {
		this.id = id;
		this.nome = nome;
		this.timeEnum = timeEnum;
	}

	public TimeDTO(TimeEntitie obj) {
		id = obj.getId();
		nome = obj.getNome();
		timeEnum = obj.getTimeEnum();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		TimeDTO other = (TimeDTO) obj;
		return Objects.equals(id, other.id);
	}

}
