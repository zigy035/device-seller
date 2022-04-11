package com.deviceseller.service;

import com.deviceseller.model.Device;
import com.deviceseller.model.Purchase;
import com.deviceseller.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public Device saveDevice(Device device) {
        device.setCreateTime(LocalDateTime.now());
        return deviceRepository.save(device);
    }

    public void deleteDevice(Long id) {
        deviceRepository.deleteById(id);
    }

    public List<Device> findAllDevices() {
        return deviceRepository.findAll();
    }
}