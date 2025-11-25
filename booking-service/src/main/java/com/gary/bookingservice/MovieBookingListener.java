package com.gary.bookingservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MovieBookingListener {

    private BookingService service;

    public MovieBookingListener(final BookingService service) {
        this.service = service;
    }
}

