package com.rishi.lld.composite;

import com.rishi.models.employee.Developer;
import com.rishi.models.employee.Directory;
import com.rishi.models.employee.Employee;
import com.rishi.models.employee.Manager;

public class Driver {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Alice", "Frontend Developer");
        Employee dev2 = new Developer("Bob", "Backend Developer");
        Employee manager = new Manager("Charlie");

        Directory team = new Directory("Development Team");
        team.addMember(dev1);
        team.addMember(dev2);
        team.addMember(manager);

        Directory company = new Directory("Tech Company");
        company.addMember(team);

        company.showDetails();
    }
}
