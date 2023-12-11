package com.levikorg.pictures.collect.repository.entity;

import com.levikorg.pictures.nasa.model.NasaImage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name = "image")
@Entity
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imgSrc;

    private String earthDate;

    @ManyToOne
    @JoinColumn(name = "camera_id")
    private NasaCameraEntity nasaCamera;

    public ImageEntity() {
    }

    public ImageEntity(NasaImage nasaImage) {
        this.imgSrc = nasaImage.imgSrc();
        this.earthDate = nasaImage.earthDate();
    }
}
