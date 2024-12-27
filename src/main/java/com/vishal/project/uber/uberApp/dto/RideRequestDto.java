package com.vishal.project.uber.uberApp.dto;

import com.vishal.project.uber.uberApp.entity.Driver;
import com.vishal.project.uber.uberApp.entity.Rider;
import com.vishal.project.uber.uberApp.entity.enums.PaymentMethod;
import com.vishal.project.uber.uberApp.entity.enums.RideRequestStatus;
import org.geolatte.geom.Point;

import java.time.LocalDateTime;

public class RideRequestDto {
    private Long id;


    private Point pickupLocation;


    private Point dropOffLocation;

    private LocalDateTime requestedtime;

    private LocalDateTime pickUpTime;

   // private LocalDateTime expectedPickuptime;


    private RiderDto rider;


   // private Driver driver;


    private PaymentMethod paymentMethod;


    private RideRequestStatus rideRequestStatus;


}
