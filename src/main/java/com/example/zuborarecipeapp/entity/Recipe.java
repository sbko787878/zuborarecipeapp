package com.example.zuborarecipeapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Recipe {

	private int id;
	private String name;
	private String description;
	private String material;
	private String imagePath;
	private String iconPath;
}
