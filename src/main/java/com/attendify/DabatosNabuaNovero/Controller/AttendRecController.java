//AttendRecController
package com.attendify.DabatosNabuaNovero.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attendify.DabatosNabuaNovero.Entity.AttendRecEntity;
import com.attendify.DabatosNabuaNovero.Service.AttendRecService;

@RestController
@RequestMapping("/attendance")
public class AttendRecController {

    @Autowired
    AttendRecService attserv;

    // task 2
    @GetMapping("/getallrecords")
    // readData
    public List<AttendRecEntity> getAllAttendanceRecords() {
        return attserv.getAllAttendanceRecords();
    }

    // task 3
    @PostMapping("/insertrecord")
    // insertData
    public AttendRecEntity insertRecord(@RequestBody AttendRecEntity record) {
        return attserv.insertRecord(record);
    }
}