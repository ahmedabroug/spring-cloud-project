package com.frankmoley.business.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.frankmoley.business.reservation.client.RoomService;
import com.frankmoley.business.reservation.domain.Room;

/**
 * Created by ahmed.
 */
@RestController
public class RoomReservationController {
	
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private RoomService roomService;

    @GetMapping("/roomsByFeign")
    public List<Room> getAllRoomsByFeign(){
        return this.roomService.findAll(null);
    }
    
    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        ResponseEntity<List<Room>> roomsResponse = this.restTemplate.exchange(
                "http://ROOMSERVICES/rooms", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Room>>() {
                });
        return roomsResponse.getBody();
    }

}
