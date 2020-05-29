package com.org.store.apple.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.store.apple.model.Device;
import com.org.store.apple.model.Devices;

@RestController
@RequestMapping("/apple")
public class AppleController {
	
	@RequestMapping("/devices")
	public Devices getDevices() {
		List<Device> devices=new ArrayList<Device>();
		devices.add(new Device("Iphoone8","IphoneSeries"));
		devices.add(new Device("Iphoone10","IOS"));
		devices.add(new Device("Iphoone11","CameraFeature"));
		devices.add(new Device("Iphoone6","BasicSeries"));
		
		Devices appledevicesList=new Devices(devices);
		return appledevicesList;
		
	}

}
