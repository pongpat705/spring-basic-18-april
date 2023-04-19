package th.co.opentechlab.spring.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "country")
public class CountryEntity {

    @Id
    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name = "Continent")
    private String continent;

    @Column(name = "Region")
    private String region;

    @Column(name = "SurfaceArea")
    private String surfaceArea;

    @Column(name = "IndepYear")
    private String indepYear;

    @Column(name = "Population")
    private String population;

    @Column(name = "LifeExpectancy")
    private String lifeExpectancy;

    @Column(name = "GNP")
    private String gnp;

    @Column(name = "GNPOld")
    private String gnpOld;

    @Column(name = "LocalName")
    private String localName;

    @Column(name = "GovernmentForm")
    private String governmentForm;

    @Column(name = "HeadOfState")
    private String headOfState;

    @Column(name = "Capital")
    private String capital;

    @Column(name = "Code2")
    private String code2;
}
