package com.app.forceup.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.app.appforceup.enumeration.EventChange;

@Component
public class StatusBuilder {
	
	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	private static final Logger LOGGER = LoggerFactory.getLogger(StatusBuilder.class);
	
	@SuppressWarnings("unchecked")
	public com.app.forceup.model.Status createHealthUpdateStatus(Map<String, Object> objectMapper) {
		try {
			final String deviceId = objectMapper.get("device_id").toString();
			final String date = objectMapper.get("dispatched_at").toString().split("\\.")[0];
			final String recordedDate = objectMapper.get("recorded_at").toString().split("\\.")[0];
			final Date dispatchedAt = dateFormat.parse(date);
			final String eventType = EventChange.health.toString();
			final String webhookId = objectMapper.get("webhook_id").toString();
			final Date recordedAt = dateFormat.parse(recordedDate);
			final String deviceStatus = ((Map<String, Object>) objectMapper.get("data")).get("value").toString();
			final String locationType = ((Map<String, Object>) ((Map<String, Object>) ((Map<String, Object>) objectMapper.get("data")).get("place")).get("location")).get("type").toString();
			final String locationCoordinates = ((Map<String, Object>) ((Map<String, Object>) ((Map<String, Object>) objectMapper.get("data")).get("place")).get("location")).get("coordinates").toString();
			HealthStatus healthStatus = new HealthStatus(deviceId, webhookId, dispatchedAt, eventType, 
					recordedAt, locationType, locationCoordinates, deviceStatus);
			return healthStatus.getStatusModel();
		} catch (Exception e) {
			LOGGER.error("Error while parsing the health status webhook message");
			return null;

		}
	}
	
	@SuppressWarnings("unchecked")
	public com.app.forceup.model.Status createActivityUpdateStatus(Map<String, Object> objectMapper) {
		try {
			final String deviceId = objectMapper.get("device_id").toString();
			final String date = objectMapper.get("dispatched_at").toString().split("\\.")[0];
			final String recordedDate = objectMapper.get("recorded_at").toString().split("\\.")[0];
			final Date dispatchedAt = dateFormat.parse(date);
			final String eventType = EventChange.activity.toString();
			final String webhookId = objectMapper.get("webhook_id").toString();
			final Date recordedAt = dateFormat.parse(recordedDate);
			final String previousActivity = ((Map<String, Object>) objectMapper.get("data")).get("previous_activity").toString();
			final String activity = ((Map<String, Object>) objectMapper.get("data")).get("activity").toString();
			final int duration = Integer.parseInt(((Map<String, Object>) ((Map<String, Object>) objectMapper.get("data")).get("route")).get("duration").toString());
			final String polyline = ((Map<String, Object>) ((Map<String, Object>) objectMapper.get("data")).get("route")).get("polyline").toString();
			final double distance =  (double) ((Map<String, Object>) ((Map<String, Object>) objectMapper.get("data")).get("route")).get("distance");
			ActivityStatus activityStatus = new ActivityStatus(deviceId, webhookId, dispatchedAt, eventType, 
					recordedAt, distance, duration, 
					previousActivity, activity, polyline);
			return activityStatus.getStatusModel();
		} catch (Exception e) {
			LOGGER.error("Error while parsing the activity status webhook message" + e);
			return null;

		}
	}
	
	@SuppressWarnings("unchecked")
	public com.app.forceup.model.Status createChangeStatus(Map<String, Object> objectMapper) {
		try {
			final String deviceId = objectMapper.get("device_id").toString();
			final String recordedDate = objectMapper.get("recorded_at").toString().split("\\.")[0];
			Date dispatchedAt = null;
			String webhookId = null;
			String locationType = null, locationCoordinates = null;
			try {
				final String date = objectMapper.get("dispatched_at").toString().split("\\.")[0];
								dispatchedAt = dateFormat.parse(date);
				webhookId = objectMapper.get("webhook_id").toString();
				locationType = ((Map<String, Object>)  ((Map<String, Object>) objectMapper.get("data")).get("location")).get("type").toString();
				locationCoordinates = ((Map<String, Object>) ((Map<String, Object>) objectMapper.get("data")).get("location")).get("coordinates").toString();
			} catch (Exception e) {
				LOGGER.error("Error while parsing the activity status webhook message" + e);
			}
			final String eventType = EventChange.status.toString();
			
			final Date recordedAt = dateFormat.parse(recordedDate);

			final String noDataReason = ((Map<String, Object>) objectMapper.get("data")).get("no_data_reason").toString();
			
			ChangeStatus changeStatus = new ChangeStatus(deviceId, webhookId, dispatchedAt, eventType, 
					recordedAt, locationType, locationCoordinates, noDataReason);
			return changeStatus.getStatusModel();
		} catch (Exception e) {
			System.out.println("Asdfasdfads");
			LOGGER.error("Error while parsing the activity status webhook message" + e);
			return null;

		}
	}
	
	@SuppressWarnings("unchecked")
	public com.app.forceup.model.Status createLocationChange(Map<String, Object> objectMapper) {
		try {
			final String deviceId = objectMapper.get("device_id").toString();
			final String recordedDate = objectMapper.get("recorded_at").toString().split("\\.")[0];
			Date dispatchedAt = null;
			String webhookId = null;
			try {
				final String date = objectMapper.get("dispatched_at").toString().split("\\.")[0];
								dispatchedAt = dateFormat.parse(date);
				webhookId = objectMapper.get("webhook_id").toString();
			} catch (Exception e) {
				LOGGER.error("Error while parsing the activity status webhook message" + e);
			}
			final String eventType = EventChange.status.toString();
			
			final Date recordedAt = dateFormat.parse(recordedDate);
			
			final String locationType = ((Map<String, Object>)  ((Map<String, Object>) objectMapper.get("data")).get("location")).get("type").toString();
			final double speed = (double) (((Map<String, Object>) objectMapper.get("data")).get("speed"));
			final double altitude = (double) (((Map<String, Object>) objectMapper.get("data")).get("altitude"));
			final double bearing = (double) (((Map<String, Object>) objectMapper.get("data")).get("bearing"));
			final String locationCoordinates = ((Map<String, Object>) ((Map<String, Object>) objectMapper.get("data")).get("location")).get("coordinates").toString();
			LocationStatus locationStatus = new LocationStatus(deviceId, webhookId, dispatchedAt, eventType, 
					recordedAt, locationType, locationCoordinates, speed, bearing, altitude);
			return locationStatus.getStatusModel();
		} catch (Exception e) {
			LOGGER.error("Error while parsing the activity status webhook message" + e);
			return null;

		}
	}
	
	
	
	
	public void createStatus(Map<String, Object> statusDetails) {
		
	}

}
