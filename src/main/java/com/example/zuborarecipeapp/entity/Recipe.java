package com.example.zuborarecipeapp.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Recipe {

	private Integer id;
	private String name;
	private String description;
	private String material;
	private String imagePath;
	private String category;
	private List<Icon> iconList;
}


