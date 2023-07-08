package web.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

@Controller
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCarsList (ModelMap model, HttpServletRequest request) {
        String countParam = request.getParameter("count");

        if (countParam != null) {
            model.addAttribute("carList", carService.getCarsFromList(Integer.parseInt(countParam)));
        } else {
            model.addAttribute("carList", carService.getCarsFromList(100));
        }
        return "cars";
    }
}