package servlets;

import forms.UserForm;
import repositories.UsersRepository;
import repositories.UsersRepositoryImpl;
import services.UserService;
import services.UserServiceImpl;

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

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private UserService usersService;


    @Override
    public void init() throws ServletException {
        try {

            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/semestr", "postgres", "postgres");

            UsersRepository usersRepository = new UsersRepositoryImpl(connection);
            usersService = new UserServiceImpl(usersRepository);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Unavailable");
            throw new UnavailableException("Site unavailable.");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/registration.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        UserForm userForm = new UserForm();
        userForm.setNickname(request.getParameter("nickname"));
        userForm.setPassword(request.getParameter("password"));

        usersService.register(userForm);

        request.getRequestDispatcher("jsp/registration.jsp").forward(request, response);
    }

}
