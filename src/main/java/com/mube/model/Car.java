package com.mube.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("car")
public class Car {

    @Id
    private String id;

    private String vehiclePlate;
    private String vin;
    private String chassisNumber;
    private String motorNumber;
    private String brand;
    private String model;
    private String year;
    private String transmission;
    private String typeVehicle;
    private int kilometers;
    private int price;
    private List<CarImage> img;
    private String fuel;
    private String engine;
    private Date creationDate;
    private int autofactPrice;
    private int publicationPrice;
    private String owner;
    private String documents;
    private String equipments;
    private String indoorConditions;
    private String electricController;
    private String mechanicRevision;
    private String bodyworkEvaluation;

}
