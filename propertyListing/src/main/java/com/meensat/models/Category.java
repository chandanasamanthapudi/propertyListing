package com.meensat.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		
		String name;
		
		String description; 

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Category() {
			
		}

		public Category(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
		}
		
}
