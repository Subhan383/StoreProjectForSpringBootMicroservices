package com.org.store.apple.model;

public class Device {

	private String deviceName;
	private String deviceType;

	public Device() {

	}

	public Device(String deviceName, String deviceType) {

		this.deviceName = deviceName;
		this.deviceType = deviceType;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", deviceType=" + deviceType + "]";
	}

	
}
