package com.vishal.project.uber.uberApp.service;

import com.vishal.project.uber.uberApp.dto.DriverDto;
import com.vishal.project.uber.uberApp.dto.RideDto;

import java.util.List;

public interface DriverService {
    RideDto acceptRide(Long rideId);
    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);
    RideDto rateRider(Long rideId,Integer rating);
    DriverDto getMyProfile();
    List<RideDto> getAllMyRides();
}
