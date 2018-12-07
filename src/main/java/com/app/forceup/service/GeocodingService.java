package com.app.forceup.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

@Service
public class GeocodingService {
	
	@Resource
	@Qualifier("GeoApiContext")
	private GeoApiContext _geoApiContext;
	
	
	public String computeReverseGeoLocation(Double latitude, Double longitude) throws Exception {
		GeocodingResult[] gResp = GeocodingApi.newRequest(_geoApiContext).latlng(new LatLng(latitude, longitude)).await();
		if(gResp.length > 0) {
			return gResp[0].formattedAddress;
		} else {
			return null;
		}
	}

}
