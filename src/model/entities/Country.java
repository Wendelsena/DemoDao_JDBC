package model.entities;

import java.io.Serializable;

public class Country implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer country_id;
	private String name;
	
	private Category category;
	
	public Country() {
	}

	public Country(Integer country_id, String name, Category category) {
		this.country_id = country_id;
		this.name = name;
		this.category = category;
	}

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country_id == null) ? 0 : country_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (country_id == null) {
			if (other.country_id != null)
				return false;
		} else if (!country_id.equals(other.country_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [country_id = " + country_id + ", name = " + name + ", category = " + category + "]";
	}
	
	
	
	
}
