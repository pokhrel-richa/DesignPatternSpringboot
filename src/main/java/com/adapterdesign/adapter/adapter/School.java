package com.adapterdesign.adapter.adapter;

import com.adapterdesign.adapter.adapter.AssignmentWork;
import com.adapterdesign.adapter.adapter.Pen;
import com.adapterdesign.adapter.adapter.PenAdapter;

public class School {
    public static void main(String[] args) {
        PilotPen pp = new PilotPen();
        Pen p = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setP(p);
        assignmentWork.writeAssignment("I am tired to write assignment");
    }
}
