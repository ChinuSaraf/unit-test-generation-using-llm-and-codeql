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
        java.lang.String str0 = org.apache.hadoop.security.authentication.server.HttpConstants.NEGOTIATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Negotiate" + "'", str0, "Negotiate");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.String str0 = org.apache.hadoop.security.authentication.server.HttpConstants.DIGEST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Digest" + "'", str0, "Digest");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.String str0 = org.apache.hadoop.security.authentication.server.HttpConstants.WWW_AUTHENTICATE_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "WWW-Authenticate" + "'", str0, "WWW-Authenticate");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.String str0 = org.apache.hadoop.security.authentication.server.HttpConstants.AUTHORIZATION_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Authorization" + "'", str0, "Authorization");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.String str0 = org.apache.hadoop.security.authentication.server.HttpConstants.BASIC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Basic" + "'", str0, "Basic");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

