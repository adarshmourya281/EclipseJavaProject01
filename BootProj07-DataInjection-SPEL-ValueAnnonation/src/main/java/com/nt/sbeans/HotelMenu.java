package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menu")
@Data
public class HotelMenu {

	@Value("${dosa.price}")
	private Float dosaRate;
	@Value("${idly.price}")
	private Float idlyRate;
	@Value("${wada.price}")
	private Float wadaRate;
	@Override
	public String toString() {
		return "HotelMenu [dasaRate=" + dosaRate + ", idlyRate=" + idlyRate + ", wadaRate=" + wadaRate + "]";
	}
	
	
}
