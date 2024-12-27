package com.vishal.project.uber.uberApp.service;

import com.vishal.project.uber.uberApp.dto.DriverDto;
import com.vishal.project.uber.uberApp.dto.RideDto;
import com.vishal.project.uber.uberApp.dto.RideRequestDto;
import com.vishal.project.uber.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(Long rideId);
    RideDto cancelRide(Long rideId);
  //  RideDto startRide(Long rideId);
  //  RideDto endRide(Long rideId);
    DriverDto rateDriver(Long rideId,Integer rating);
    RiderDto getMyProfile();
    List<RideDto> getAllMyRides();
}
