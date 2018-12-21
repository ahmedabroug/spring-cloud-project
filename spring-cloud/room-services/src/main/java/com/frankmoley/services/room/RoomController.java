package com.frankmoley.services.room;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ahmed.
 */
@RestController
@RequestMapping(value="/rooms")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;

    @GetMapping()
    public List<Room> findAll(@RequestParam(name="roomNumber", required = false)String roomNumber){
        if(StringUtils.isNotEmpty(roomNumber)){
            return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
        }
        return  this.roomRepository.findAll();
    }
}
