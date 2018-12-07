package com.app.forceup.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "status")
public class Status {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getLocationInfo() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType =  locationType;
	}
	
	public String getLocationCoordinates() {
		return locationCoordinates;
	}

	public void setLocationCoordinates(String locationCoordinates) {
		this.locationCoordinates = locationCoordinates;
	}

	public String getWebhookId() {
		return webhookId;
	}

	public void setWebhookId(String webhookId) {
		this.webhookId = webhookId;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Date getDispatchedAt() {
		return dispatchedAt;
	}

	public void setDispatchedAt(Date dispatchedAt) {
		this.dispatchedAt = dispatchedAt;
	}

	public Date getRecordedAt() {
		return recordedAt;
	}

	public void setRecordedAt(Date recordedAt) {
		this.recordedAt = recordedAt;
	}

	public String getPreviousActivity() {
		return previousActivity;
	}

	public void setPreviousActivity(String previousActivity) {
		this.previousActivity = previousActivity;
	}
	
	public String getPolyline() {
		return polyline;
	}

	public void setPolyline(String polyline) {
		this.polyline = polyline;
	}
	
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getBearing() {
		return bearing;
	}

	public void setBearing(double bearing) {
		this.bearing = bearing;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public String getNoDataReason() {
		return noDataReason;
	}

	public void setNoDataReason(String noDataReason) {
		this.noDataReason = noDataReason;
	}

	public String getLocationType() {
		return locationType;
	}

	@Column(name = "device_id")
	private String deviceId;
	
	@Column(name = "device_status")
	private String deviceStatus;
	
	@Column(name = "location_type")
	private String locationType;
	
	@Column(name = "location_coordinates")
	private String locationCoordinates;
	
	@Column(name = "webhook_id")
	private String webhookId;
	
	@Column(name = "event_type")
	private String eventType;
	
	@Column(name = "duration")
	private int duration;
	
	@Column(name = "distance")
	private double distance;
	
	@Column(name = "dispatched_at")
	private Date dispatchedAt;
	
	@Column(name = "recorded_at")
	private Date recordedAt;
	
	@Column(name = "previous_activity")
	private String previousActivity;
	
	@Column(columnDefinition = "TEXT", name = "polyline")
	private String polyline;

	@Column(name = "speed")
	private double speed;
	
	@Column(name = "bearing")
	private double bearing;
	
	@Column(name = "altitude")
	private double altitude;
	
	@Column(name = "no_data_reason")
	private String noDataReason;
	

}
