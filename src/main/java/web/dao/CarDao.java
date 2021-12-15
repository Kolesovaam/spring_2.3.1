package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    //Извлекает машины из списка и так далее
    List<Car> getCars();
}
