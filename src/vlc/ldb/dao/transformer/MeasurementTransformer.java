package vlc.ldb.dao.transformer;

import vlc.common.to.MeasurementTO;
import vlc.ldb.model.Measurement;

public class MeasurementTransformer implements EntityTransformer<MeasurementTO, Measurement> {

    @Override
    public Measurement toModel(MeasurementTO entityTO) {
        return new Measurement(entityTO.getId(), entityTO.getUserId(), entityTO.getType(), entityTO.getDate(), 
                entityTO.getValue());
    }

    @Override
    public MeasurementTO toTO(Measurement entity) {
        return new MeasurementTO(entity.getId(), entity.getUserId(), entity.getType(), entity.getDate(),
                entity.getValue());
    }

    @Override
    public String getModelClassName() {
        return Measurement.class.getSimpleName();
    }
}
