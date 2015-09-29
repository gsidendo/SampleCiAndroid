package com.gsidendo.sample.pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by gsidendo on 2015/09/29.
 */
public class SamplePojoTest {

    SamplePojo pojo = new SamplePojo();

    @Test
    public void testGetField() throws Exception {
        String expected = "hoge";

        pojo.setField(expected);
        
        assertThat(pojo.getField(), is(expected));
    }
}