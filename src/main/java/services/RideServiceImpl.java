package services;

import forms.RideForm;
import models.Ride;
import repositories.RideRepository;

public class RideServiceImpl implements RideService{

    private final RideRepository ridesRepository;

    public RideServiceImpl(RideRepository ridesRepository) {
        this.ridesRepository = ridesRepository;
    }

    @Override
    public Ride createNew(RideForm rideForm) {
        Ride ride = new Ride();
        ride.setDeparture(rideForm.getDeparture());
        ride.setDestination(rideForm.getDestination());
        ride.setSeats(rideForm.getSeats());
        ride.setPrice(rideForm.getPrice());
        ride.setCar(rideForm.getCar());
        ride.setTime(rideForm.getTime());
        return ridesRepository.save(ride);
    }
}
