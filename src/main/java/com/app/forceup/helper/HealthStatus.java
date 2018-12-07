package com.app.forceup.helper;

import java.util.Date;

import com.google.inject.Inject;

import lombok.Data;

@Data
public class HealthStatus extends Status {
	
	public String locationType;
	public String locationCoordinates;
	public String deviceStatus;
	private com.app.forceup.model.Status _status;
	
	public HealthStatus(String _deviceId, String _webhookId, Date _dispatchedAt,
			String _eventType, Date _recordedAt,
			String _locationType, String _locationCoordinates, String _deviceStatus) {
		super(_deviceId, _webhookId, _dispatchedAt,
				_eventType, _recordedAt);
		locationType = _locationType;
		locationCoordinates = _locationCoordinates;
		deviceStatus = _deviceStatus;
	}
	
	public com.app.forceup.model.Status getStatusModel() {
		_status = new com.app.forceup.model.Status();
		_status.setDeviceStatus(this.deviceStatus);
		_status.setLocationCoordinates(this.locationCoordinates);
		_status.setLocationType(this.locationType);
		updateParentStatus(_status);
		return _status;
	}

}
