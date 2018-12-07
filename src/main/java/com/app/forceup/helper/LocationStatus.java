package com.app.forceup.helper;

import java.util.Date;

public class LocationStatus extends Status {
	
	private String locationType;
	private String locationCoordinates;
	private double speed;
	private double bearing;
	private double altitude;
	
    private com.app.forceup.model.Status _status;
    
	public LocationStatus(String _deviceId, String _webhookId, Date _dispatchedAt,
			String _eventType, Date _recordedAt,
			String _locationType, String _locationCoordinates,
			double _speed, double _bearing, double _altitude) {
		super(_deviceId, _webhookId, _dispatchedAt,
				_eventType, _recordedAt);
		locationType = _locationType;
		locationCoordinates = _locationCoordinates;
		speed = _speed;
		bearing = _bearing;
		altitude = _altitude;	
	}
	
	public com.app.forceup.model.Status getStatusModel() {
		_status = new com.app.forceup.model.Status();
		_status.setLocationCoordinates(this.locationCoordinates);
		_status.setLocationType(this.locationType);
		_status.setSpeed(this.speed);
		_status.setBearing(this.bearing);
		_status.setAltitude(this.altitude);
		updateParentStatus(_status);
		return _status;
	}

}
