package com.kingflyer.flightbooking.Controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kingflyer.flightbooking.Exception.ResourceNotFoundException;
import com.kingflyer.flightbooking.Model.Admin;
import com.kingflyer.flightbooking.Model.Flight;
import com.kingflyer.flightbooking.Service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminservice;
    @PostMapping("/addAdmindetails")
    public void addAdmin(@RequestBody Admin admin) {
        adminservice.addAdmin(admin);
    }
    @GetMapping("/findByflightId/{id}")
    public ResponseEntity<Optional<Flight>> findByFlightId(@PathVariable int id) {
        System.out.println(id);
        Optional<Flight> obj = adminservice.findByFlightId(id);
        System.out.println(obj);
        if (obj.isPresent()) {
            adminservice.findByFlightId(id);
        } else {
            throw new ResourceNotFoundException("Given id it's not available in db..");
        }
        return new ResponseEntity<Optional<Flight>>(obj, HttpStatus.OK);
    }
    @GetMapping("/findByremainingEconomySeats/{remainingEconomySeats}")
    public ResponseEntity<Optional<Flight>> remainingEconomySeats(@PathVariable int remainingEconomySeats) {
        System.out.println(remainingEconomySeats);
        Optional<Flight> obj = adminservice.findByRemainingEconomySeats(remainingEconomySeats);
        System.out.println(obj);
        if (obj.isPresent()) {
            adminservice.findByRemainingEconomySeats(remainingEconomySeats);
        } else {
            throw new ResourceNotFoundException("Given EconomySeats it's not available in db..");
        }
        return new ResponseEntity<Optional<Flight>>(obj, HttpStatus.OK);
    }
}