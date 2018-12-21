package com.frankmoley.services.room;

import javax.persistence.*;

import lombok.Data;

/**
 * Created by ahmed.
 */

@Data
@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="ROOM_NUMBER")
    private String roomNumber;
    @Column(name="BED_INFO")
    private String bedInfo;


}
