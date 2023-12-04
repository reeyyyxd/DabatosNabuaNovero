//AttendRecService
package com.attendify.DabatosNabuaNovero.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.attendify.DabatosNabuaNovero.Entity.AttendRecEntity;
import com.attendify.DabatosNabuaNovero.Repository.AttendRecRepository;


@Service
public class AttendRecService {

    @Autowired
    AttendRecRepository attendifyrepo;

    // task 2 to view/read the data
    public List<AttendRecEntity> getAllAttendanceRecords() {
        return attendifyrepo.findAll();
    }

    // task 3 to insert the data
    public AttendRecEntity insertRecord(AttendRecEntity record) {
        return attendifyrepo.save(record);
    }
}