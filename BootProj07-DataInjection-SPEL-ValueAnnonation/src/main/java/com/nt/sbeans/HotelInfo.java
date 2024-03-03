package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hInfo")
@Data
public class HotelInfo {
	
	@Value("1001")
	private Integer id;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.location}")
	private String location;
	@Value("${customer.name}")
	private String customerName;

	@Value("#{menu.dosaRate+menu.wadaRate+menu.wadaRate}")//SPEL
	private Float billAmt;
	@Value("${os.name}")
	private String osName;
	@Value("${user.name}")
	private String winUserName;
	@Value("${path}")
	private String pathData;
	@Override
	public String toString() {
		return "HotelInfo [id=" + id + ", hotelName=" + hotelName + ", location=" + location + ", customerName="
				+ customerName + ", billAmt=" + billAmt + ", osName=" + osName + ", winUserName=" + winUserName
				+ ", pathData=" + pathData + "]";
	}
	
	
}
