package com.deviceseller.repository.projection;

import com.deviceseller.model.DeviceType;

import java.time.LocalDateTime;

public interface PurchaseItem {

    String getName();

    DeviceType getType();

    Double getPrice();

    String getColor();

    LocalDateTime getPurchaseTime();
}
