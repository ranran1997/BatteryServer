<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.business.Database" %>
<%@ page import="com.business.Vehicle" %>
<%@ page import="com.business.Battery" %><%--
  Created by IntelliJ IDEA.
  User: szl
  Date: 2018/3/10
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<%
try {
    String number = request.getParameter("number");
    String longitude = request.getParameter("longitude");
    String latitude = request.getParameter("latitude");
    String direction = request.getParameter("direction");
    String temperature = request.getParameter("temperature");
    String humidity = request.getParameter("humidity");
    String voltage = request.getParameter("voltage");
    String current = request.getParameter("current");
    String electricity = request.getParameter("electricity");

    long currentTime = System.currentTimeMillis();
    Date currentDate = new Date(currentTime); // 当前时间
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    System.out.println(sdf.format(currentDate) + " 硬件 " + number + " 上传数据");
    System.out.println("编号：" + number);
    System.out.println("经度：" + longitude);
    System.out.println("纬度：" + latitude);
    System.out.println("方向：" + direction);
    System.out.println("温度：" + temperature);
    System.out.println("湿度：" + humidity);
    System.out.println("电压：" + voltage);
    System.out.println("电流：" + current);
    System.out.println("电量：" + electricity);
    System.out.println("硬件上传数据完成");

    String sql = "update vehicle set longitude='" + longitude
            + "', latitude='" + latitude
            + "', direction='" + direction
            + "', temperature='" + temperature
            + "', humidity='" + humidity
            + "', voltage='" + voltage
            + "', current='" + current + "' where number='" + number + "'";
    Database.updateDatabase(sql);

    Vehicle vehicle = Database.findVehicle("number", number);
    Battery battery = Database.findBattery(Database.VEHICLE_ID, Integer.toString(vehicle.getId()));
    double elec = Integer.parseInt(electricity);
    battery.setElectricity(elec);
    battery.setResidualCapacity(battery.getActualCapacity() * elec * 0.01);
    sql = "update battery set electricity=" + elec + ", residual_capacity=" + battery.getResidualCapacity()
            + " where id=" + battery.getId();
    Database.updateDatabase(sql);
    response.getWriter().print("success");
} catch (Exception e) {
    e.printStackTrace();
    response.getWriter().print("error");
}
%>
</body>
</html>
