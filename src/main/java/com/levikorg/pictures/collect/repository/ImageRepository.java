package com.levikorg.pictures.collect.repository;

import com.levikorg.pictures.collect.repository.entity.ImageEntity;
import com.levikorg.pictures.collect.repository.entity.NasaCameraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, String> {
}
