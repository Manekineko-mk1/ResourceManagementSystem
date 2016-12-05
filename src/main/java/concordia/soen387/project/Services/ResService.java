package concordia.soen387.project.Services;

import concordia.soen387.project.Dao.ReservationDao;
import concordia.soen387.project.Dao.ReservationResourceDao;
import concordia.soen387.project.Model.Reservation;
import concordia.soen387.project.Model.ReservationResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ethan Shen on 12/4/2016.
 */
public class ResService {
    static ApplicationContext context;

    @Autowired
    static ReservationDao reservationDao;
    @Autowired
    static ReservationResourceDao reservationResourceDao;

    static {
        if(context==null){
            context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        }
        if(reservationDao == null || reservationResourceDao == null){
            reservationDao = (ReservationDao) context.getBean("reservationDao");
            reservationResourceDao = (ReservationResourceDao) context.getBean("reservationResourceDao");
        }
    }

    public Reservation getLastReservation(){
       return reservationDao.getLastIndexReservation();
    }

    public void insertReservation(Reservation reservation){
        reservationDao.addReservation(reservation);
    }

    public void insertReservationResource (ReservationResources reservationResources){
        reservationResourceDao.addReservationResource(reservationResources);
    }

}