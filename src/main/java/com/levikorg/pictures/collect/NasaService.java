package com.levikorg.pictures.collect;

import com.levikorg.pictures.collect.repository.NasaRepository;
import com.levikorg.pictures.collect.repository.entity.ImageEntity;
import com.levikorg.pictures.collect.repository.entity.NasaCameraEntity;
import com.levikorg.pictures.nasa.model.NasaCamera;
import com.levikorg.pictures.nasa.model.NasaImage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Service
public class NasaService {

    private final NasaRepository nasaRepository;

    public void saveNasaData(Map<NasaCamera, List<NasaImage>> cameraToPictures) {
        for (NasaCamera nasaCamera :cameraToPictures.keySet()) {
            var nasaCameraEntity = new NasaCameraEntity(nasaCamera);
            List<NasaImage> nasaImages = cameraToPictures.get(nasaCamera);

            for (NasaImage nasaImage : nasaImages) {
                var imageEntity = new ImageEntity(nasaImage);
                nasaCameraEntity.addImage(imageEntity);
            }
            nasaRepository.save(nasaCameraEntity);
        }
    }
}
