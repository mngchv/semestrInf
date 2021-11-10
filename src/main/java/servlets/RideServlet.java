package servlets;

import forms.RideForm;
import repositories.RideRepository;
import repositories.RideRepositoryImpl;
import services.RideService;
import services.RideServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet("/CreateTrip")

public class RideServlet extends HttpServlet {

    private RideService rideService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../jsp/CreateTrip.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        RideForm rideForm = new RideForm();
        rideForm.setDeparture(req.getParameter("From"));
        rideForm.setDestination(req.getParameter("To"));
        rideForm.setSeats(req.getParameter("seats"));
        rideForm.setPrice(req.getParameter("cost"));
        rideForm.setCar(req.getParameter("car"));
        rideForm.setTime(req.getParameter("time"));

        rideService.createNew(rideForm);

        req.getRequestDispatcher("../jsp/CreateTrip.jsp").forward(req, resp);
    }



    @Override
    public void init() throws ServletException {
        super.init();
        try {
            //Подгружаем драйвер, оно автоматически регистрирует JDBC
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/semestr", "postgres", "postgres");

            RideRepository rideRepository = new RideRepositoryImpl(connection);
            rideService = new RideServiceImpl(rideRepository);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Unavailable");
            throw new UnavailableException("Site unavailable.");
        }
    }}