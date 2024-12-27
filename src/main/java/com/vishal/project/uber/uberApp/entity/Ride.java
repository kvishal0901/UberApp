package com.vishal.project.uber.uberApp.entity;


import com.vishal.project.uber.uberApp.entity.enums.PaymentMethod;
import com.vishal.project.uber.uberApp.entity.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.geolatte.geom.Point;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter

public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point dropOffLocation;

    private LocalDateTime requestedtime;

    private LocalDateTime pickUpTime;

    private LocalDateTime expectedPickuptime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;

}
