package repositories;

import models.Auth;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class AuthRepositoryImpl implements AuthRepository{

    private Connection connection;

    public AuthRepositoryImpl(Connection connection) {
        this.connection = connection;
    }


    public Auth findByCookieValue(String cookieValue) {
        return null;
    }

    public List<Auth> findAll() {
        return null;
    }

    public Optional<Auth> findById(Long id) {
        return Optional.empty();
    }

    public Auth save(Auth auth) {
        return null;
    }

    public void deleteById(Long id) {

    }
}
