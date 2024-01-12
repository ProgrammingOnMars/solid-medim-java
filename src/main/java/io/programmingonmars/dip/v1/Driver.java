package io.programmingonmars.dip.v1;


import java.util.UUID;

public record Driver(UUID id, String name, Motorcycle motorcycle) {
}
