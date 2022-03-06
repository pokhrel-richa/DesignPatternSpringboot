package com.adapterdesign.adapter.controller;

import com.adapterdesign.adapter.adapter.AssignmentWork;
import com.adapterdesign.adapter.adapter.Pen;
import com.adapterdesign.adapter.adapter.PenAdapter;
import com.factorydesign.design.factory.Vehicle;
import com.factorydesign.design.factory.VehicleFactoryImplementation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("design/{pen-type}")
    public String getPenTypeInfo(@PathVariable("pen-type") String pen) throws Exception{
        if(pen.equals("adapter")) {
            Pen p = new PenAdapter();
            AssignmentWork assignmentWork = new AssignmentWork();
            assignmentWork.setP(p);
            return assignmentWork.writeAssignment("I am tired to write assignment");
        }
        else
            return "Invalid pen";
    }
}
