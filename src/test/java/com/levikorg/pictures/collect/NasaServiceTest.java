package com.levikorg.pictures.collect;

import com.levikorg.pictures.nasa.model.NasaCamera;
import com.levikorg.pictures.nasa.model.NasaImage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class NasaServiceTest {

    @Autowired
    private NasaService nasaService;

    @DisplayName("Should save nasa data")
    @Test
    void shouldSaveNasaData() {
        Map<NasaCamera, List<NasaImage>> cameraToPictures = new HashMap<>();

        List<NasaImage> images = new ArrayList<>();
        images.add(new NasaImage("http://mars.jpl.nasa.gov/msl-raw-images/proj/msl/redops/ods/surface/sol/00016/opgs/edr/rcam/RRA_398917119EDR_F0030054RHAZ00130M_.JPG", "2012-08-22"));

        cameraToPictures.put(
                new NasaCamera(21L, "RHAZ", "5", "Rear Hazard Avoidance Camera"),
                images
        );

        nasaService.saveNasaData(cameraToPictures);
    }
}