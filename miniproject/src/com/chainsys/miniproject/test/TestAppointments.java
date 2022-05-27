package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.Appointmentsdao;
import com.chainsys.miniproject.pojo.Appointments;

public class TestAppointments {
    public static void testGetAllAppointment() {
        List<Appointments> allAppointment =Appointmentsdao.getAllAppointment();
        Iterator appIterator = allAppointment.iterator();
        while (appIterator.hasNext()) {
            Appointments app = (Appointments) appIterator.next();
            System.out.println(app.getAPPOINTMENT_ID() + " " + app.getPATIENT_NAME() +" "+app.getDOCTOR_ID()+" "+app.getFEES_COLLECTED());
        }
    }

    public static void testGetAppointmentById() {
        Appointments app =Appointmentsdao.getAppointmentById(11);
        System.out.println(app.getAPPOINTMENT_ID() + " " + app.getPATIENT_NAME() +" "+app.getDOCTOR_ID()+" "+app.getFEES_COLLECTED());        }

    public static void testInsertAppointment() {
        Appointments newapp = new Appointments();
        newapp.setAPPOINTMENT_ID(77);
        Calendar c1 = Calendar.getInstance();
        java.util.Date newDate = c1.getTime();
        newapp.setAPPOINTMENT_DATE(newDate);
        newapp.setDOCTOR_ID(3);
        newapp.setPATIENT_NAME("gokul");
        newapp.setFEES_COLLECTED(500);
        int result = Appointmentsdao.insertAppointment(newapp);
        System.out.println(result);
    }

    public static void testUpdateAppointment() {
            Appointments app = new Appointments();
            app.setAPPOINTMENT_ID(22);
            Calendar c1 = Calendar.getInstance();
            java.util.Date newDate = c1.getTime();
            app.setAPPOINTMENT_DATE(newDate);
            app.setDOCTOR_ID(3);
            app.setPATIENT_NAME("vimal");
            app.setFEES_COLLECTED(1000);
            
            int result = Appointmentsdao.updateAppointment(app);
            System.out.println(result+" row updated");
            
        }
        

    public static void testDeleteAppointment() {
        int result = Appointmentsdao.deleteAppointment(222);
        System.out.println(result);
    }



}