package com.gsidendo.sample.pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author gsidendo
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