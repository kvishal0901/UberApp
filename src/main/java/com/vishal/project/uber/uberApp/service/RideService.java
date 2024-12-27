package com.vishal.project.uber.uberApp.service;

import com.vishal.project.uber.uberApp.dto.RideRequestDto;
import com.vishal.project.uber.uberApp.entity.Driver;
import com.vishal.project.uber.uberApp.entity.Ride;
import com.vishal.project.uber.uberApp.entity.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
