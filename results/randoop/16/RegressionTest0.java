import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Class<? extends org.apache.hadoop.security.authentication.client.Authenticator> wildcardClass0 = org.apache.hadoop.security.authentication.client.AuthenticatedURL.getDefaultAuthenticator();
        org.junit.Assert.assertNotNull(wildcardClass0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = org.apache.hadoop.security.authentication.client.AuthenticatedURL.AUTH_COOKIE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop.auth" + "'", str0, "hadoop.auth");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL authenticatedURL0 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL();
        java.lang.Class<?> wildcardClass1 = authenticatedURL0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL authenticatedURL0 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL();
        java.net.URL uRL1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection4 = authenticatedURL0.openConnection(uRL1, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: url cannot be NULL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL authenticatedURL0 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL();
        java.net.URL uRL1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection6 = authenticatedURL0.openConnection(uRL1, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: url cannot be NULL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.hadoop.security.authentication.client.Authenticator authenticator0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL authenticatedURL1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL(authenticator0);
        java.net.URL uRL2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection5 = authenticatedURL1.openConnection(uRL2, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: url cannot be NULL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.hadoop.security.authentication.client.Authenticator authenticator0 = null;
        org.apache.hadoop.security.authentication.client.ConnectionConfigurator connectionConfigurator1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL authenticatedURL2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL(authenticator0, connectionConfigurator1);
        java.net.URL uRL3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str7 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = authenticatedURL2.openConnection(uRL3, token6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: url cannot be NULL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str7 = token3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass5 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean2 = token1.isSet();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        java.lang.Class<?> wildcardClass7 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str10 = token5.toString();
        boolean boolean11 = token5.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str7 = token3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str8 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hadoop.auth");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        java.lang.String str2 = token1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str6 = token3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str10 = token5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.Class<?> wildcardClass13 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        boolean boolean8 = token4.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass5 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hadoop.auth");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str6 = token2.toString();
        java.lang.Class<?> wildcardClass7 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.String str8 = token3.toString();
        java.lang.Class<?> wildcardClass9 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        java.lang.String str10 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        java.lang.String str3 = token1.toString();
        java.lang.Class<?> wildcardClass4 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        boolean boolean8 = token4.isSet();
        java.lang.String str9 = token4.toString();
        java.lang.String str10 = token4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str9 = token4.toString();
        boolean boolean10 = token4.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass6 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str8 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.String str11 = token4.toString();
        java.lang.Class<?> wildcardClass12 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str12 = token5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        java.lang.String str4 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str2 = token1.toString();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.Class<?> wildcardClass13 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        java.lang.String str7 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str9 = token4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str8 = token4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.Class<?> wildcardClass8 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        boolean boolean5 = token1.isSet();
        java.lang.String str6 = token1.toString();
        java.lang.Class<?> wildcardClass7 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        java.lang.String str3 = token1.toString();
        java.lang.Class<?> wildcardClass4 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        boolean boolean3 = token1.isSet();
        java.lang.Class<?> wildcardClass4 = token1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        boolean boolean6 = token2.isSet();
        java.lang.Class<?> wildcardClass7 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        java.lang.Class<?> wildcardClass4 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass4 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        java.lang.String str8 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean8 = token4.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.Class<?> wildcardClass6 = token3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.Class<?> wildcardClass11 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str6 = token3.toString();
        boolean boolean7 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.Class<?> wildcardClass9 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str12 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.Class<?> wildcardClass14 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str5 = token4.toString();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str8 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str3 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str12 = token5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        boolean boolean6 = token2.isSet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        boolean boolean9 = token3.isSet();
        java.lang.Class<?> wildcardClass10 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean7 = token3.isSet();
        boolean boolean8 = token3.isSet();
        boolean boolean9 = token3.isSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str8 = token5.toString();
        boolean boolean9 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        java.lang.String str11 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        boolean boolean14 = token6.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str7 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        boolean boolean2 = token1.isSet();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        boolean boolean8 = token5.isSet();
        boolean boolean9 = token5.isSet();
        java.lang.String str10 = token5.toString();
        boolean boolean11 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token0 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        java.lang.String str1 = token0.toString();
        java.lang.String str2 = token0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        boolean boolean8 = token5.isSet();
        boolean boolean9 = token5.isSet();
        java.lang.String str10 = token5.toString();
        boolean boolean11 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean13 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        java.lang.String str10 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        java.lang.String str13 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        boolean boolean8 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        java.lang.String str9 = token3.toString();
        java.lang.Class<?> wildcardClass10 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str7 = token4.toString();
        java.lang.String str8 = token4.toString();
        boolean boolean9 = token4.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token0 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        java.lang.Class<?> wildcardClass1 = token0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token0 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        boolean boolean1 = token0.isSet();
        java.lang.String str2 = token0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.Class<?> wildcardClass10 = token3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        java.lang.String str3 = token1.toString();
        boolean boolean4 = token1.isSet();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        java.lang.String str11 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        boolean boolean14 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str5 = token2.toString();
        java.lang.Class<?> wildcardClass6 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        boolean boolean3 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        boolean boolean4 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token0 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        boolean boolean1 = token0.isSet();
        java.lang.Class<?> wildcardClass2 = token0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        java.lang.String str8 = token2.toString();
        java.lang.String str9 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        java.lang.String str9 = token3.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        java.lang.String str8 = token2.toString();
        boolean boolean9 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str11 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        java.lang.String str13 = token5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        java.lang.String str7 = token2.toString();
        boolean boolean8 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass10 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        java.lang.String str3 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        java.lang.String str9 = token3.toString();
        java.lang.String str10 = token3.toString();
        boolean boolean11 = token3.isSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean5 = token3.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        boolean boolean2 = token1.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        java.lang.String str4 = token1.toString();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        java.lang.String str5 = token1.toString();
        java.lang.Class<?> wildcardClass6 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        java.lang.String str10 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        boolean boolean14 = token6.isSet();
        boolean boolean15 = token6.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.Class<?> wildcardClass8 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str11 = token5.toString();
        java.lang.Class<?> wildcardClass12 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str6 = token3.toString();
        boolean boolean7 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.String str9 = token3.toString();
        java.lang.Class<?> wildcardClass10 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        boolean boolean8 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.String str8 = token3.toString();
        boolean boolean9 = token3.isSet();
        java.lang.Class<?> wildcardClass10 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str6 = token3.toString();
        boolean boolean7 = token3.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str13 = token5.toString();
        java.lang.Class<?> wildcardClass14 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        boolean boolean9 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str8 = token5.toString();
        boolean boolean9 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str12 = token5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean13 = token5.isSet();
        java.lang.String str14 = token5.toString();
        java.lang.Class<?> wildcardClass15 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        java.lang.String str5 = token1.toString();
        boolean boolean6 = token1.isSet();
        java.lang.String str7 = token1.toString();
        java.lang.String str8 = token1.toString();
        java.lang.Class<?> wildcardClass9 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean7 = token3.isSet();
        java.lang.Class<?> wildcardClass8 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        boolean boolean3 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        boolean boolean5 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        boolean boolean11 = token4.isSet();
        java.lang.String str12 = token4.toString();
        boolean boolean13 = token4.isSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.String str6 = token3.toString();
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        java.lang.String str9 = token3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str5 = token2.toString();
        boolean boolean6 = token2.isSet();
        boolean boolean7 = token2.isSet();
        java.lang.String str8 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        java.lang.String str3 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        boolean boolean5 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        java.lang.String str8 = token4.toString();
        java.lang.String str9 = token4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass7 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        boolean boolean2 = token1.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        boolean boolean4 = token1.isSet();
        java.lang.String str5 = token1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        java.lang.String str10 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        boolean boolean14 = token6.isSet();
        java.lang.String str15 = token6.toString();
        boolean boolean16 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        java.lang.String str9 = token3.toString();
        boolean boolean10 = token3.isSet();
        java.lang.Class<?> wildcardClass11 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str5 = token4.toString();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        boolean boolean8 = token4.isSet();
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.String str7 = token3.toString();
        java.lang.String str8 = token3.toString();
        java.lang.Class<?> wildcardClass9 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str8 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        boolean boolean11 = token4.isSet();
        boolean boolean12 = token4.isSet();
        java.lang.Class<?> wildcardClass13 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        boolean boolean8 = token5.isSet();
        boolean boolean9 = token5.isSet();
        java.lang.String str10 = token5.toString();
        java.lang.String str11 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        java.lang.String str7 = token3.toString();
        java.lang.String str8 = token3.toString();
        java.lang.Class<?> wildcardClass9 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        boolean boolean11 = token4.isSet();
        boolean boolean12 = token4.isSet();
        java.lang.String str13 = token4.toString();
        boolean boolean14 = token4.isSet();
        boolean boolean15 = token4.isSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        java.lang.String str3 = token1.toString();
        boolean boolean4 = token1.isSet();
        boolean boolean5 = token1.isSet();
        java.lang.Class<?> wildcardClass6 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        boolean boolean5 = token1.isSet();
        java.lang.Class<?> wildcardClass6 = token1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        java.lang.String str9 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token3);
        java.lang.String str5 = token3.toString();
        boolean boolean6 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        boolean boolean4 = token2.isSet();
        java.lang.String str5 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        java.lang.String str4 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        boolean boolean6 = token2.isSet();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str4 = token2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        boolean boolean11 = token4.isSet();
        java.lang.String str12 = token4.toString();
        java.lang.Class<?> wildcardClass13 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.String str11 = token4.toString();
        boolean boolean12 = token4.isSet();
        java.lang.Class<?> wildcardClass13 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        boolean boolean8 = token4.isSet();
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        java.lang.String str8 = token4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        java.lang.String str8 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass10 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean6 = token3.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        java.lang.String str8 = token2.toString();
        java.lang.String str9 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str11 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean11 = token5.isSet();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean7 = token3.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.String str9 = token4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        java.lang.String str9 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str2 = token1.toString();
        java.lang.String str3 = token1.toString();
        java.lang.Class<?> wildcardClass4 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str6 = token5.toString();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        boolean boolean9 = token5.isSet();
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.Class<?> wildcardClass14 = token5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str7 = token3.toString();
        java.lang.String str8 = token3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        java.lang.String str11 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        boolean boolean13 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        java.lang.String str11 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        boolean boolean5 = token1.isSet();
        boolean boolean6 = token1.isSet();
        java.lang.Class<?> wildcardClass7 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.String str6 = token3.toString();
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        java.lang.Class<?> wildcardClass9 = token3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str13 = token5.toString();
        boolean boolean14 = token5.isSet();
        java.lang.Class<?> wildcardClass15 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        java.lang.String str8 = token2.toString();
        boolean boolean9 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass11 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        java.lang.String str4 = token2.toString();
        boolean boolean5 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        java.lang.String str8 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        boolean boolean11 = token4.isSet();
        java.lang.String str12 = token4.toString();
        java.lang.String str13 = token4.toString();
        java.lang.Class<?> wildcardClass14 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        boolean boolean9 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str5 = token4.toString();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean9 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        java.lang.Class<?> wildcardClass4 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        boolean boolean8 = token2.isSet();
        java.lang.Class<?> wildcardClass9 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str7 = token4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.Class<?> wildcardClass14 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        java.lang.String str5 = token1.toString();
        java.lang.String str6 = token1.toString();
        java.lang.String str7 = token1.toString();
        boolean boolean8 = token1.isSet();
        java.lang.String str9 = token1.toString();
        java.lang.String str10 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        java.lang.String str8 = token2.toString();
        boolean boolean9 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        boolean boolean11 = token2.isSet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str10 = token4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str9 = token2.toString();
        java.lang.String str10 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        java.lang.String str11 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        boolean boolean13 = token6.isSet();
        boolean boolean14 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        java.lang.String str4 = token2.toString();
        boolean boolean5 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str7 = token2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        boolean boolean13 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str15 = token5.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hadoop.auth");
        boolean boolean2 = token1.isSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.Class<?> wildcardClass11 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        boolean boolean5 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str6 = token5.toString();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        boolean boolean9 = token5.isSet();
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean14 = token5.isSet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        boolean boolean13 = token5.isSet();
        java.lang.String str14 = token5.toString();
        boolean boolean15 = token5.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        java.lang.String str2 = token1.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        java.lang.String str4 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.String str11 = token4.toString();
        java.lang.Class<?> wildcardClass12 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean13 = token5.isSet();
        java.lang.Class<?> wildcardClass14 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        boolean boolean13 = token5.isSet();
        java.lang.String str14 = token5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        boolean boolean13 = token5.isSet();
        java.lang.String str14 = token5.toString();
        boolean boolean15 = token5.isSet();
        java.lang.String str16 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        boolean boolean4 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.Class<?> wildcardClass6 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        boolean boolean5 = token1.isSet();
        java.lang.String str6 = token1.toString();
        java.lang.String str7 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        java.lang.String str4 = token2.toString();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        boolean boolean7 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.String str8 = token3.toString();
        java.lang.String str9 = token3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.Class<?> wildcardClass6 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean13 = token5.isSet();
        boolean boolean14 = token5.isSet();
        java.lang.String str15 = token5.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        boolean boolean5 = token1.isSet();
        java.lang.Class<?> wildcardClass6 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str11 = token5.toString();
        boolean boolean12 = token5.isSet();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str5 = token4.toString();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        boolean boolean8 = token4.isSet();
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.String str12 = token4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        boolean boolean13 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.Class<?> wildcardClass15 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str8 = token5.toString();
        boolean boolean9 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str12 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str14 = token5.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        java.lang.String str5 = token1.toString();
        java.lang.String str6 = token1.toString();
        boolean boolean7 = token1.isSet();
        java.lang.String str8 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        java.lang.String str13 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean15 = token5.isSet();
        java.lang.String str16 = token5.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token0 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        boolean boolean1 = token0.isSet();
        boolean boolean2 = token0.isSet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str12 = token5.toString();
        boolean boolean13 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str5 = token4.toString();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        java.lang.String str5 = token1.toString();
        boolean boolean6 = token1.isSet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str8 = token5.toString();
        boolean boolean9 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str2 = token1.toString();
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean2 = token1.isSet();
        boolean boolean3 = token1.isSet();
        java.lang.String str4 = token1.toString();
        boolean boolean5 = token1.isSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        java.lang.String str8 = token2.toString();
        boolean boolean9 = token2.isSet();
        java.lang.String str10 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str13 = token5.toString();
        boolean boolean14 = token5.isSet();
        boolean boolean15 = token5.isSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str9 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.String str11 = token4.toString();
        boolean boolean12 = token4.isSet();
        boolean boolean13 = token4.isSet();
        boolean boolean14 = token4.isSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        boolean boolean9 = token3.isSet();
        boolean boolean10 = token3.isSet();
        boolean boolean11 = token3.isSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        boolean boolean9 = token3.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token3);
        java.lang.String str5 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean8 = token3.isSet();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        java.lang.String str8 = token2.toString();
        java.lang.String str9 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token2);
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        java.lang.String str7 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        boolean boolean5 = token1.isSet();
        java.lang.String str6 = token1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        java.lang.Class<?> wildcardClass9 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        boolean boolean8 = token4.isSet();
        java.lang.String str9 = token4.toString();
        boolean boolean10 = token4.isSet();
        boolean boolean11 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        java.lang.String str5 = token3.toString();
        java.lang.String str6 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str8 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        boolean boolean11 = token4.isSet();
        java.lang.String str12 = token4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        boolean boolean9 = token3.isSet();
        boolean boolean10 = token3.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        boolean boolean6 = token2.isSet();
        java.lang.String str7 = token2.toString();
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        boolean boolean5 = token1.isSet();
        java.lang.Class<?> wildcardClass6 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        boolean boolean5 = token1.isSet();
        boolean boolean6 = token1.isSet();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str8 = token4.toString();
        boolean boolean9 = token4.isSet();
        java.lang.String str10 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        java.lang.String str12 = token4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        boolean boolean13 = token5.isSet();
        java.lang.String str14 = token5.toString();
        java.lang.String str15 = token5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        boolean boolean8 = token2.isSet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        java.lang.String str10 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        boolean boolean14 = token6.isSet();
        java.lang.String str15 = token6.toString();
        boolean boolean16 = token6.isSet();
        boolean boolean17 = token6.isSet();
        boolean boolean18 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        boolean boolean8 = token4.isSet();
        java.lang.String str9 = token4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        java.lang.String str8 = token3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean8 = token3.isSet();
        java.lang.Class<?> wildcardClass9 = token3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean13 = token5.isSet();
        java.lang.String str14 = token5.toString();
        java.lang.String str15 = token5.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean13 = token5.isSet();
        java.lang.Class<?> wildcardClass14 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        boolean boolean4 = token2.isSet();
        java.lang.String str5 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        boolean boolean6 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str8 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        boolean boolean13 = token5.isSet();
        java.lang.String str14 = token5.toString();
        boolean boolean15 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        boolean boolean8 = token4.isSet();
        java.lang.String str9 = token4.toString();
        boolean boolean10 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.String str12 = token4.toString();
        boolean boolean13 = token4.isSet();
        java.lang.String str14 = token4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.Class<?> wildcardClass10 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean13 = token5.isSet();
        java.lang.String str14 = token5.toString();
        boolean boolean15 = token5.isSet();
        java.lang.String str16 = token5.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean2 = token1.isSet();
        boolean boolean3 = token1.isSet();
        java.lang.String str4 = token1.toString();
        java.lang.String str5 = token1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        boolean boolean7 = token2.isSet();
        java.lang.String str8 = token2.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str10 = token2.toString();
        java.lang.String str11 = token2.toString();
        boolean boolean12 = token2.isSet();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token7 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean8 = token7.isSet();
        boolean boolean9 = token7.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection5, token7);
        java.lang.String str11 = token7.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token7);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token7);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token7);
        java.lang.String str15 = token7.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        boolean boolean5 = token3.isSet();
        boolean boolean6 = token3.isSet();
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str10 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token3);
        boolean boolean5 = token3.isSet();
        java.lang.String str6 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        java.lang.Class<?> wildcardClass9 = token4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        boolean boolean4 = token2.isSet();
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        java.lang.String str7 = token2.toString();
        java.lang.String str8 = token2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        java.lang.String str7 = token3.toString();
        boolean boolean8 = token3.isSet();
        java.lang.Class<?> wildcardClass9 = token3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("hi!");
        java.lang.String str2 = token1.toString();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        boolean boolean5 = token1.isSet();
        java.lang.String str6 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        boolean boolean6 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str8 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        boolean boolean11 = token4.isSet();
        boolean boolean12 = token4.isSet();
        boolean boolean13 = token4.isSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean7 = token6.isSet();
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        java.lang.String str10 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        java.lang.String str14 = token6.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token6);
        java.lang.String str16 = token6.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean4 = token3.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        java.lang.String str6 = token3.toString();
        java.lang.String str7 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str13 = token5.toString();
        java.lang.String str14 = token5.toString();
        java.lang.Class<?> wildcardClass15 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean5 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        java.lang.String str7 = token4.toString();
        boolean boolean8 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean10 = token4.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        boolean boolean5 = token2.isSet();
        java.lang.String str6 = token2.toString();
        java.lang.Class<?> wildcardClass7 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str4 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str2 = token1.toString();
        java.lang.String str3 = token1.toString();
        java.lang.String str4 = token1.toString();
        boolean boolean5 = token1.isSet();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        boolean boolean5 = token2.isSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        boolean boolean12 = token5.isSet();
        boolean boolean13 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean15 = token5.isSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token3);
        boolean boolean6 = token3.isSet();
        boolean boolean7 = token3.isSet();
        java.lang.String str8 = token3.toString();
        java.lang.String str9 = token3.toString();
        java.lang.String str10 = token3.toString();
        java.lang.String str11 = token3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token3 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token3);
        java.lang.String str5 = token3.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.client.AuthenticatedURL.extractToken(httpURLConnection0, token3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        java.lang.String str10 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str12 = token5.toString();
        boolean boolean13 = token5.isSet();
        boolean boolean14 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        boolean boolean16 = token5.isSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token();
        java.lang.String str2 = token1.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token1);
        boolean boolean4 = token1.isSet();
        java.lang.String str5 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token4 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token4);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token4);
        boolean boolean7 = token4.isSet();
        boolean boolean8 = token4.isSet();
        java.lang.String str9 = token4.toString();
        java.lang.String str10 = token4.toString();
        boolean boolean11 = token4.isSet();
        java.lang.String str12 = token4.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token4);
        boolean boolean14 = token4.isSet();
        java.lang.String str15 = token4.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.net.HttpURLConnection httpURLConnection0 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token2 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean3 = token2.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token2);
        java.lang.String str5 = token2.toString();
        boolean boolean6 = token2.isSet();
        java.lang.String str7 = token2.toString();
        boolean boolean8 = token2.isSet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token6 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection4, token6);
        boolean boolean8 = token6.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token6);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        boolean boolean8 = token5.isSet();
        boolean boolean9 = token5.isSet();
        java.lang.String str10 = token5.toString();
        java.lang.String str11 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str14 = token5.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token1 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean2 = token1.isSet();
        boolean boolean3 = token1.isSet();
        boolean boolean4 = token1.isSet();
        boolean boolean5 = token1.isSet();
        boolean boolean6 = token1.isSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        boolean boolean8 = token5.isSet();
        boolean boolean9 = token5.isSet();
        java.lang.String str10 = token5.toString();
        boolean boolean11 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        java.lang.String str13 = token5.toString();
        boolean boolean14 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.net.HttpURLConnection httpURLConnection0 = null;
        java.net.HttpURLConnection httpURLConnection1 = null;
        java.net.HttpURLConnection httpURLConnection2 = null;
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token token5 = new org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token("");
        boolean boolean6 = token5.isSet();
        boolean boolean7 = token5.isSet();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection3, token5);
        java.lang.String str9 = token5.toString();
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection2, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection1, token5);
        org.apache.hadoop.security.authentication.client.AuthenticatedURL.injectToken(httpURLConnection0, token5);
        java.lang.String str13 = token5.toString();
        java.lang.Class<?> wildcardClass14 = token5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

