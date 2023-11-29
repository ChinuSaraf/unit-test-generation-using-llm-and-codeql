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
        boolean boolean0 = org.apache.hadoop.security.authentication.util.KerberosName.hasRulesBeenSet();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        boolean boolean0 = org.apache.hadoop.security.authentication.util.KerberosName.hasRuleMechanismBeenSet();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.hadoop.security.authentication.util.KerberosName.resetDefaultRealm();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.getDefaultRealm();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.DEFAULT_MECHANISM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop" + "'", str0, "hadoop");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.MECHANISM_HADOOP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop" + "'", str0, "hadoop");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.hadoop.security.authentication.util.KerberosName.setRules("");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.MECHANISM_MIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mit" + "'", str0, "mit");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("mit");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("hadoop");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: hadoop");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass3 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.getRules();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule mechanism: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.Class<?> wildcardClass2 = kerberosName1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.hadoop.security.authentication.util.KerberosName.setRuleMechanism("hadoop");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass8 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str0 = org.apache.hadoop.security.authentication.util.KerberosName.getRuleMechanism();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hadoop" + "'", str0, "hadoop");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.security.authentication.util.KerberosName.setRules("mit");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rule: mit");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.Class<?> wildcardClass2 = kerberosName1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass9 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.Class<?> wildcardClass2 = kerberosName1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hadoop");
        java.lang.Class<?> wildcardClass2 = kerberosName1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass4 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass11 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass9 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getServiceName();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass10 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass4 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.toString();
        java.lang.String str13 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass14 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getShortName();
        java.lang.String str13 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getServiceName();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.toString();
        java.lang.String str11 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getServiceName();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mit" + "'", str6, "mit");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mit" + "'", str7, "mit");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getShortName();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.String str11 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass11 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getServiceName();
        java.lang.String str9 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass8 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getShortName();
        java.lang.String str10 = kerberosName1.getShortName();
        java.lang.String str11 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.toString();
        java.lang.String str13 = kerberosName1.getShortName();
        java.lang.String str14 = kerberosName1.getServiceName();
        java.lang.String str15 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.toString();
        java.lang.String str13 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass10 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getServiceName();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass10 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass9 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass8 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass12 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getShortName();
        java.lang.String str13 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass8 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getShortName();
        java.lang.String str10 = kerberosName1.getShortName();
        java.lang.String str11 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getShortName();
        java.lang.String str13 = kerberosName1.toString();
        java.lang.String str14 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass15 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass4 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mit" + "'", str6, "mit");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mit" + "'", str8, "mit");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getServiceName();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass8 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getShortName();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.String str11 = kerberosName1.getHostName();
        java.lang.String str12 = kerberosName1.getServiceName();
        java.lang.String str13 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass13 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass9 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.String str11 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getShortName();
        java.lang.String str11 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass3 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass3 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass3 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getShortName();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.String str11 = kerberosName1.getHostName();
        java.lang.String str12 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass13 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass13 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.toString();
        java.lang.String str13 = kerberosName1.getShortName();
        java.lang.String str14 = kerberosName1.getRealm();
        java.lang.String str15 = kerberosName1.getHostName();
        java.lang.String str16 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass3 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass4 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getShortName();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass10 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getServiceName();
        java.lang.String str9 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass13 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getServiceName();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.toString();
        java.lang.String str11 = kerberosName1.toString();
        java.lang.String str12 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.toString();
        java.lang.String str13 = kerberosName1.getShortName();
        java.lang.String str14 = kerberosName1.getRealm();
        java.lang.String str15 = kerberosName1.getHostName();
        java.lang.String str16 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass5 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getShortName();
        java.lang.String str9 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getShortName();
        java.lang.String str13 = kerberosName1.toString();
        java.lang.String str14 = kerberosName1.getHostName();
        java.lang.String str15 = kerberosName1.toString();
        java.lang.String str16 = kerberosName1.getShortName();
        java.lang.String str17 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass11 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass9 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mit" + "'", str7, "mit");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mit" + "'", str8, "mit");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.toString();
        java.lang.String str11 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.String str11 = kerberosName1.getRealm();
        java.lang.String str12 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.String str11 = kerberosName1.toString();
        java.lang.String str12 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass8 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass4 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass6 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getShortName();
        java.lang.String str13 = kerberosName1.toString();
        java.lang.String str14 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass11 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getHostName();
        java.lang.String str10 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getServiceName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mit" + "'", str8, "mit");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mit" + "'", str6, "mit");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getShortName();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getShortName();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.String str11 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getShortName();
        java.lang.Class<?> wildcardClass13 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.String str11 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hadoop");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hadoop" + "'", str2, "hadoop");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hadoop" + "'", str3, "hadoop");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getRealm();
        java.lang.String str13 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass14 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.toString();
        java.lang.Class<?> wildcardClass13 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.String str11 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass10 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getShortName();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass11 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getShortName();
        java.lang.String str11 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mit" + "'", str8, "mit");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mit" + "'", str9, "mit");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mit" + "'", str10, "mit");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mit" + "'", str6, "mit");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.Class<?> wildcardClass8 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mit" + "'", str7, "mit");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.String str11 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getShortName();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass7 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getRealm();
        java.lang.String str13 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.toString();
        java.lang.String str13 = kerberosName1.getShortName();
        java.lang.String str14 = kerberosName1.getRealm();
        java.lang.String str15 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mit" + "'", str5, "mit");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.String str11 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.getServiceName();
        java.lang.String str11 = kerberosName1.toString();
        java.lang.String str12 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.getShortName();
        java.lang.String str13 = kerberosName1.toString();
        java.lang.String str14 = kerberosName1.toString();
        java.lang.String str15 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getServiceName();
        java.lang.String str12 = kerberosName1.toString();
        java.lang.String str13 = kerberosName1.getShortName();
        java.lang.String str14 = kerberosName1.getRealm();
        java.lang.String str15 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass16 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hadoop");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hadoop" + "'", str3, "hadoop");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hadoop" + "'", str5, "hadoop");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hadoop" + "'", str6, "hadoop");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getHostName();
        java.lang.String str7 = kerberosName1.toString();
        java.lang.String str8 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getHostName();
        java.lang.String str11 = kerberosName1.getRealm();
        java.lang.String str12 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mit" + "'", str4, "mit");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getHostName();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.toString();
        java.lang.String str11 = kerberosName1.getHostName();
        java.lang.String str12 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getServiceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getHostName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getServiceName();
        java.lang.String str10 = kerberosName1.getRealm();
        java.lang.String str11 = kerberosName1.toString();
        java.lang.String str12 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hadoop");
        java.lang.String str2 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.toString();
        java.lang.String str6 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getRealm();
        java.lang.String str9 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getHostName();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.Class<?> wildcardClass4 = kerberosName1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getRealm();
        java.lang.String str7 = kerberosName1.getShortName();
        java.lang.String str8 = kerberosName1.getHostName();
        java.lang.String str9 = kerberosName1.getRealm();
        java.lang.String str10 = kerberosName1.toString();
        java.lang.String str11 = kerberosName1.getRealm();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getShortName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.getShortName();
        java.lang.String str7 = kerberosName1.getRealm();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getServiceName();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mit" + "'", str6, "mit");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.toString();
        java.lang.String str5 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.toString();
        java.lang.String str9 = kerberosName1.toString();
        java.lang.String str10 = kerberosName1.toString();
        java.lang.String str11 = kerberosName1.getHostName();
        java.lang.Class<?> wildcardClass12 = kerberosName1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getShortName();
        java.lang.String str5 = kerberosName1.getServiceName();
        java.lang.String str6 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.getShortName();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getShortName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getServiceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.toString();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getServiceName();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getShortName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("hi!");
        java.lang.String str2 = kerberosName1.getRealm();
        java.lang.String str3 = kerberosName1.getRealm();
        java.lang.String str4 = kerberosName1.getRealm();
        java.lang.String str5 = kerberosName1.getHostName();
        java.lang.String str6 = kerberosName1.toString();
        java.lang.String str7 = kerberosName1.getServiceName();
        java.lang.String str8 = kerberosName1.getHostName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.hadoop.security.authentication.util.KerberosName kerberosName1 = new org.apache.hadoop.security.authentication.util.KerberosName("mit");
        java.lang.String str2 = kerberosName1.getShortName();
        java.lang.String str3 = kerberosName1.toString();
        java.lang.String str4 = kerberosName1.getHostName();
        java.lang.String str5 = kerberosName1.getRealm();
        java.lang.String str6 = kerberosName1.getServiceName();
        java.lang.String str7 = kerberosName1.getRealm();
        java.lang.String str8 = kerberosName1.getHostName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mit" + "'", str2, "mit");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mit" + "'", str3, "mit");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mit" + "'", str6, "mit");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }
}

