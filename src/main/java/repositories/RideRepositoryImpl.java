package repositories;

import models.Ride;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RideRepositoryImpl implements RideRepository{

    private final Connection connection;
    //language=sql
    private final String SQL_INSERT_RIDE = "INSERT INTO rides(departure,destination,seats,price,car,time) VALUES (?, ?, ?,?, ?, ?)";
    private final String SQL_FIND_RIDE_BY_DEPARTURE = "SELECT * FROM rides WHERE departure=?;";

    public RideRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Ride> findAll() {
        List<Ride> rides = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("select * from rides");
            while (set.next()) {
                int id = set.getInt("id");
                String departure = set.getString("departure");
                String destination = set.getString("destination");
                String seats = set.getString("seats");
                String price = set.getString("price");
                String car = set.getString("car");
                String time = set.getString("time");





                Ride ride = Ride.builder()
                        .id((long) id)
                        .departure(departure)
                        .destination(destination)
                        .car(car)
                        .time(time)
                        .seats(seats)
                        .price(price)
                        .build();

                rides.add(ride);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rides;

    }

    @Override
    public Optional<Ride> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Ride save(Ride ride) {
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_RIDE, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, ride.getDeparture());
            preparedStatement.setString(2, ride.getDestination());
            preparedStatement.setString(3, ride.getSeats());
            preparedStatement.setString(4, ride.getPrice());
            preparedStatement.setString(5, ride.getCar());
            preparedStatement.setString(6, ride.getTime());


            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                ride.setId(resultSet.getLong("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ride;
    }

    @Override
    public void deleteById(Long id) {

    }

}
