package vlc.ldb.dao.updater;

import vlc.common.to.MeasurementTO;
import vlc.ldb.model.Measurement;

public class MeasurementUpdater implements EntityUpdater<MeasurementTO, Measurement> {

    @Override
    public void updateEntity(Measurement measurement, MeasurementTO measurementTO) {
        measurement.setUserId(measurementTO.getUserId());
        measurement.setType(measurementTO.getType());
        measurement.setDate(measurementTO.getDate());
        measurement.setValue(measurementTO.getValue());
    }
}
