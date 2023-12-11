package com.levikorg.pictures.collect.repository.entity;

import com.levikorg.pictures.nasa.model.NasaImage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Table(name = "image")
@Entity
public class ImageEntity {

    @Id
    private String id;

    private String imgSrc;

    private String earthDate;

    @ManyToOne
    private NasaCameraEntity nasaCamera;

    public ImageEntity() {
    }

    public ImageEntity(NasaImage nasaImage) {
        this.imgSrc = nasaImage.imgSrc();
        this.earthDate = nasaImage.earthDate();
        this.id = UUID.randomUUID().toString();
    }
}
