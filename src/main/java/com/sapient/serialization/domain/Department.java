package com.sapient.serialization.domain;

import org.codehaus.jackson.annotate.JsonBackReference;

/**
 * Created by shiva on 5/13/2017.
 */
public class Department {
    private String departmentId;
    private String departmentName;
    @JsonBackReference
    private Employee departmentLead;

    public Department(String departmentId, String departmentName, Employee departmentLead) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentLead = departmentLead;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getDepartmentLead() {
        return departmentLead;
    }

    public void setDepartmentLead(Employee departmentLead) {
        this.departmentLead = departmentLead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;
        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;
        return departmentLead != null ? departmentLead.equals(that.departmentLead) : that.departmentLead == null;
    }

    @Override
    public int hashCode() {
        int result = departmentId != null ? departmentId.hashCode() : 0;
        result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
        result = 31 * result + (departmentLead != null ? departmentLead.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentLead=" + departmentLead +
                '}'+"\n";
    }
}
