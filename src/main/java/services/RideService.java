package services;

import forms.RideForm;
import models.Ride;

public interface RideService {
        Ride createNew(RideForm rideForm);
    }
