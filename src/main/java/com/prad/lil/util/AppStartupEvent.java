package com.prad.lil.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.prad.lil.data.Guest;
import com.prad.lil.data.GuestRepository;
import com.prad.lil.data.Reservation;
import com.prad.lil.data.ReservationRepository;
import com.prad.lil.data.Room;
import com.prad.lil.data.RoomRepository;

@Component	//allows spring to automatically detect our custom beans
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>{ //<wait till spring is ready before querying the db> 
    private final RoomRepository roomRepository;                                    //important that db is setup before running the code
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    public AppStartupEvent(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository){
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        rooms.forEach(System.out::println); //rooms.forEach(x -> System.out.println(x))
        Iterable<Guest> guests = this.guestRepository.findAll();
        guests.forEach(System.out::println);
        Iterable<Reservation> reservations = this.reservationRepository.findAll();
        reservations.forEach(System.out::println);
    }

}
