package com.codegym.demo.controller;

import com.codegym.demo.model.City;
import com.codegym.demo.model.Country;
import com.codegym.demo.service.ICityService;
import com.codegym.demo.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class CityController {
    @Autowired
    private ICountryService countryService;
    @Autowired
    private ICityService cityService;

    @GetMapping("/list")
    public ModelAndView showCityList(){
        List<City> cities = (List<City>) cityService.findAll();
        return new ModelAndView("city/list","cities", cities);
    }
    @ModelAttribute("countries")
    public List<Country> countryInit(){
        return (List<Country>) countryService.findAll();
    }

    @GetMapping("/create")
    public ModelAndView createCity(){
        return new ModelAndView("city/create","city", new City());
    }

    @PostMapping("/create")
    public ModelAndView saveCity(@Validated @ModelAttribute City city, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView("city/create");
        if(checkCityValid(city, modelAndView)){
                cityService.save(city);
                List<City> cities = (List<City>) cityService.findAll();
                modelAndView = new ModelAndView("city/list");
                modelAndView.addObject("msg", "City added!");
                modelAndView.addObject("cities", cities);
            }
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Optional<City> cityOptional = cityService.findById(id);
        if(cityOptional.isPresent()){
            return new ModelAndView("city/edit","city", cityOptional.get());
        }else{
            return new ModelAndView("error-404");
        }
    }

    @PostMapping("/edit")
    public ModelAndView editCity(@ModelAttribute City city){
        ModelAndView modelAndView = new ModelAndView("city/edit");
        if(checkCityValid(city, modelAndView)){
            cityService.save(city);
            List<City> cities = (List<City>) cityService.findAll();
            modelAndView = new ModelAndView("city/list");
            modelAndView.addObject("msg", "City updated!");
            modelAndView.addObject("cities", cities);
        }
        return modelAndView;
    }

    private boolean checkCityValid(@ModelAttribute City city, ModelAndView modelAndView) {
        boolean isValidCity = true;
        if(city.getArea()<=0){
            modelAndView.addObject("error_area_msg","Area must be positive");
            isValidCity = false;
        }
        if(city.getPopulation()<=0){
            modelAndView.addObject("error_population_msg","Population must be positive");
            isValidCity = false;
        }
        if(city.getGdp()<=0){
            modelAndView.addObject("error_gdp_msg","Gdp must be positive");
            isValidCity = false;
        }
        return isValidCity;
    }

    @GetMapping("/view/{id}")
    public ModelAndView showCityDetail(@PathVariable Long id){
        Optional<City> city = cityService.findById(id);
        if(!city.isPresent()){
            return new ModelAndView("error-404");
        }else{
            return new ModelAndView("city/view","city", city.get());
        }
    }
    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Optional<City> cityOptional = cityService.findById(id);
        if(!cityOptional.isPresent()){
            return new ModelAndView("error-404");
        }else{
            return new ModelAndView("city/delete", "city",  cityOptional.get());
        }
    }
    @PostMapping("/delete/{id}")
    public ModelAndView deleteCity(@PathVariable Long id){
        cityService.remove(id);
        List<City> cities = (List<City>) cityService.findAll();
        ModelAndView modelAndView = new ModelAndView("city/list");
        modelAndView.addObject("msg","Deleted completed");
        modelAndView.addObject("cities", cities);
        return modelAndView;
    }
}
