package com.app.forceup.helper;

import java.util.Date;

public class ActivityStatus extends Status {
	
	public double distance;
	public int duration;
    public String previousActivity;
    public String activity;
    public String polyline;
    private com.app.forceup.model.Status _status;
    
	public ActivityStatus(String _deviceId, String _webhookId, Date _dispatchedAt,
			String _eventType, Date _recordedAt,
			double _distance, int _duration,
			String _previousActivity, String _activity, String _polyline) {
		super(_deviceId, _webhookId, _dispatchedAt,
				_eventType, _recordedAt);
		distance = _distance;
		duration = _duration;
		polyline = _polyline;
		previousActivity = _previousActivity;
		activity = _activity;
	}
	

	public com.app.forceup.model.Status getStatusModel() {
		_status = new com.app.forceup.model.Status();
		_status.setDistance(this.distance);
		_status.setDuration(this.duration);
		_status.setPreviousActivity(this.previousActivity);
		_status.setDeviceStatus(this.activity);
		_status.setPolyline(this.polyline);
		updateParentStatus(_status);
		return _status;
	}

    

}
