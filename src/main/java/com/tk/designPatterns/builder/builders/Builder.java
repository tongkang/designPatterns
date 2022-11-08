package com.tk.designPatterns.builder.builders;

import com.tk.designPatterns.builder.car.CarType;
import com.tk.designPatterns.builder.components.Engine;
import com.tk.designPatterns.builder.components.GPSNavigator;
import com.tk.designPatterns.builder.components.Transmission;
import com.tk.designPatterns.builder.components.TripComputer;

/**
 * 简述
 * <p>
 * 详细描述
 *
 * @author tongkang
 * @version 1.0
 * @since 2022/11/09
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
