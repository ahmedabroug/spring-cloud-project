package com.frankmoley.business.reservation.domain;

import lombok.Data;

/**
 * Created by ahmed.
 */

@Data
public class Room {
    private long id;
    private String name;
    private String roomNumber;
    private String bedInfo;

}
