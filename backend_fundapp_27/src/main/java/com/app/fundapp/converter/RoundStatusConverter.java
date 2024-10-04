package com.app.fundapp.converter;

import com.app.fundapp.enums.RoundStatus;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class RoundStatusConverter implements AttributeConverter<RoundStatus, Integer> {

    @Override
    public Integer convertToDatabaseColumn(RoundStatus roundStatus) {
        return roundStatus != null ? roundStatus.ordinal() : null;
    }

    @Override
    public RoundStatus convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return RoundStatus.getRoundStatus(dbData);
    }
}
