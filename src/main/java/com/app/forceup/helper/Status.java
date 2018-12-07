package com.app.forceup.helper;

import java.util.Date;

public class Status {
	
	public String deviceId;
	public String webhookId;
	public Date dispatchedAt;
	public String eventType;
	public Date recordedAt;
	
	public Status(String _deviceId, String _webhookId, Date _dispatchedAt,
			String _eventType, Date _recordedAt) {
		deviceId = _deviceId;
		webhookId = _webhookId;
		dispatchedAt = _dispatchedAt;
		eventType = _eventType;
		recordedAt = _recordedAt;
	}


	protected void updateParentStatus(com.app.forceup.model.Status status) {
		status.setDeviceId(deviceId);
		status.setWebhookId(webhookId);
		status.setDispatchedAt(dispatchedAt);
		status.setEventType(eventType);
		status.setRecordedAt(recordedAt);
		
	}
	
}
