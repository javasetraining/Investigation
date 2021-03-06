package ru.maven.chapter_001;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;


public class MaxTest {
    @Test
    public void whenMaxFirtsThenReturnFirst() throws Exception {
        Max max = new Max();
        int result = max.max(3, 2, 1);
        Assert.assertThat("in {3,2,1} max 3", result, is(3));
    }    @Test
    public void whenMaxSecondThenReturnSecond() throws Exception {
        Max max = new Max();
        int result = max.max(2, 3, 1);
        Assert.assertThat("in {3,2,1} max 3", result, is(3));
    }    @Test
    public void whenMaxThirdThenReturnThird() throws Exception {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        Assert.assertThat("in {3,2,1} max 3", result, is(3));
    }
}