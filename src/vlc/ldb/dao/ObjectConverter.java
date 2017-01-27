package vlc.ldb.dao;

import vlc.ldb.model.Measure;
import vlc.ldb.model.Person;
import vlc.common.to.MeasureTO;
import vlc.common.to.PersonTO;

import java.util.ArrayList;
import java.util.List;

public class ObjectConverter {

    public static MeasureTO toTO(Measure measure) {
        MeasureTO measureTO = new MeasureTO();
        measureTO.setMid(measure.getMid());
        measureTO.setDateRegistered(measure.getDateRegistered());
        measureTO.setMeasureType(measure.getMeasureType());
        measureTO.setMeasureValue(measure.getMeasureValue());
        measureTO.setMeasureValueType(measure.getMeasureValueType());
        return measureTO;
    }

    public static PersonTO toTO(Person person) {
        PersonTO personTO = new PersonTO();
        personTO.setId(person.getId());
        personTO.setFirstname(person.getFirstname());
        personTO.setLastname(person.getLastname());
        List<MeasureTO> currentMeasures = new ArrayList<>();
        for (Measure measure : person.getCurrentHealth()) {
            currentMeasures.add(toTO(measure));
        }
        personTO.setCurrentHealth(currentMeasures);
        List<MeasureTO> measuresHistory = new ArrayList<>();
        for (Measure measure : person.getHealthHistory()) {
            measuresHistory.add(toTO(measure));
        }
        personTO.setHealthHistory(measuresHistory);
        return personTO;
    }

    public static Measure toModel(MeasureTO measureTO) {
        Measure measure = new Measure();
        if (measureTO.getMid() != null) {
            measure.setMid(measureTO.getMid());
        }
        measure.setDateRegistered(measureTO.getDateRegistered());
        measure.setMeasureType(measureTO.getMeasureType());
        measure.setMeasureValue(measureTO.getMeasureValue());
        measure.setMeasureValueType(measureTO.getMeasureValueType());
        return measure;
    }

    public static Person toModel(PersonTO personTO) {
        Person person = new Person();
        person.setId(personTO.getId());
        person.setFirstname(personTO.getFirstname());
        person.setLastname(personTO.getLastname());

        List<MeasureTO> currentHealth = personTO.getCurrentHealth();
        List<Measure> currentMeasures = new ArrayList<>();
        if(currentHealth != null) {
            for (MeasureTO measureTO : currentHealth) {
                currentMeasures.add(toModel(measureTO));
            }
        }
        person.setCurrentHealth(currentMeasures);

        List<MeasureTO> healthHistory = personTO.getHealthHistory();
        List<Measure> measuresHistory = new ArrayList<>();
        if (healthHistory != null) {
            for (MeasureTO measureTO : healthHistory) {
                measuresHistory.add(toModel(measureTO));
            }
        }
        person.setHealthHistory(measuresHistory);
        return person;
    }
}