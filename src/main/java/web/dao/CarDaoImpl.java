package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public class CarDaoImpl implements CarDao{
    @Override
    public List<Car> getCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Lada", "Vesta", 2009));
        carList.add(new Car("Toyota", "Camry", 1999));
        carList.add(new Car("Skoda", "Octavia", 2002));
        carList.add(new Car("Kia", "Rio", 2013));
        carList.add(new Car("Hyandai", "Solaris", 2007));
        return carList;
    }
}
