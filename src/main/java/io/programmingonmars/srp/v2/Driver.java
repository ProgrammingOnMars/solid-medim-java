package io.programmingonmars.srp.v2;

import java.util.UUID;

public record Driver(UUID id, String name, String workRegion, String vehicleType) {
    public Driver(String name, String workRegion, String vehicleType) {
        this(UUID.randomUUID(), name, workRegion, vehicleType);
    }
}
