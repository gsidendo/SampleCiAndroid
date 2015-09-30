package com.gsidendo.sample.pojo;

/**
 * @author gsidendo
 */
public class SamplePojo {

    private  String field;

    public  String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object obj) {
        SamplePojo otherDog = (SamplePojo) obj;
        if (otherDog.field.equals(this.field)) {
            return true;
        }
        return false;
    }
}
