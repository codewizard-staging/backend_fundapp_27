package com.app.fundapp.converter;

import com.app.fundapp.enums.StageName;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class StageNameConverter implements AttributeConverter<StageName, Integer> {

    @Override
    public Integer convertToDatabaseColumn(StageName stageName) {
        return stageName != null ? stageName.ordinal() : null;
    }

    @Override
    public StageName convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return StageName.getStageName(dbData);
    }
}
