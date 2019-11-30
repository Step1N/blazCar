package com.blazcar.shopper.serviceImpl;

import com.blazcar.shopper.dto.CarEngineDTO;
import com.blazcar.shopper.entity.*;
import com.blazcar.shopper.repository.CarEngineRepository;
import com.blazcar.shopper.service.CarEngineService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarEngineServiceImpl implements CarEngineService {

  @Autowired
  CarEngineRepository carEngineRepository;

  @Autowired
  DozerBeanMapper dozerBeanMapper;

  @Override
  public CarEngineDTO storeCarEngine(CarEngineDTO carEngineDTO) {

    CarEngine carEngine = new CarEngine();
    ItemBrand itemBrand = new ItemBrand();
    itemBrand.setName(carEngineDTO.getBrand());
    itemBrand.setModel(carEngineDTO.getModel());
    itemBrand.setModel(carEngineDTO.getId());
    itemBrand.setBodyStyle(carEngineDTO.getCarSize());
    itemBrand.setBodyType(carEngineDTO.getCarType());
    carEngine.setBrand(itemBrand);

    ItemVersion itemVersion = new ItemVersion();
    itemVersion.setValue(carEngineDTO.getVersion());
    carEngine.setVersion(itemVersion);

    ItemPrice itemPrice = new ItemPrice();
    itemPrice.setUnit(carEngineDTO.getLastPrice());
    itemPrice.setUnit(carEngineDTO.getPrice());
    carEngine.setPrice(itemPrice);

    CarEngineDisplacement carEngineDisplacement = new CarEngineDisplacement();
    carEngineDisplacement.setBoreStroke(Integer.parseInt(carEngineDTO.getBoreStroke()));
    carEngineDisplacement.setCompressionRatio(Float.parseFloat(carEngineDTO.getCompressionRatio()));
    carEngineDisplacement.setCylinders(Integer.parseInt(carEngineDTO.getCylinders()));
    carEngineDisplacement.setNoOfGears(Integer.parseInt(carEngineDTO.getNumberOfGears()));
    carEngineDisplacement.setDuelClutch(carEngineDTO.getDualClutch());
    carEngine.setDisplacement(carEngineDisplacement);

    ItemImageURL itemImageURL = new ItemImageURL();
    itemImageURL.setUrl(carEngineDTO.getImageURL());
    carEngine.setImageURL(itemImageURL);

    ItemPower itemPower = new ItemPower();
    itemPower.setPowerInBHP(Integer.parseInt(carEngineDTO.getMaxPowerBHP()));
    itemPower.setPowerInRPM(Integer.parseInt(carEngineDTO.getMaxPowerRPM()));
    carEngine.setPower(itemPower);

    CarEngineTorque carEngineTorque = new CarEngineTorque();
    carEngineTorque.setTorqueNM(Integer.parseInt(carEngineDTO.getTorqueNM()));
    carEngineTorque.setTorqueRPM(Integer.parseInt(carEngineDTO.getMaxPowerRPM()));
    carEngine.setTorque(carEngineTorque);

    ItemFuelSupport itemFuelSupport = new ItemFuelSupport();
    itemFuelSupport.setCarEngineFuel(carEngineDTO.getFuelSystem().startsWith("Diesel") ? CarEngineFuel.DIESEL : CarEngineFuel.PETROL);
    itemFuelSupport.setCarEngineCharger(carEngineDTO.getTurboCharger().startsWith("Turbocharger") ? CarEngineCharger.TURBO : CarEngineCharger.SUPER);
    itemFuelSupport.setCarEngineChargerType(carEngineDTO.getTurboChargerType());
    carEngine.setFuelSupport(itemFuelSupport);

    carEngine.setAvailable(true);
    carEngine.setDescription("Driving modes: " + carEngineDTO.getDrivingModes() + "\nManual shifting for automatic:  " + carEngineDTO.getManualShift() + "\nEngine start-stop: " + carEngineDTO.getEngineStartStop());
    CarEngine savedCarEngine = carEngineRepository.save(carEngine);

    if (null != savedCarEngine) {
      return carEngineDTO;
    }

    return null;
  }
}
