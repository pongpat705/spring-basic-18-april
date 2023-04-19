package th.co.opentechlab.spring.controller.rest;

import org.springframework.web.bind.annotation.*;
import th.co.opentechlab.spring.model.CountryInsertModel;
import th.co.opentechlab.spring.model.CountryModel;
import th.co.opentechlab.spring.model.ResponseModel;
import th.co.opentechlab.spring.service.CountryService;

import java.util.List;

@RestController
public class CountryRestController {


    private CountryService countryService;

    public CountryRestController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/api/v1/findCountryByContinent")
    public ResponseModel<List<CountryModel>> findCountryByContinent(@RequestParam String continent){
        return this.countryService.findCountryByContinent(continent);
    }

    @PostMapping("/api/v1/country")
    public ResponseModel<Void> insertCountry(@RequestBody CountryInsertModel countryInsertModel){
        return this.countryService.insertCountry(countryInsertModel);
    }

    @DeleteMapping("/api/v1/country")
    public ResponseModel<Void> deleteCountry(@RequestBody CountryModel countryModel){
        return this.countryService.deleteCountry(countryModel.getCode());
    }
}
