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
        org.apache.hadoop.registry.client.binding.RegistryTypeUtils registryTypeUtils0 = new org.apache.hadoop.registry.client.binding.RegistryTypeUtils();
        java.lang.Class<?> wildcardClass1 = registryTypeUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.hadoop.registry.client.types.Endpoint endpoint0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.net.URL> uRLList1 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.retrieveAddressURLs(endpoint0);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Null endpoint");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.hadoop.registry.client.types.Endpoint endpoint0 = null;
        java.util.List<java.lang.String> strList1 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.retrieveAddressesUriType(endpoint0);
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.hadoop.registry.client.types.Endpoint endpoint1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.registry.client.binding.RegistryTypeUtils.validateEndpoint("hi!", endpoint1);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `hi!': Null endpoint");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap1 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair(inetSocketAddress0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.hadoop.registry.client.types.Endpoint endpoint1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.registry.client.binding.RegistryTypeUtils.validateEndpoint("", endpoint1);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Null endpoint");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.hadoop.registry.client.types.Endpoint endpoint1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.registry.client.binding.RegistryTypeUtils.requireAddressType("", endpoint1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.uri("");
        java.lang.Class<?> wildcardClass2 = strMap1.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.hadoop.registry.client.types.ServiceRecord serviceRecord1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.registry.client.binding.RegistryTypeUtils.validateServiceRecord("hi!", serviceRecord1);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `hi!': Null record");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.uri("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap1, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.hadoop.registry.client.types.ServiceRecord serviceRecord1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.registry.client.binding.RegistryTypeUtils.validateServiceRecord("", serviceRecord1);
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Null record");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.hadoop.registry.client.types.Endpoint endpoint1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.registry.client.binding.RegistryTypeUtils.requireAddressType("hi!", endpoint1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 0);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) 'a');
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.uri("hi!");
        java.lang.Class<?> wildcardClass2 = strMap1.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) '4');
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.uri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap1, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass5 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (-1));
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 0);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 10);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) '#');
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) ' ');
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (-1));
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.uri("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap1, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 100);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 10);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass7 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 100);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass5 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass5 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) ' ');
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) 'a');
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) '#');
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass9 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass9 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass7 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) '4');
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 1);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass7 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.uri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap1, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass5 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass7 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass9 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass11 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass13 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass9 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass15 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass11 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass11 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass13 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.hostnamePortPair("", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass15 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass17 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass13 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass19 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass15 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass17 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass11 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass13 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass19 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass17 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass15 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass17 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass23 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass21 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass19 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass25 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass21 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass23 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass27 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass23 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass21 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass21 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass19 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass29 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass25 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass23 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass29 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass27 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass25 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass31 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass31 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass25 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass33 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass33 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass35 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass27 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass35 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass37 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass29 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass27 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass37 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass31 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass29 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass39 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass31 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass41 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass33 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass39 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass43 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass43 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass37 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass45 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass35 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass33 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass37 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass41 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass47 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass35 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass49 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass51 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass39 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass39 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass41 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass47 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass43 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass45 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass41 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass53 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass43 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass45 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass47 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass53 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str56 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass57 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass45 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass55 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass49 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass51 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass55 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass49 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass51 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass47 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str56 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass49 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass51 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass53 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass53 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str56 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str58 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass59 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str56 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str58 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: ");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.hadoop.registry.client.exceptions.InvalidRecordException; message: `': Missing address field: hi!");
        } catch (org.apache.hadoop.registry.client.exceptions.InvalidRecordException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("hi!", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "hi!");
        java.lang.Class<?> wildcardClass55 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str56 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.map("", "hi!");
        java.lang.String str4 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str6 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str8 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str10 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str12 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str14 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str16 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str18 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str20 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str22 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str24 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str26 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str28 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str30 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str32 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str34 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str36 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str38 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str40 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str42 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str44 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str46 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str48 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str50 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str52 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str54 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.String str56 = org.apache.hadoop.registry.client.binding.RegistryTypeUtils.getAddressField(strMap2, "");
        java.lang.Class<?> wildcardClass57 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }
}

