package model.entities;

import java.io.Serializable;

public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer category_id;
	private String name;
	
	public Category() {
	}

	public Category(Integer category_id, String name) {
		this.category_id = category_id;
		this.name = name;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category_id == null) ? 0 : category_id.hashCode());
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
		Category other = (Category) obj;
		if (category_id == null) {
			if (other.category_id != null)
				return false;
		} else if (!category_id.equals(other.category_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [category_id = " + category_id + ", name = " + name + "]";
	}
	
	
}
