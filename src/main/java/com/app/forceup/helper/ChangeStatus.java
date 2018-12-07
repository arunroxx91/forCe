package com.app.forceup.helper;

import java.util.Date;

public class ChangeStatus extends Status {
	
	private String locationType;
	private String locationCoordinates;
	private String noDataReason;
	
    private com.app.forceup.model.Status _status;
    
	public ChangeStatus(String _deviceId, String _webhookId, Date _dispatchedAt,
			String _eventType, Date _recordedAt,
			String _locationType, String _locationCoordinates,
			String _noDataReason) {
		super(_deviceId, _webhookId, _dispatchedAt,
				_eventType, _recordedAt);
		locationType = _locationType;
		locationCoordinates = _locationCoordinates;
		noDataReason = _noDataReason;
	}
	
	public com.app.forceup.model.Status getStatusModel() {
		_status = new com.app.forceup.model.Status();
		_status.setLocationCoordinates(this.locationCoordinates);
		_status.setLocationType(this.locationType);
		_status.setNoDataReason(this.noDataReason);
		updateParentStatus(_status);
		return _status;
	}

}
