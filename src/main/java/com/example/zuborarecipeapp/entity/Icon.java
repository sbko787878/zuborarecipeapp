package com.example.zuborarecipeapp.entity;

import lombok.Data;

@Data
public class Icon {
    private Integer id;       // DBのicons.id
    private String iconName;  // DBのicons.icon_name
    private String iconPath;  // DBのicons.icon_path
}