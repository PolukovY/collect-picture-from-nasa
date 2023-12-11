package com.levikorg.pictures.collect;

import com.levikorg.pictures.collect.repository.NasaRepository;
import com.levikorg.pictures.collect.repository.entity.ImageEntity;
import com.levikorg.pictures.collect.repository.entity.NasaCameraEntity;
import com.levikorg.pictures.nasa.model.NasaCamera;
import com.levikorg.pictures.nasa.model.NasaImage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Transactional
@AllArgsConstructor
@Service
public class NasaService {

    private final NasaRepository nasaRepository;

    @PersistenceContext
    private final EntityManager entityManager;

    public void saveNasaData(Map<NasaCamera, List<NasaImage>> cameraToPictures) {
        List<NasaCameraEntity> nasaCameraEntities = new ArrayList<>();

        for (NasaCamera nasaCamera : cameraToPictures.keySet()) {
            var nasaCameraEntity = new NasaCameraEntity(nasaCamera);
            List<NasaImage> nasaImages = cameraToPictures.get(nasaCamera);

            for (NasaImage nasaImage : nasaImages) {
                var imageEntity = new ImageEntity(nasaImage);
                nasaCameraEntity.addImage(imageEntity);
            }
            nasaCameraEntities.add(nasaCameraEntity);
        }

        //saveAsBatch(nasaCameraEntities);
        saveEntities(nasaCameraEntities);
        //nasaRepository.saveAll(nasaCameraEntities);
    }

    public void saveEntities(List<NasaCameraEntity> entities) {
        for (NasaCameraEntity entity : entities) {
            entityManager.persist(entity);
        }
    }

    public void saveAsBatch(List<NasaCameraEntity> nasaCameraEntities) {
        Session session = entityManager.unwrap(Session.class);
        session.setJdbcBatchSize(25); // Set the batch size on the session

        // Perform batch inserts
        for (int i = 0; i < nasaCameraEntities.size(); i++) {
            session.persist(nasaCameraEntities.get(i));
            if (i % 25 == 0) { // Flush and clear the session after a batch
                session.flush();
                session.clear();
            }
        }
    }
}
