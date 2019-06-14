package com.cubic.data;

public class Dept {

    private int dId;
    private String dName;
    private String loc;

    public Dept(int dId, String dName, String loc) {
        this.dId = dId;
        this.dName = dName;
        this.loc = loc;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getdId() {
        return dId;
    }

    public String getdName() {
        return dName;
    }

    public String getLoc() {
        return loc;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        Dept dept = (Dept) obj;

        return (dept.dName.equals(this.dName)  && dept.loc.equals(this.loc)  && dept.dId == this.dId);
    }

    @Override
    public int hashCode()
    {

        return this.dId;
    }
}
