package com.gary.bookingservice.service;

import com.gary.bookingservice.repository.BookingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BookingService {
    private final BookingRepository repository;

}
