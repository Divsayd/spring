package main;

import config.config;
import model.ACcontrol;
import model.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.VehicleServies;

public class main {
    public static void main(String args[]){
        var context=new AnnotationConfigApplicationContext(config.class);
        //var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleServices = context.getBean(VehicleServies.class);
        System.out.println(vehicleServices.getClass());
        Song song = new Song();
        ACcontrol aCcontrol=new ACcontrol();
        aCcontrol.setTemp(65);
        aCcontrol.setStatus("chill and breeze ");
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = true;
        //String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
       String s = vehicleServices.playMusic(vehicleStarted,song);
       System.out.println(s);
       System.out.println( vehicleServices.getACDetails(aCcontrol));
        //String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
    }
}
