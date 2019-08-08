package com.bhouma.app.bhouma.service.vo;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Geo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8336583945519083262L;

	private String logitude;
	private String latitude;
}
