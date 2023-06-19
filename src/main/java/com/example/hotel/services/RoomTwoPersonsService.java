package com.example.hotel.services;
import com.example.hotel.entities.RoomTwoPersons;
import com.example.hotel.repositories.RoomTwoPersonsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomTwoPersonsService {
    private RoomTwoPersonsRepository roomTwoPersonsRepository;
    public List<RoomTwoPersons> getRoomTwoPerson() {
        return roomTwoPersonsRepository.findAll();
    }

}
