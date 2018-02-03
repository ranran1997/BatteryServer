package com.business;

import java.sql.Timestamp;

/**
 * 预约信息
 * 与数据库中的appointment数据表对应
 * 注释带星号*的表示在数据库中有对应字段
 */
public class Appointment {
    private int id; // 数据库自增id *
    private int userId; // 预约用户id *
    private int stationId; // 预约电站id *
    private int newBatteryId; // 新电池id *
    private Timestamp date; // 预约时间 *
    private int complete; // 是否完成状态 *

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getNewBatteryId() {
        return newBatteryId;
    }

    public void setNewBatteryId(int newBatteryId) {
        this.newBatteryId = newBatteryId;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getComplete() {
        return complete;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }
}
