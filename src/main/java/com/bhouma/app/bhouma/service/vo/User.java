package com.bhouma.app.bhouma.service.vo;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDate dob;
}
