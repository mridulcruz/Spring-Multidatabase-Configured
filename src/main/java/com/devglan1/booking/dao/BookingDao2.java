package com.devglan1.booking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devglan.model.Booking;

@Repository
public interface BookingDao2 extends CrudRepository<Booking, Long> {

	List<Booking> findByCreatedBy(Long userId);

}
