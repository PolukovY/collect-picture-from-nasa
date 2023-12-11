package com.levikorg.pictures.collect;

import com.levikorg.pictures.collect.api.dto.SolDto;
import com.levikorg.pictures.nasa.NasaClient;
import com.levikorg.pictures.nasa.model.NasaCamera;
import com.levikorg.pictures.nasa.model.NasaImage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Component
public class CollectNasaFacade {

    private final NasaClient nasaClient;

    private final NasaService nasaService;

    public Map<NasaCamera, List<NasaImage>> collectNasaCameraToPictures(SolDto solDto){
        Objects.requireNonNull(solDto, "Sold should not be null");
        Map<NasaCamera, List<NasaImage>> cameraToPictures = nasaClient.getPictures(solDto.sol());

        nasaService.saveNasaData(cameraToPictures);

        return cameraToPictures;
    }
}
