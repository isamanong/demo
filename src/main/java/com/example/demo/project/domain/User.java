package com.example.demo.project.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class User extends Base {
	private Integer id;
	private String name0;
	private String name1;
	private String name2;
	private String name3;
}
