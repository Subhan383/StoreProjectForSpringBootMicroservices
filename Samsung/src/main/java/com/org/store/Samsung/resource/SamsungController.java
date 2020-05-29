package com.org.store.Samsung.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.store.Samsung.model.Device;
import com.org.store.Samsung.model.Devices;

@RestController
@RequestMapping("/samsung")
public class SamsungController {

	@RequestMapping("/devices")
	public Devices getDevices() {
		List<Device> samsungDevices = new ArrayList<Device>();
		samsungDevices.add(new Device("Note8", "Smartphone"));
		samsungDevices.add(new Device("Galaxy", "Android"));
		samsungDevices.add(new Device("GalaxyPro", "Smartphone"));
		samsungDevices.add(new Device("GalaxyProMax", "Android"));

		Devices deviceList = new Devices(samsungDevices);
		return deviceList;

	}

}
