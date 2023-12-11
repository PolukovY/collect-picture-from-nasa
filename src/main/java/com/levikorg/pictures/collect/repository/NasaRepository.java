package com.levikorg.pictures.collect.repository;

import com.levikorg.pictures.collect.repository.entity.NasaCameraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NasaRepository extends JpaRepository<NasaCameraEntity, String> {
}
