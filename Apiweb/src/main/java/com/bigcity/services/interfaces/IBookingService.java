/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigcity.services.interfaces;

import com.bigcity.entity.Book;
import com.bigcity.entity.Booking;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;

/**
 *
 * @author nicolasdotnet
 */
public interface IBookingService {

    /**
     * method to register a booking
     *
     * @param librarianId
     * @param bookingUserId
     * @param bookId
     * @return
     * @throws Exception
     */
    Booking register(Long librarianId, Long bookingUserId, Long bookId) throws Exception;

    /**
     * method to stop a booking when book is back
     *
     * @param bookingId
     * @return
     * @throws Exception
     */
    Booking bookIsBack(Long bookingId) throws Exception;
    
    /**
     * method to extend a booking
     * 
     * @param bookingId
     * @return
     * @throws Exception
     */
    Booking extendBooking(Long bookingId) throws Exception;

    /**
     * method to make a book back request
     *
     * @return
     * @throws Exception
     */
    List<Booking> getOutdatedBookingList() throws Exception;

    /**
     * method to get a booking
     *
     * @param bookingId
     * @return
     * @throws Exception
     */
    Booking getBooking(Long bookingId) throws Exception;

    /**
     * method to get all bookings 
     *
     * @return
     * @throws Exception
     */
    List<Booking> getAllBookings() throws Exception;

    /**
     * method to get all bookings by ask user
     *
     * @param username
     * @return
     * @throws Exception
     */
    List<Booking> getAllBookingByUser(String username) throws Exception;

    /**
     * method to remove a booking
     *
     * @param bookingId
     */
    void delete(Long bookingId);

}