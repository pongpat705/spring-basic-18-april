package th.co.opentechlab.spring.model;

import lombok.Data;

import javax.persistence.Column;

@Data
public class CountryModel {
    private String code;
    private String name;
    private String continent;
    private String region;
    private String surfaceArea;
    private String indepYear;
    private String population;
}
