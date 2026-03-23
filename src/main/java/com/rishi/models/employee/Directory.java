package com.rishi.models.employee;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee{
    private String teamName;
    private List<Employee> members;

    public Directory(String teamName) {
        this.teamName = teamName;
        members = new ArrayList<>();
    }

    public void addMember(Employee employee) {
        members.add(employee);
    }

    public void removeMember(Employee employee) {
        members.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + teamName);
        for (Employee member : members) {
            member.showDetails();
        }
    }
}
