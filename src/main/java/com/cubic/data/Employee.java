package com.cubic.data;


public class Employee {
    private int id;
    private String name;
    private double sal;
    public Employee(){

    }
    public Employee(int id,String name,double sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
        }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

           if(obj == null || obj.getClass()!= this.getClass())
            return false;

        Employee employee = (Employee) obj;

             return (employee.name.equals(this.name)  && employee.id == this.id);
    }

    @Override
    public int hashCode()
    {

         return this.id;
    }
}
