package com.levikorg.pictures.collect.repository.entity;

import com.levikorg.pictures.nasa.model.NasaCamera;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Table(name = "camera")
@Entity
public class NasaCameraEntity {

    @Setter
    @Getter
    @Id
    private Long id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String roverId;

    @Setter
    @Getter
    private String fullName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "nasaCamera", cascade = CascadeType.ALL)
    @Getter
    private final List<ImageEntity> images = new ArrayList<>();

    public NasaCameraEntity() {
    }

    public NasaCameraEntity(NasaCamera nasaCamera) {
        this.id = nasaCamera.id();
        this.name = nasaCamera.name();
        this.fullName = nasaCamera.fullName();
        this.roverId = nasaCamera.roverId();
    }

    public void addImage(ImageEntity imageEntity) {
        images.add(imageEntity);
        imageEntity.setNasaCamera(this);
    }
}
