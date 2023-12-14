package com.levikorg.pictures.collect.api;

import com.levikorg.pictures.collect.CollectNasaFacade;
import com.levikorg.pictures.collect.api.dto.SolDto;
import com.levikorg.pictures.nasa.model.NasaCamera;
import com.levikorg.pictures.nasa.model.NasaImage;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RequestMapping("/collect")
@RestController
public class CollectNasaPictureController {

    private final CollectNasaFacade collectNasaFacade;

    @PostMapping("/pictures")
    public Map<NasaCamera, List<NasaImage>> collectNasaCameraToPictures(@RequestBody SolDto solDto) {
        return collectNasaFacade.collectNasaCameraToPictures(solDto);
    }
}
