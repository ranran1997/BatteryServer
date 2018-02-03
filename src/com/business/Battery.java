package com.business;

import java.sql.Timestamp;

/**
 * 与数据库中的battery数据表对应
 * 注释带星号*的表示在数据库中有对应字段
 */
public class Battery {
    private int id; // 数据库自增id *
    private String number; // 电池唯一编号标识 *
    private String model; // 电池型号 *
    private int vehicleId; // 搭载电池的硬件id *
    private int stationId; // 储存电池的电站id *
    private double electricity; // 剩余电量百分比 *
    private double ratedCapacity; // 额定容量 *
    private double actualCapacity; // 实际容量 *
    private double residualCapacity; // 剩余容量 *
    private Timestamp date; // 电池投入使用的日期 *

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public double getRatedCapacity() {
        return ratedCapacity;
    }

    public void setRatedCapacity(double ratedCapacity) {
        this.ratedCapacity = ratedCapacity;
    }

    public double getActualCapacity() {
        return actualCapacity;
    }

    public void setActualCapacity(double actualCapacity) {
        this.actualCapacity = actualCapacity;
    }

    public double getResidualCapacity() {
        return residualCapacity;
    }

    public void setResidualCapacity(double residualCapacity) {
        this.residualCapacity = residualCapacity;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
