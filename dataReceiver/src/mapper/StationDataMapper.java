package mapper;

import dto.StationDataDto;
import repository.entity.StationDataCsvEntity;
import repository.entity.StationDataEntity;

public class StationDataMapper {
    public StationDataCsvEntity toStationDataCsvEntity(StationDataDto stationDataDto) {
        StationDataCsvEntity stationDataCsvEntity = new StationDataCsvEntity();
        stationDataCsvEntity.setId(1);
        stationDataCsvEntity.setStationNumber(stationDataDto.getStationNumber());
        stationDataCsvEntity.setTimestamp("");
        stationDataCsvEntity.setFileName("");
        return stationDataCsvEntity;
    }

    public StationDataEntity toStationDataEntity(StationDataDto stationDataDto) {
        StationDataEntity stationDataEntity = new StationDataEntity();
        stationDataEntity.setStationNumber(stationDataDto.getStationNumber());
        stationDataEntity.setCity(stationDataDto.getCity());
        stationDataEntity.setPressure(stationDataDto.getPressure());
        stationDataEntity.setTemperature(stationDataDto.getTemperature());
        stationDataEntity.setWindSpeed(stationDataDto.getWindSpeed());
        stationDataEntity.setWindDirection(stationDataDto.getWindDirection());
        return stationDataEntity;
    }

}
