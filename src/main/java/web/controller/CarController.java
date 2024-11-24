package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServise;
import web.servise.CarServiseImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarServise carServise;

    @Autowired
    public CarController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping(value = "/cars", params = "count")
    public String getCars(@RequestParam("count") int number, Model model) {
        List<Car> cars = carServise.getCars(number);
        model.addAttribute("cars", cars);
        return "cars";
    }
    @GetMapping("/cars")
    public String showCars(Model model) {
        model.addAttribute("cars", carServise.showCars());
        return "cars";
    }

}