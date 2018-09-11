package org.endurance.app.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the abc database table.
 * 
 */
@Entity
@NamedQuery(name="Abc.findAll", query="SELECT a FROM Abc a")
public class Abc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	public Abc() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}