package com.frankmoley.business.reservation.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.frankmoley.business.reservation.domain.Room;

/**
 * Created by ahmed.
 */
@FeignClient(value="ROOMSERVICES")
public interface RoomService {

    @GetMapping(value="/rooms")
    List<Room> findAll(@RequestParam(name="roomNumber", required=false)String roomNumber);
}
