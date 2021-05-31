package springbook.user.domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;

public class JUnitTest {
    static Set<JUnitTest> testObject = new HashSet<>();

    @Test
    public void test1(){
        Assert.assertThat(testObject, not(hasItem(this)));
        testObject.add(this);
    }
    @Test
    public void test2(){
        Assert.assertThat(testObject, not(hasItem(this)));
        testObject.add(this);
    }
    @Test
    public void test3(){
        Assert.assertThat(testObject, not(hasItem(this)));
        testObject.add(this);
    }
}
