import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.String str0 = org.apache.hadoop.util.PlatformName.PLATFORM_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Windows_NT-amd64-64" + "'", str0, "Windows_NT-amd64-64");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.String str0 = org.apache.hadoop.util.PlatformName.JAVA_VENDOR_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Oracle Corporation" + "'", str0, "Oracle Corporation");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        boolean boolean0 = org.apache.hadoop.util.PlatformName.IBM_JAVA;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.apache.hadoop.util.PlatformName platformName0 = new org.apache.hadoop.util.PlatformName();
        java.lang.Class<?> wildcardClass1 = platformName0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

