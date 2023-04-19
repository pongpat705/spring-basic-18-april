package th.co.opentechlab.spring.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class CountryInsertModel {
    private String code;

    private String name;

    private String continent;

    private String region;

    private String surfaceArea;

    private String indepYear;

    private String population;

    private String lifeExpectancy;

    private String gnp;

    private String gnpOld;

    private String localName;

    private String governmentForm;

    private String headOfState;

    private String capital;

    private String code2;
}
