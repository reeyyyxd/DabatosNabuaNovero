//AttendRecController
package com.attendify.DabatosNabuaNovero.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.attendify.DabatosNabuaNovero.Entity.AttendRecEntity;
import com.attendify.DabatosNabuaNovero.Service.AttendRecService;

@RestController
@RequestMapping("/attendance")
@CrossOrigin
public class AttendRecController {

    @Autowired
    AttendRecService attserv;

    // task 2  Retrieve all attendance records
    @GetMapping("/getallrecords")
    // readData
    public List<AttendRecEntity> getAllAttendanceRecords() {
        return attserv.getAllAttendanceRecords();
    }

    // task 3 Insert a new attendance record
    @PostMapping("/insertrecord")
    // insertData
    public AttendRecEntity insertRecord(@RequestBody AttendRecEntity record) {
        return attserv.insertRecord(record);
    }
}