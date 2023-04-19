package th.co.opentechlab.spring.service;

import org.springframework.stereotype.Service;
import th.co.opentechlab.spring.entity.CountryEntity;
import th.co.opentechlab.spring.model.CountryInsertModel;
import th.co.opentechlab.spring.model.CountryModel;
import th.co.opentechlab.spring.model.ResponseModel;
import th.co.opentechlab.spring.repository.CountryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {
    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public ResponseModel<Void> insertCountry(CountryInsertModel countryModel) {

        ResponseModel<Void> result = new ResponseModel<>();
        result.setStatus(200);
        result.setMessage("ok");


        CountryEntity countryEntity = new CountryEntity();
        countryEntity.setCode(countryModel.getCode());
        countryEntity.setGnp(countryModel.getGnp());
        countryEntity.setContinent(countryModel.getContinent());
        countryEntity.setCapital(countryModel.getCapital());
        countryEntity.setName(countryModel.getName());
        countryEntity.setCode2(countryModel.getCode2());
        countryEntity.setGnpOld(countryModel.getGnpOld());
        countryEntity.setPopulation(countryModel.getPopulation());
        countryEntity.setRegion(countryModel.getRegion());
        countryEntity.setIndepYear(countryModel.getIndepYear());
        countryEntity.setGovernmentForm(countryModel.getGovernmentForm());
        countryEntity.setLifeExpectancy(countryModel.getLifeExpectancy());
        countryEntity.setLocalName(countryModel.getLocalName());
        countryEntity.setHeadOfState(countryModel.getHeadOfState());
        countryEntity.setSurfaceArea(countryModel.getSurfaceArea());

        this.countryRepository.save(countryEntity);


        return result;
    }
    public ResponseModel<List<CountryModel>> findCountryByContinent(String continent) {
        ResponseModel<List<CountryModel>> result = new ResponseModel<>();
        result.setStatus(200);
        result.setMessage("ok");

        List<CountryEntity> countryEnityList = this.countryRepository.findByContinent(continent);

        List<CountryModel> countryModelList = new ArrayList<>();
        for (CountryEntity x: countryEnityList) {
            CountryModel data = new CountryModel();
            data.setContinent(x.getContinent());
            data.setName(x.getName());
            data.setCode(x.getCode());
            data.setRegion(x.getRegion());
            data.setPopulation(x.getPopulation());
            data.setIndepYear(x.getIndepYear());

            countryModelList.add(data);
        }
        result.setData(countryModelList);
        return result;
    }

    public ResponseModel<Void> deleteCountry(String code) {
        ResponseModel<Void> result = new ResponseModel<>();
        result.setStatus(200);
        result.setMessage("ok");

        this.countryRepository.deleteById(code);
        return result;
    }
}
