package dreambike.bikeService.classes.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import dreambike.bikeService.classes.BikeType;

@Converter(autoApply=true)
public class BikeTypeConverter implements AttributeConverter<BikeType, String>{

	@Override
	public String convertToDatabaseColumn(BikeType bikeType) {
		if (bikeType == null) {
			return null;
		}
		return bikeType.getCode();
	}

	@Override
	public BikeType convertToEntityAttribute(String code) {
		if (code == null) {
			return null;
		}
        return Stream.of(BikeType.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
	}
	
}
