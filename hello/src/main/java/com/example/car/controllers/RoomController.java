package com.example.car.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RoomController {

    @GetMapping("/roominfo")
    public Room getRoomInfoById(@RequestParam(value = "room_id") int roomId) {

        return new Room(roomId, "Отличная комната!", 2, 200);
    }
}

