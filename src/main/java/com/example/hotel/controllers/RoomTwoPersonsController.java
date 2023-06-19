package com.example.hotel.controllers;

import com.example.hotel.services.RoomTwoPersonsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class RoomTwoPersonsController {
    private RoomTwoPersonsService roomTwoPersonsService;

    @GetMapping("/roomTwoPersons")
    public String showRooms(Model model) {
        model.addAttribute("roomTwoPersons", roomTwoPersonsService.getRoomTwoPerson());
        return "roomTwoPersons";
    }
}
