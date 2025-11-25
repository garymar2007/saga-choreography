package com.gary.bookingservice.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{
    Booking findByBookingCode(String bookingId)
}
