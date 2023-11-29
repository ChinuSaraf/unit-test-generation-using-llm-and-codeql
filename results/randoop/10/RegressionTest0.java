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
        java.net.InetSocketAddress inetSocketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI2 = org.apache.hadoop.hdfs.DFSUtil.createUri("hi!", inetSocketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("hi!", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 2: hi!://:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.net.InetSocketAddress>> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.hadoop.hdfs.DFSUtil.ConfiguredNNAddress> configuredNNAddressList1 = org.apache.hadoop.hdfs.DFSUtil.flattenAddressMap(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.dateToIso8601String(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.cli.Option option0 = org.apache.hadoop.hdfs.DFSUtil.helpOpt;
        org.junit.Assert.assertNotNull(option0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServer(inetSocketAddress0, configuration1, "100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.security.SecureRandom secureRandom0 = org.apache.hadoop.hdfs.DFSUtil.getSecureRandom();
        org.junit.Assert.assertNotNull(secureRandom0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.getOnlyNameServiceIdOrNull(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.getBackupNameServiceId(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServer(inetSocketAddress0, configuration1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.lang.Class<?> wildcardClass10 = datanodeInfoComparator9.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray2 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray0, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet1 = org.apache.hadoop.hdfs.DFSUtil.getAllNnPrincipals(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray7 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray4, (int) (byte) 100, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [len, size] [100, 4]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 10, -1]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.hadoop.hdfs.DFSUtil.getReplWorkMultiplier(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("hi!", "100", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 2: hi!://100:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet1 = org.apache.hadoop.hdfs.DFSUtil.getJournalNodeAddresses(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.durationToString((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-000:00:00:00.001" + "'", str1, "-000:00:00:00.001");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo10 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = staleAndSlowComparator7.compare(datanodeInfo10, datanodeInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("hi!", "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 2: hi!://hi!:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "100", "", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.net.InetSocketAddress>> strMap1 = org.apache.hadoop.hdfs.DFSUtil.getBackupNodeAddresses(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.getHttpClientScheme(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.net.InetSocketAddress>> strMap1 = org.apache.hadoop.hdfs.DFSUtil.getNNLifelineRpcAddressesForCluster(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo8 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = staleAndSlowComparator7.compare(datanodeInfo8, datanodeInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.hadoop.hdfs.server.namenode.FSDirectory fSDirectory0 = null;
        org.apache.hadoop.hdfs.server.namenode.INodesInPath iNodesInPath1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.hdfs.DFSUtil.checkProtectedDescendants(fSDirectory0, iNodesInPath1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidName("-000:00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidName("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "-000:00:00:00.001", "hi!", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.hadoop.hdfs.DFSUtil.getInvalidateWorkPctPerIteration(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("\000\000", configuration1, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.getSecondaryNameServiceId(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "-000:00:00:00.001", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "100", "100", "-000:00:00:00.001" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("hi!", configuration1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray1, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [offset, range, size] [10, 107, 1]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress4 = org.apache.hadoop.hdfs.DFSUtil.getBindAddress(configuration0, "hi!", "", "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeNameServiceId(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1 };
        byte[][] byteArray6 = new byte[][] { byteArray2, byteArray5 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray6, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [offset, range, size] [100, 200, 2]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidName("\000\000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.nnAddressesAsString(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.addKeySuffixes("100", strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.getSpnegoKeytabKey(configuration0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB((long) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo10 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = staleAndSlowComparator7.compare(datanodeInfo10, datanodeInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000" + "'", str3, "\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000" + "'", str4, "\000\000");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("", configuration1, "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:-000:00:00:00.001");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("hi!", "-000:00:00:00.001", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 2: hi!://[-000:00:00:00.001]:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.net.InetSocketAddress>> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.addressMapToString(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.net.InetSocketAddress>> strMap1 = org.apache.hadoop.hdfs.DFSUtil.getSecondaryNameNodeAddresses(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidNameForComponent("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        byte[][] byteArray0 = new byte[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray0, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [offset, range, size] [0, 1, 0]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "100", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB((long) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.hadoop.http.HttpServer2.Builder builder0 = null;
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder2 = org.apache.hadoop.hdfs.DFSUtil.loadSslConfToHttpServerBuilder(builder0, configuration1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServer(inetSocketAddress0, configuration1, "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:-000:00:00:00.001");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        byte[][] byteArray30 = new byte[][] { byteArray5, byteArray11, byteArray17, byteArray23, byteArray29 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray30, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [offset, range, size] [-1, 31, 5]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "100", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.EnumSet<org.apache.hadoop.hdfs.protocol.HdfsFileStatus.Flags> flagsSet4 = org.apache.hadoop.hdfs.DFSUtil.getFlags(false, true, true, false);
        org.junit.Assert.assertNotNull(flagsSet4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("", configuration1, "100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.getSpnegoKeytabKey(configuration0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "100", "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("100", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 100://:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.slf4j.Logger logger0 = org.apache.hadoop.hdfs.DFSUtil.LOG;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("\000\000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpConfig.Policy policy1 = org.apache.hadoop.hdfs.DFSUtil.getHttpPolicy(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.net.URI> uRICollection1 = org.apache.hadoop.hdfs.DFSUtil.getInternalNsRpcUris(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of : too short");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "-000:00:00:00.001", "-000:00:00:00.001", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("\000\000", "\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.hadoop.hdfs.server.datanode.metrics.DataNodeMetrics dataNodeMetrics0 = null;
        org.apache.hadoop.hdfs.DFSUtil.addTransferRateMetric(dataNodeMetrics0, (long) (-1), (long) (short) 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress4 = org.apache.hadoop.hdfs.DFSUtil.getBindAddress(configuration0, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("100", "-000:00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "\000\000", "100", "", "\000\000" };
        java.io.PrintStream printStream9 = null;
        boolean boolean11 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray7, "", printStream9, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("-000:00:00:00.001", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of -000:00:00:00.001: -000:00:00:00.00 is not a number");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "-000:00:00:00.001", "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.durationToString(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000:00:00:00.010" + "'", str1, "000:00:00:00.010");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.hadoop.hdfs.server.datanode.metrics.DataNodeMetrics dataNodeMetrics0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.hdfs.DFSUtil.addTransferRateMetric(dataNodeMetrics0, (long) 'a', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.crypto.key.KeyProviderCryptoExtension keyProviderCryptoExtension1 = org.apache.hadoop.hdfs.DFSUtil.createKeyProviderCryptoExtension(configuration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "100", "hi!", "", "100", "hi!", "100" };
        java.io.PrintStream printStream10 = null;
        boolean boolean12 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray8, "100", printStream10, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = staleAndSlowComparator18.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator22 = datanodeInfoComparator10.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator18);
        java.lang.String str23 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(datanodeInfoComparator22);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "000:00:00:00.010", "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("000:00:00:00.010", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 000:00:00:00.010://:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.EnumSet<org.apache.hadoop.hdfs.protocol.HdfsFileStatus.Flags> flagsSet4 = org.apache.hadoop.hdfs.DFSUtil.getFlags(false, true, false, true);
        org.junit.Assert.assertNotNull(flagsSet4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress4 = org.apache.hadoop.hdfs.DFSUtil.getBindAddress(configuration0, "\000\000", "", "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.getSpnegoKeytabKey(configuration0, "000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("000:00:00:00.010");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 49, 48]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.durationToString((long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-000:00:00:00.001" + "'", str1, "-000:00:00:00.001");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.hadoop.hdfs.server.datanode.metrics.DataNodeMetrics dataNodeMetrics0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.hdfs.DFSUtil.addTransferRateMetric(dataNodeMetrics0, (long) (byte) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("\000\000", "000:00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI2 = org.apache.hadoop.hdfs.DFSUtil.createUri("-000:00:00:00.001", inetSocketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidNameForComponent("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("100", "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 100://hi!:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("\000\000");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of ??: ? is not a number");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (short) 1, (int) (short) 10);
        byte[][] byteArray5 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray0, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("100", configuration1, "000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:000:00:00:00.010");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.hadoop.hdfs.server.datanode.metrics.DataNodeMetrics dataNodeMetrics0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.hdfs.DFSUtil.addTransferRateMetric(dataNodeMetrics0, 1L, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidNameForComponent("000:00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator17 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet15);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator18 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator19 = staleAndSlowComparator17.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator18);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = serviceComparator8.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator17);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo21 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = staleAndSlowComparator17.compare(datanodeInfo21, datanodeInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator19);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.getSpnegoKeytabKey(configuration0, "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "hi!", "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000" + "'", str3, "\000\000");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI2 = org.apache.hadoop.hdfs.DFSUtil.createUri("000:00:00:00.010", inetSocketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.hadoop.conf.Configuration configuration2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.hadoop.conf.Configuration configuration4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration4, "", "-000:00:00:00.001", strArray7);
        java.lang.String str9 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray7);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration2, inetSocketAddress3, strArray7);
        java.lang.String str11 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray7);
        java.lang.String str12 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("-000:00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress4 = org.apache.hadoop.hdfs.DFSUtil.getBindAddress(configuration0, "-000:00:00:00.001", "100", "000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator0 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator8 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet6);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator9 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = staleAndSlowComparator8.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator9);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator11 = staleAndSlowComparator8.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator12 = serviceComparator0.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator8);
        java.lang.Class<?> wildcardClass13 = datanodeInfoComparator12.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(datanodeInfoComparator11);
        org.junit.Assert.assertNotNull(datanodeInfoComparator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServer(inetSocketAddress0, configuration1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("", configuration1, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("0");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of 0: too short");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("hi!");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.lang.Class<?> wildcardClass22 = datanodeInfoComparator21.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "-000:00:00:00.001", "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo11 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = serviceComparator8.compare(datanodeInfo11, datanodeInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator23 = datanodeInfoComparator21.thenComparing(datanodeInfoComparator22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "\000\000", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.EnumSet<org.apache.hadoop.hdfs.protocol.HdfsFileStatus.Flags> flagsSet4 = org.apache.hadoop.hdfs.DFSUtil.getFlags(true, false, false, true);
        org.junit.Assert.assertNotNull(flagsSet4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "-000:00:00:00.001", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("100");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        byte[][] byteArray4 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 0);
        java.lang.String str5 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (byte) 1, (-1));
        java.lang.String str8 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-000:00:00:00.001" + "'", str7, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator10 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = staleAndSlowComparator18.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator22 = staleAndSlowComparator10.thenComparing(datanodeInfoComparator21);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo23 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = staleAndSlowComparator10.compare(datanodeInfo23, datanodeInfo24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(datanodeInfoComparator22);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("0", "000:00:00:00.010", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 0://[000:00:00:00.010]:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator0 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.lang.Class<?> wildcardClass1 = serviceComparator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.durationToString((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000:00:00:00.052" + "'", str1, "000:00:00:00.052");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        byte[][] byteArray6 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray9 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (-1), (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [len, size] [-1, 17]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo10 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = serviceComparator8.compare(datanodeInfo10, datanodeInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress4 = org.apache.hadoop.hdfs.DFSUtil.getBindAddress(configuration0, "0", "100", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.EnumSet<org.apache.hadoop.hdfs.protocol.HdfsFileStatus.Flags> flagsSet4 = org.apache.hadoop.hdfs.DFSUtil.getFlags(true, true, false, true);
        org.junit.Assert.assertNotNull(flagsSet4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("-000:00:00:00.001", "100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB(100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "100", "100", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2, (int) '4', (-1));
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2, 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000" + "'", str3, "\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000" + "'", str4, "\000\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000" + "'", str7, "\000\000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000" + "'", str10, "\000\000");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.getSpnegoKeytabKey(configuration0, "000:00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator29 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet27);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator30 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = staleAndSlowComparator29.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator30);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = serviceComparator30.reversed();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator40 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet38);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator41 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = staleAndSlowComparator40.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator41);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator32.thenComparing(datanodeInfoComparator42);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator44 = datanodeInfoComparator20.thenComparing(datanodeInfoComparator32);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator52 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet50);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator53 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator54 = staleAndSlowComparator52.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator53);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator55 = serviceComparator53.reversed();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator63 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet61);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator64 = datanodeInfoComparator55.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator63);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator65 = datanodeInfoComparator44.thenComparing(datanodeInfoComparator64);
        java.lang.String str66 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) datanodeInfoComparator44);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(datanodeInfoComparator44);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator54);
        org.junit.Assert.assertNotNull(datanodeInfoComparator55);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator64);
        org.junit.Assert.assertNotNull(datanodeInfoComparator65);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB(10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("1");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of 1: too short");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator19 = datanodeInfoComparator10.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator18);
        java.lang.String str20 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) staleAndSlowComparator18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) staleAndSlowComparator7);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo11 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = staleAndSlowComparator7.compare(datanodeInfo11, datanodeInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI2 = org.apache.hadoop.hdfs.DFSUtil.createUri("\000\000", inetSocketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.getSpnegoKeytabKey(configuration0, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        org.apache.hadoop.conf.Configuration configuration3 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        org.apache.hadoop.conf.Configuration configuration5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration5, "", "-000:00:00:00.001", strArray8);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray8);
        java.lang.String str11 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration3, inetSocketAddress4, strArray8);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration0, "100", "-000:00:00:00.001", strArray8);
        java.lang.Class<?> wildcardClass13 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI2 = org.apache.hadoop.hdfs.DFSUtil.createUri("", inetSocketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.durationToString((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000:00:00:00.001" + "'", str1, "000:00:00:00.001");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "000:00:00:00.001", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("100");
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray4 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (int) (short) 100, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [len, size] [100, 3]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("000:00:00:00.001", configuration1, "000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:000:00:00:00.010");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.durationToString((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000:00:00:00.010" + "'", str1, "000:00:00:00.010");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator29 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet27);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator30 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = staleAndSlowComparator29.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator30);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = serviceComparator30.reversed();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator40 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet38);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator41 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = staleAndSlowComparator40.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator41);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator32.thenComparing(datanodeInfoComparator42);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator44 = datanodeInfoComparator20.thenComparing(datanodeInfoComparator32);
        java.lang.String str45 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(datanodeInfoComparator44);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.path2String(obj0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("000:00:00:00.010", "0", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 000:00:00:00.010://0:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.hadoop.hdfs.server.datanode.metrics.DataNodeMetrics dataNodeMetrics0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.hdfs.DFSUtil.addTransferRateMetric(dataNodeMetrics0, (long) '#', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator19 = datanodeInfoComparator10.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator18);
        java.lang.Class<?> wildcardClass20 = datanodeInfoComparator10.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("100");
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray4 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (int) (byte) 100, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [len, size] [100, 3]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI2 = org.apache.hadoop.hdfs.DFSUtil.createUri("0", inetSocketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "000:00:00:00.001", "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("1", configuration1, "000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:000:00:00:00.001");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidName("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "\000\000", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of 000:00:00:00.001: 000:00:00:00.00 is not a number");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("hi!");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 105, 33]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("000:00:00:00.052", "000:00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("-000:00:00:00.001", configuration1, "100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "100", "000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("class org.apache.commons.cli.Options");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (short) 1, (int) (short) 10);
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.EnumSet<org.apache.hadoop.hdfs.protocol.HdfsFileStatus.Flags> flagsSet4 = org.apache.hadoop.hdfs.DFSUtil.getFlags(false, true, true, true);
        org.junit.Assert.assertNotNull(flagsSet4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet11);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator15 = staleAndSlowComparator14.reversed();
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo16 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = staleAndSlowComparator14.compare(datanodeInfo16, datanodeInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.hadoop.hdfs.server.datanode.metrics.DataNodeMetrics dataNodeMetrics0 = null;
        org.apache.hadoop.hdfs.DFSUtil.addTransferRateMetric(dataNodeMetrics0, (long) (short) 1, 0L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("100");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of 100: unknown time unit 0");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("100");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        byte[][] byteArray4 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 0);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String[] strArray14 = new java.lang.String[] { "100", "", "\000\000", "\000\000", "-000:00:00:00.001", "000:00:00:00.001", "0", "\000\000", "hi!", "1", "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator17 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) 100, false, (java.util.Set<java.lang.String>) strSet15);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("hi!");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray1, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [offset, range, size] [0, 10, 1]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "-000:00:00:00.001", "000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress4 = org.apache.hadoop.hdfs.DFSUtil.getBindAddress(configuration0, "class org.apache.commons.cli.Options", "", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("000:00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.hadoop.conf.Configuration configuration2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration2, "", "-000:00:00:00.001", strArray5);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServer(inetSocketAddress0, configuration1, "0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress4 = org.apache.hadoop.hdfs.DFSUtil.getBindAddress(configuration0, "1", "000:00:00:00.010", "000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-000:00:00:00.001" + "'", str7, "-000:00:00:00.001");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidName("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidNameForComponent("\000\000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidName("000:00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("\000\000");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000" + "'", str4, "\000\000");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator16 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator17 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (-1L), true, (java.util.Set<java.lang.String>) strSet14);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("hi!");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        byte[][] byteArray6 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 10);
        byte[][] byteArray8 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray11 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, 100, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [len, size] [100, 17]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "0", "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.hadoop.hdfs.server.datanode.metrics.DataNodeMetrics dataNodeMetrics0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.hdfs.DFSUtil.addTransferRateMetric(dataNodeMetrics0, 0L, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI2 = org.apache.hadoop.hdfs.DFSUtil.createUri("100", inetSocketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "0", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        org.apache.hadoop.conf.Configuration configuration3 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        org.apache.hadoop.conf.Configuration configuration5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.hadoop.conf.Configuration configuration7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration7, "", "-000:00:00:00.001", strArray10);
        java.lang.String str12 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray10);
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration5, inetSocketAddress6, strArray10);
        java.io.PrintStream printStream15 = null;
        boolean boolean17 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray10, "000:00:00:00.052", printStream15, true);
        java.lang.String str18 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration3, inetSocketAddress4, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration0, "100", "0", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator29 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet27);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator30 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = staleAndSlowComparator29.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator30);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = serviceComparator30.reversed();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator40 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet38);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator41 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = staleAndSlowComparator40.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator41);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator32.thenComparing(datanodeInfoComparator42);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator44 = datanodeInfoComparator20.thenComparing(datanodeInfoComparator32);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator55 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet53);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator56 = datanodeInfoComparator20.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator55);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo57 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo58 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int59 = staleAndSlowComparator55.compare(datanodeInfo57, datanodeInfo58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(datanodeInfoComparator44);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator56);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.getSpnegoKeytabKey(configuration0, "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "000:00:00:00.001", "class org.apache.commons.cli.Options");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        byte[][] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "1", "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str5 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000" + "'", str3, "\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000" + "'", str4, "\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000" + "'", str5, "\000\000");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.String[] strArray4 = new java.lang.String[] { "0" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) (byte) 0, false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo8 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = staleAndSlowComparator7.compare(datanodeInfo8, datanodeInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator29 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet27);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator30 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = staleAndSlowComparator29.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator30);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = serviceComparator30.reversed();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator40 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet38);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator41 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = staleAndSlowComparator40.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator41);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator32.thenComparing(datanodeInfoComparator42);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator44 = datanodeInfoComparator20.thenComparing(datanodeInfoComparator32);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator45 = datanodeInfoComparator32.reversed();
        java.lang.Class<?> wildcardClass46 = datanodeInfoComparator45.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(datanodeInfoComparator44);
        org.junit.Assert.assertNotNull(datanodeInfoComparator45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "1", "000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "\000\000", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.EnumSet<org.apache.hadoop.hdfs.protocol.HdfsFileStatus.Flags> flagsSet4 = org.apache.hadoop.hdfs.DFSUtil.getFlags(true, true, false, false);
        org.junit.Assert.assertNotNull(flagsSet4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.getSpnegoKeytabKey(configuration0, "000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("100", "\000\000", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 100://??:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator10 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = staleAndSlowComparator18.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator22 = staleAndSlowComparator10.thenComparing(datanodeInfoComparator21);
        java.lang.Class<?> wildcardClass23 = staleAndSlowComparator10.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(datanodeInfoComparator22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "\000\000", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("1");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray1, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (short) 1, (int) (short) 10);
        java.lang.String str6 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, 0, (int) (byte) 100);
        java.lang.String str9 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("100");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        byte[][] byteArray4 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 0);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, 1, (int) ' ');
        byte[][] byteArray10 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, 1, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray10, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [offset, range, size] [-1, 0, 1]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.String[] strArray7 = new java.lang.String[] { "0" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator10 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) (byte) 0, false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator11 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, 1L, false, (java.util.Set<java.lang.String>) strSet8);
        java.lang.Class<?> wildcardClass12 = strSet8.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, 0, (int) (short) 0);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-000:00:00:00.001" + "'", str7, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-000:00:00:00.001" + "'", str10, "-000:00:00:00.001");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("100", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.hadoop.conf.Configuration configuration2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration2, "", "-000:00:00:00.001", strArray5);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray5);
        java.lang.String str8 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray5);
        java.io.PrintStream printStream10 = null;
        boolean boolean12 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray5, "000:00:00:00.052", printStream10, true);
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray5);
        java.io.PrintStream printStream15 = null;
        boolean boolean17 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray5, "\000\000", printStream15, false);
        java.lang.String str18 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.String[] strArray10 = new java.lang.String[] { "0" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) (byte) 0, false, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, 1L, false, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator15 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (byte) 100, true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo16 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = staleAndSlowComparator15.compare(datanodeInfo16, datanodeInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress4 = org.apache.hadoop.hdfs.DFSUtil.getBindAddress(configuration0, "000:00:00:00.010", "0", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("000:00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("100", "class org.apache.commons.cli.Options");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("1", configuration1, "000:00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:000:00:00:00.052");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        org.apache.hadoop.conf.Configuration configuration3 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration3, "", "-000:00:00:00.001", strArray6);
        java.lang.String str8 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray6);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration0, "", "", strArray6);
        java.lang.Class<?> wildcardClass10 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "", "000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator10 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '#', false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet8);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.cli.Options options0 = org.apache.hadoop.hdfs.DFSUtil.helpOptions;
        java.lang.Class<?> wildcardClass1 = options0.getClass();
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) wildcardClass1);
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) wildcardClass1);
        org.junit.Assert.assertNotNull(options0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class org.apache.commons.cli.Options" + "'", str2, "class org.apache.commons.cli.Options");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class org.apache.commons.cli.Options" + "'", str3, "class org.apache.commons.cli.Options");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.hadoop.conf.Configuration configuration2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration2, "", "-000:00:00:00.001", strArray5);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray5);
        java.lang.String str8 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray5);
        java.io.PrintStream printStream10 = null;
        boolean boolean12 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray5, "000:00:00:00.052", printStream10, true);
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray5);
        java.io.PrintStream printStream15 = null;
        boolean boolean17 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray5, "000:00:00:00.001", printStream15, false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        byte[][] byteArray6 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 10);
        byte[][] byteArray8 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 1);
        java.lang.String str9 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray8, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [offset, range, size] [1, 98, 1]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-000:00:00:00.001" + "'", str9, "-000:00:00:00.001");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.lang.String[] strArray7 = new java.lang.String[] { "0" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator10 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) (byte) 0, false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator11 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, 1L, false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator12 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator13 = staleAndSlowComparator11.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator12);
        java.lang.Class<?> wildcardClass14 = serviceComparator12.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI2 = org.apache.hadoop.hdfs.DFSUtil.createUri("class org.apache.commons.cli.Options", inetSocketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.EnumSet<org.apache.hadoop.hdfs.protocol.HdfsFileStatus.Flags> flagsSet4 = org.apache.hadoop.hdfs.DFSUtil.getFlags(true, true, true, true);
        org.junit.Assert.assertNotNull(flagsSet4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "class org.apache.commons.cli.Options", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetSocketAddress inetSocketAddress4 = org.apache.hadoop.hdfs.DFSUtil.getBindAddress(configuration0, "1", "class org.apache.commons.cli.Options", "class org.apache.commons.cli.Options");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2, (int) '4', (-1));
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000" + "'", str3, "\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000" + "'", str4, "\000\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000" + "'", str7, "\000\000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000" + "'", str10, "\000\000");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo15 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = staleAndSlowComparator14.compare(datanodeInfo15, datanodeInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "000:00:00:00.001", "000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidNameForComponent("000:00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator29 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet27);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator30 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = staleAndSlowComparator29.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator30);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = serviceComparator30.reversed();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator40 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet38);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator41 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = staleAndSlowComparator40.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator41);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator32.thenComparing(datanodeInfoComparator42);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator44 = datanodeInfoComparator20.thenComparing(datanodeInfoComparator32);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator52 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet50);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator53 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator54 = staleAndSlowComparator52.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator53);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator55 = serviceComparator53.reversed();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator63 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet61);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator64 = datanodeInfoComparator55.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator63);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator65 = datanodeInfoComparator44.thenComparing(datanodeInfoComparator64);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator76 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet74);
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet82 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet82, strArray81);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator84 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet82);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator85 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator86 = staleAndSlowComparator84.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator85);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator87 = staleAndSlowComparator84.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator88 = staleAndSlowComparator76.thenComparing(datanodeInfoComparator87);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator89 = datanodeInfoComparator65.thenComparing(datanodeInfoComparator88);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(datanodeInfoComparator44);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator54);
        org.junit.Assert.assertNotNull(datanodeInfoComparator55);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator64);
        org.junit.Assert.assertNotNull(datanodeInfoComparator65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator86);
        org.junit.Assert.assertNotNull(datanodeInfoComparator87);
        org.junit.Assert.assertNotNull(datanodeInfoComparator88);
        org.junit.Assert.assertNotNull(datanodeInfoComparator89);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of hi!: hi is not a number");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.util.EnumSet<org.apache.hadoop.hdfs.protocol.HdfsFileStatus.Flags> flagsSet4 = org.apache.hadoop.hdfs.DFSUtil.getFlags(false, false, true, false);
        org.junit.Assert.assertNotNull(flagsSet4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.net.InetSocketAddress inetSocketAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI2 = org.apache.hadoop.hdfs.DFSUtil.createUri("000:00:00:00.052", inetSocketAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("0");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[48]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.hadoop.hdfs.server.datanode.metrics.DataNodeMetrics dataNodeMetrics0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.hdfs.DFSUtil.addTransferRateMetric(dataNodeMetrics0, (long) 10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.String[] strArray1 = new java.lang.String[] { "100" };
        java.io.PrintStream printStream3 = null;
        boolean boolean5 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray1, "class org.apache.commons.cli.Options", printStream3, false);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        org.apache.hadoop.conf.Configuration configuration3 = null;
        org.apache.hadoop.conf.Configuration configuration6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration6, "", "-000:00:00:00.001", strArray9);
        java.lang.String str11 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray9);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration3, "", "", strArray9);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration0, "1", "100", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.durationToString(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000:00:00:00.000" + "'", str1, "000:00:00:00.000");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator29 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet27);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator30 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = staleAndSlowComparator29.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator30);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = serviceComparator30.reversed();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator40 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet38);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator41 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = staleAndSlowComparator40.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator41);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator32.thenComparing(datanodeInfoComparator42);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator44 = datanodeInfoComparator20.thenComparing(datanodeInfoComparator32);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator52 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet50);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator53 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator54 = staleAndSlowComparator52.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator53);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator55 = serviceComparator53.reversed();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator63 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet61);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator64 = datanodeInfoComparator55.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator63);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator65 = datanodeInfoComparator44.thenComparing(datanodeInfoComparator64);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator73 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet71);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator74 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator75 = staleAndSlowComparator73.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator74);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator76 = serviceComparator74.reversed();
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet82 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet82, strArray81);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator84 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet82);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator85 = datanodeInfoComparator76.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator84);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator86 = datanodeInfoComparator64.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator84);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(datanodeInfoComparator44);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator54);
        org.junit.Assert.assertNotNull(datanodeInfoComparator55);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator64);
        org.junit.Assert.assertNotNull(datanodeInfoComparator65);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator75);
        org.junit.Assert.assertNotNull(datanodeInfoComparator76);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator85);
        org.junit.Assert.assertNotNull(datanodeInfoComparator86);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator11 = datanodeInfoComparator10.reversed();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator19 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet17);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator20 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = staleAndSlowComparator19.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator20);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator22 = serviceComparator20.reversed();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator30 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet28);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = datanodeInfoComparator22.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator30);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator39 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet37);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator40 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator41 = staleAndSlowComparator39.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator40);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = serviceComparator40.reversed();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator50 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet48);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator51 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator52 = staleAndSlowComparator50.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator51);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator53 = staleAndSlowComparator50.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator54 = datanodeInfoComparator42.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator50);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator55 = datanodeInfoComparator31.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator50);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator56 = datanodeInfoComparator11.thenComparing(datanodeInfoComparator55);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(datanodeInfoComparator11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(datanodeInfoComparator22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator41);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator52);
        org.junit.Assert.assertNotNull(datanodeInfoComparator53);
        org.junit.Assert.assertNotNull(datanodeInfoComparator54);
        org.junit.Assert.assertNotNull(datanodeInfoComparator55);
        org.junit.Assert.assertNotNull(datanodeInfoComparator56);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "000:00:00:00.052", "class org.apache.commons.cli.Options", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("1");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "000:00:00:00.052", "class org.apache.commons.cli.Options");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "000:00:00:00.052", "-000:00:00:00.001", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator16 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator17 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', true, (java.util.Set<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 0, false, (java.util.Set<java.lang.String>) strSet14);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("000:00:00:00.010", "\000\000", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 000:00:00:00.010://??:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "000:00:00:00.010", "class org.apache.commons.cli.Options", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("class org.apache.commons.cli.Options");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[99, 108, 97, 115, 115, 32, 111, 114, 103, 46, 97, 112, 97, 99, 104, 101, 46, 99, 111, 109, 109, 111, 110, 115, 46, 99, 108, 105, 46, 79, 112, 116, 105, 111, 110, 115]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class org.apache.commons.cli.Options" + "'", str2, "class org.apache.commons.cli.Options");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        byte[][] byteArray6 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray6, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [offset, range, size] [1, 33, 1]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("", configuration1, "000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:000:00:00:00.001");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.durationToString((long) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000:00:00:00.010" + "'", str1, "000:00:00:00.010");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        org.apache.hadoop.conf.Configuration configuration3 = null;
        org.apache.hadoop.conf.Configuration configuration6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.hadoop.conf.Configuration configuration8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration8, "", "-000:00:00:00.001", strArray11);
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray11);
        java.lang.String str14 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration6, inetSocketAddress7, strArray11);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration3, "100", "-000:00:00:00.001", strArray11);
        java.lang.String str16 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray11);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration0, "class org.apache.commons.cli.Options", "0", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("100");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        byte[][] byteArray4 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 0);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, 1, (int) ' ');
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "000:00:00:00.001", "0", "000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2, (int) (short) 100, (int) (byte) 100);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2, 1, (int) (short) 1);
        java.lang.String str11 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000" + "'", str3, "\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000" + "'", str4, "\000\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000" + "'", str7, "\000\000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000" + "'", str10, "\000\000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000" + "'", str11, "\000\000");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("000:00:00:00.010", "\000\000", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 000:00:00:00.010://??:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("1", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("000:00:00:00.000", "100", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 000:00:00:00.000://100:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidNameForComponent("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "1", "class org.apache.commons.cli.Options");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("-000:00:00:00.001", configuration1, "class org.apache.commons.cli.Options");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:class org.apache.commons.cli.Options");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "", "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet11);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator15 = staleAndSlowComparator14.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator16 = datanodeInfoComparator15.reversed();
        java.lang.String[] strArray24 = new java.lang.String[] { "0" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator27 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) (byte) 0, false, (java.util.Set<java.lang.String>) strSet25);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator28 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, 1L, false, (java.util.Set<java.lang.String>) strSet25);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator29 = datanodeInfoComparator15.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator28);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator15);
        org.junit.Assert.assertNotNull(datanodeInfoComparator16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator29);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator29 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet27);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator30 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = staleAndSlowComparator29.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator30);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = serviceComparator30.reversed();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator40 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet38);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator41 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = staleAndSlowComparator40.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator41);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator32.thenComparing(datanodeInfoComparator42);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator44 = datanodeInfoComparator20.thenComparing(datanodeInfoComparator32);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator45 = datanodeInfoComparator32.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator46 = datanodeInfoComparator45.reversed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(datanodeInfoComparator44);
        org.junit.Assert.assertNotNull(datanodeInfoComparator45);
        org.junit.Assert.assertNotNull(datanodeInfoComparator46);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator0 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator8 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet6);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator9 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = staleAndSlowComparator8.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator9);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator11 = staleAndSlowComparator8.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator12 = serviceComparator0.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator8);
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) staleAndSlowComparator8);
        java.lang.String str14 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) str13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(datanodeInfoComparator11);
        org.junit.Assert.assertNotNull(datanodeInfoComparator12);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo15 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = staleAndSlowComparator14.compare(datanodeInfo15, datanodeInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("000:00:00:00.010", "000:00:00:00.001", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: 000:00:00:00.010://[000:00:00:00.001]:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet11);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator15 = staleAndSlowComparator14.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator16 = datanodeInfoComparator15.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator17 = datanodeInfoComparator15.reversed();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator15);
        org.junit.Assert.assertNotNull(datanodeInfoComparator16);
        org.junit.Assert.assertNotNull(datanodeInfoComparator17);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2, (int) (short) 100, (int) (byte) 100);
        java.lang.String str8 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000" + "'", str3, "\000\000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000" + "'", str4, "\000\000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000" + "'", str7, "\000\000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000" + "'", str8, "\000\000");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (byte) 1, (-1));
        byte[][] byteArray9 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-000:00:00:00.001" + "'", str7, "-000:00:00:00.001");
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("class org.apache.commons.cli.Options");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of class org.apache.commons.cli.Options: class org.apache.commons.cli.Option is not a number");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB((long) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB((long) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.EnumSet<org.apache.hadoop.hdfs.protocol.HdfsFileStatus.Flags> flagsSet4 = org.apache.hadoop.hdfs.DFSUtil.getFlags(true, true, true, false);
        org.junit.Assert.assertNotNull(flagsSet4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        byte[][] byteArray0 = new byte[][] {};
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (short) 1, (int) (short) 10);
        java.lang.String str6 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, 0, (int) (byte) 100);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0);
        java.lang.String str8 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.durationToString((long) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000:00:00:00.001" + "'", str1, "000:00:00:00.001");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidNameForComponent("000:00:00:00.000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidNameForComponent("class org.apache.commons.cli.Options");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (short) 1, (int) (short) 10);
        java.lang.String str6 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, 0, (int) (byte) 100);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (byte) 0, (int) ' ');
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (byte) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray16 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray0, (int) (short) -1, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [len, size] [-1, 0]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("100");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "000:00:00:00.052", "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "000:00:00:00.052", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator0 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator8 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet6);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator9 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = staleAndSlowComparator8.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator9);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator11 = staleAndSlowComparator8.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator12 = serviceComparator0.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator8);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator26 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet24);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator27 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet24);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator28 = staleAndSlowComparator27.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator29 = datanodeInfoComparator28.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator30 = serviceComparator0.thenComparing(datanodeInfoComparator29);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(datanodeInfoComparator11);
        org.junit.Assert.assertNotNull(datanodeInfoComparator12);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator28);
        org.junit.Assert.assertNotNull(datanodeInfoComparator29);
        org.junit.Assert.assertNotNull(datanodeInfoComparator30);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isValidName("000:00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.String[] strArray10 = new java.lang.String[] { "000:00:00:00.052", "100", "100", "000:00:00:00.052", "000:00:00:00.010", "-000:00:00:00.001", "100" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) ' ', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo14 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = staleAndSlowComparator13.compare(datanodeInfo14, datanodeInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("hi!", configuration1, "class org.apache.commons.cli.Options");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:class org.apache.commons.cli.Options");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("0", configuration1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "000:00:00:00.001", "000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.hadoop.conf.Configuration configuration2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.hadoop.conf.Configuration configuration4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.hadoop.conf.Configuration configuration6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration6, "", "-000:00:00:00.001", strArray9);
        java.lang.String str11 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray9);
        java.lang.String str12 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration4, inetSocketAddress5, strArray9);
        java.io.PrintStream printStream14 = null;
        boolean boolean16 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray9, "000:00:00:00.052", printStream14, true);
        java.lang.String str17 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration2, inetSocketAddress3, strArray9);
        java.lang.String str18 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray9);
        java.lang.String str19 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray9);
        java.io.PrintStream printStream21 = null;
        boolean boolean23 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray9, "100", printStream21, false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.util.Set<java.lang.String> strSet3 = null;
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator4 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', false, strSet3);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo5 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = staleAndSlowComparator4.compare(datanodeInfo5, datanodeInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) "\000\000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\000\000" + "'", str1, "\000\000");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (short) 1, (int) (short) 10);
        java.lang.String str6 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, 0, 10);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0);
        byte[][] byteArray9 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray0, (byte) 100);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("\000\000");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray1, (int) (short) 0, (int) (short) 1);
        java.lang.String str5 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000" + "'", str4, "\000\000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000" + "'", str5, "\000\000");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray7 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (int) '#', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Incorrect index [len, size] [35, 17]");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator19 = datanodeInfoComparator10.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator18);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator27 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet25);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator28 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator29 = staleAndSlowComparator27.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator28);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator30 = serviceComparator28.reversed();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator38 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet36);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator39 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator40 = staleAndSlowComparator38.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator39);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator41 = staleAndSlowComparator38.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = datanodeInfoComparator30.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator38);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator19.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator38);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo44 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = staleAndSlowComparator38.compare(datanodeInfo44, datanodeInfo45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator29);
        org.junit.Assert.assertNotNull(datanodeInfoComparator30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator40);
        org.junit.Assert.assertNotNull(datanodeInfoComparator41);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.lang.String[] strArray7 = new java.lang.String[] { "0" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator10 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) (byte) 0, false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator11 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, 1L, false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator12 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator13 = staleAndSlowComparator11.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator12);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator21 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet19);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator22 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator23 = staleAndSlowComparator21.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator22);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator24 = serviceComparator22.reversed();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator32 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet30);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator33 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator34 = staleAndSlowComparator32.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator33);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator35 = datanodeInfoComparator24.thenComparing(datanodeInfoComparator34);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator43 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet41);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator44 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator45 = staleAndSlowComparator43.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator44);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator46 = serviceComparator44.reversed();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator54 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet52);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator55 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator56 = staleAndSlowComparator54.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator55);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator57 = datanodeInfoComparator46.thenComparing(datanodeInfoComparator56);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator58 = datanodeInfoComparator34.thenComparing(datanodeInfoComparator46);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator69 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet67);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator70 = datanodeInfoComparator34.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator69);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator71 = datanodeInfoComparator13.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator69);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator23);
        org.junit.Assert.assertNotNull(datanodeInfoComparator24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator34);
        org.junit.Assert.assertNotNull(datanodeInfoComparator35);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator45);
        org.junit.Assert.assertNotNull(datanodeInfoComparator46);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator56);
        org.junit.Assert.assertNotNull(datanodeInfoComparator57);
        org.junit.Assert.assertNotNull(datanodeInfoComparator58);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator70);
        org.junit.Assert.assertNotNull(datanodeInfoComparator71);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("000:00:00:00.010", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "hi!", "000:00:00:00.010", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.createUri("-000:00:00:00.001", "-000:00:00:00.001", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: -000:00:00:00.001://[-000:00:00:00.001]:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet5);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) strSet5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("100");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        byte[][] byteArray4 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 0);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, 1, (int) ' ');
        byte[][] byteArray10 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, 1, (byte) 100);
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of 000:00:00:00.010: 000:00:00:00.01 is not a number");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("hi!");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, 100, (int) '#');
        byte[][] byteArray6 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[104, 105, 33]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(byteArray6);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        byte[][] byteArray6 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 10);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray6);
        java.lang.String str8 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray6);
        java.lang.String str9 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray6);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-000:00:00:00.001" + "'", str7, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-000:00:00:00.001" + "'", str8, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-000:00:00:00.001" + "'", str9, "-000:00:00:00.001");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (short) 1, (int) (short) 10);
        java.lang.String str6 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, 0, (int) (byte) 100);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (byte) 0, (int) ' ');
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo8 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = staleAndSlowComparator7.compare(datanodeInfo8, datanodeInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.lang.String[] strArray13 = new java.lang.String[] { "0" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator16 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) (byte) 0, false, (java.util.Set<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator17 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, 1L, false, (java.util.Set<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (byte) 100, true, (java.util.Set<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator21 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) (byte) 100, true, (java.util.Set<java.lang.String>) strSet14);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.hadoop.conf.Configuration configuration2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.hadoop.conf.Configuration configuration4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.hadoop.conf.Configuration configuration6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration6, "", "-000:00:00:00.001", strArray9);
        java.lang.String str11 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray9);
        java.lang.String str12 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration4, inetSocketAddress5, strArray9);
        java.io.PrintStream printStream14 = null;
        boolean boolean16 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray9, "000:00:00:00.052", printStream14, true);
        java.lang.String str17 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration2, inetSocketAddress3, strArray9);
        java.lang.String str18 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray9);
        java.lang.String str19 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) strArray9);
        java.lang.String str20 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray9);
        java.lang.String str21 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        org.apache.hadoop.conf.Configuration configuration3 = null;
        org.apache.hadoop.conf.Configuration configuration6 = null;
        java.net.InetSocketAddress inetSocketAddress7 = null;
        org.apache.hadoop.conf.Configuration configuration8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration8, "", "-000:00:00:00.001", strArray11);
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray11);
        java.lang.String str14 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration6, inetSocketAddress7, strArray11);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration3, "100", "-000:00:00:00.001", strArray11);
        java.lang.String str16 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray11);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration0, "hi!", "[hi!]", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        org.apache.hadoop.conf.Configuration configuration3 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        org.apache.hadoop.conf.Configuration configuration5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration5, "", "-000:00:00:00.001", strArray8);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray8);
        java.lang.String str11 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration3, inetSocketAddress4, strArray8);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration0, "100", "-000:00:00:00.001", strArray8);
        java.io.PrintStream printStream14 = null;
        boolean boolean16 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray8, "000:00:00:00.000", printStream14, true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("0");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("\000\000");
        byte[][] byteArray3 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray3);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("[hi!]", "\000\000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "000:00:00:00.052", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB((long) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        int int1 = org.apache.hadoop.hdfs.DFSUtil.roundBytesToGB((long) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "-000:00:00:00.001", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("000:00:00:00.052", configuration1, "-000:00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:-000:00:00:00.001");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("000:00:00:00.052", configuration1, "000:00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:000:00:00:00.052");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        org.apache.hadoop.conf.Configuration configuration3 = null;
        java.net.InetSocketAddress inetSocketAddress4 = null;
        org.apache.hadoop.conf.Configuration configuration5 = null;
        java.net.InetSocketAddress inetSocketAddress6 = null;
        org.apache.hadoop.conf.Configuration configuration7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration7, "", "-000:00:00:00.001", strArray10);
        java.lang.String str12 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray10);
        java.lang.String str13 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration5, inetSocketAddress6, strArray10);
        java.io.PrintStream printStream15 = null;
        boolean boolean17 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray10, "000:00:00:00.052", printStream15, true);
        java.lang.String str18 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration3, inetSocketAddress4, strArray10);
        java.lang.String str19 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray10);
        java.lang.String str20 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) strArray10);
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration0, "000:00:00:00.001", "000:00:00:00.000", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (short) 1, (int) (short) 10);
        java.lang.String str6 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, 0, 10);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0);
        byte[][] byteArray9 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray0, (byte) 100);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray9);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getRpcAddressesForNameserviceId(configuration0, "/", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        byte[][] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.byteArray2PathString(byteArray0, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        java.net.InetSocketAddress inetSocketAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.http.HttpServer2.Builder builder6 = org.apache.hadoop.hdfs.DFSUtil.httpServerTemplateForNNAndJN(configuration0, inetSocketAddress1, inetSocketAddress2, "[hi!]", "0", "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator10 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = staleAndSlowComparator18.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator22 = staleAndSlowComparator10.thenComparing(datanodeInfoComparator21);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator23 = datanodeInfoComparator21.reversed();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(datanodeInfoComparator22);
        org.junit.Assert.assertNotNull(datanodeInfoComparator23);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("1");
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) wildcardClass2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [[B" + "'", str3, "class [[B");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator19 = datanodeInfoComparator10.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator18);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator27 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet25);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator28 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator29 = staleAndSlowComparator27.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator28);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator30 = serviceComparator28.reversed();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator38 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet36);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator39 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator40 = staleAndSlowComparator38.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator39);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator41 = staleAndSlowComparator38.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = datanodeInfoComparator30.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator38);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator19.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator38);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator51 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet49);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator52 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator53 = staleAndSlowComparator51.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator52);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator61 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet59);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator62 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator63 = staleAndSlowComparator61.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator62);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator64 = serviceComparator52.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator61);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator65 = datanodeInfoComparator19.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator52);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator29);
        org.junit.Assert.assertNotNull(datanodeInfoComparator30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator40);
        org.junit.Assert.assertNotNull(datanodeInfoComparator41);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator53);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator63);
        org.junit.Assert.assertNotNull(datanodeInfoComparator64);
        org.junit.Assert.assertNotNull(datanodeInfoComparator65);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("100");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        byte[][] byteArray4 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, (byte) 0);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, 1, (int) ' ');
        byte[][] byteArray10 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, 1, (byte) 100);
        java.lang.String str11 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        java.lang.String str12 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        boolean boolean1 = org.apache.hadoop.hdfs.DFSUtil.isReservedPathComponent("000:00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.net.InetSocketAddress> strMap3 = org.apache.hadoop.hdfs.DFSUtil.getWebAddressesForNameserviceId(configuration0, "0", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("100", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet11);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator15 = staleAndSlowComparator14.reversed();
        java.lang.Class<?> wildcardClass16 = datanodeInfoComparator15.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("[hi!]", "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        java.net.InetSocketAddress inetSocketAddress1 = null;
        org.apache.hadoop.conf.Configuration configuration2 = null;
        java.net.InetSocketAddress inetSocketAddress3 = null;
        org.apache.hadoop.conf.Configuration configuration4 = null;
        java.net.InetSocketAddress inetSocketAddress5 = null;
        org.apache.hadoop.conf.Configuration configuration6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.hadoop.hdfs.DFSUtil.setGenericConf(configuration6, "", "-000:00:00:00.001", strArray9);
        java.lang.String str11 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray9);
        java.lang.String str12 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration4, inetSocketAddress5, strArray9);
        java.io.PrintStream printStream14 = null;
        boolean boolean16 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray9, "000:00:00:00.052", printStream14, true);
        java.lang.String str17 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration2, inetSocketAddress3, strArray9);
        java.lang.String str18 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray9);
        java.lang.String str19 = org.apache.hadoop.hdfs.DFSUtil.getNameServiceIdFromAddress(configuration0, inetSocketAddress1, strArray9);
        java.io.PrintStream printStream21 = null;
        boolean boolean23 = org.apache.hadoop.hdfs.DFSUtil.parseHelpArgument(strArray9, "100", printStream21, true);
        java.lang.String str24 = org.apache.hadoop.hdfs.DFSUtil.strings2PathString(strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator15 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 1, true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet11);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "000:00:00:00.052", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.lang.String[] strArray13 = new java.lang.String[] { "000:00:00:00.052", "100", "100", "000:00:00:00.052", "000:00:00:00.010", "-000:00:00:00.001", "100" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator16 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) ' ', true, (java.util.Set<java.lang.String>) strSet14);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator17 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet14);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("100");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        byte[][] byteArray5 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray1, 0, (byte) 10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49, 48, 48]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
        org.junit.Assert.assertNotNull(byteArray5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServerWithDefaultHost("\000\000", configuration1, "000:00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:000:00:00:00.010");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServer(inetSocketAddress0, configuration1, "000:00:00:00.052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:000:00:00:00.052");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet11);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator15 = staleAndSlowComparator14.reversed();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator29 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet27);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator30 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet27);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = staleAndSlowComparator30.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = staleAndSlowComparator14.thenComparing(datanodeInfoComparator31);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator33 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator34 = datanodeInfoComparator32.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator33);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator15);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(datanodeInfoComparator34);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServer(inetSocketAddress0, configuration1, "[hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:[hi!]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = staleAndSlowComparator18.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator22 = datanodeInfoComparator10.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) staleAndSlowComparator18);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator30 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet28);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator31 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = staleAndSlowComparator30.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator31);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator33 = serviceComparator31.reversed();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator41 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet39);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator42 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = staleAndSlowComparator41.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator42);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator44 = datanodeInfoComparator33.thenComparing(datanodeInfoComparator43);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator52 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet50);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator53 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator54 = staleAndSlowComparator52.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator53);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator55 = serviceComparator53.reversed();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator63 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet61);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator64 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator65 = staleAndSlowComparator63.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator64);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator66 = datanodeInfoComparator55.thenComparing(datanodeInfoComparator65);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator67 = datanodeInfoComparator43.thenComparing(datanodeInfoComparator55);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator68 = datanodeInfoComparator22.thenComparing(datanodeInfoComparator55);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator69 = datanodeInfoComparator55.reversed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(datanodeInfoComparator22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(datanodeInfoComparator33);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(datanodeInfoComparator44);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator54);
        org.junit.Assert.assertNotNull(datanodeInfoComparator55);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator65);
        org.junit.Assert.assertNotNull(datanodeInfoComparator66);
        org.junit.Assert.assertNotNull(datanodeInfoComparator67);
        org.junit.Assert.assertNotNull(datanodeInfoComparator68);
        org.junit.Assert.assertNotNull(datanodeInfoComparator69);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.net.InetSocketAddress inetSocketAddress0 = null;
        org.apache.hadoop.conf.Configuration configuration1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI3 = org.apache.hadoop.hdfs.DFSUtil.getInfoServer(inetSocketAddress0, configuration1, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid scheme:??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator10 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.assertAllResultsEqual((java.util.Collection<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '#', false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo14 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = staleAndSlowComparator13.compare(datanodeInfo14, datanodeInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("[hi!]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of [hi!]: [hi! is not a number");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.getSpnegoKeytabKey(configuration0, "false");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        boolean boolean2 = org.apache.hadoop.hdfs.DFSUtil.isParentEntry("/", "000:00:00:00.052");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("1");
        java.lang.String str2 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[49]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, (int) (short) 1, (int) (short) 10);
        java.lang.String str6 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray0, 0, 10);
        byte[][] byteArray8 = org.apache.hadoop.hdfs.DFSUtil.bytes2byteArray(byteArray0, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.hadoop.hdfs.DFSUtil.getNamenodeWebAddr(configuration0, "[hi!]", "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "\000\000", "100", "\000\000" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator13 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) 'a', true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator14 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(true, (long) (short) -1, true, (java.util.Set<java.lang.String>) strSet11);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo15 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = staleAndSlowComparator14.compare(datanodeInfo15, datanodeInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.lang.String str1 = org.apache.hadoop.hdfs.DFSUtil.path2String((java.lang.Object) "class [[B");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [[B" + "'", str1, "class [[B");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.hadoop.hdfs.DFSUtil.parseRelativeTime("false");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to parse relative time value of false: fals is not a number");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        byte[] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.string2Bytes("-000:00:00:00.001");
        java.lang.String str4 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (short) 10, 100);
        java.lang.String str7 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, 0, (int) (short) 0);
        java.lang.String str10 = org.apache.hadoop.hdfs.DFSUtil.bytes2String(byteArray1, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[45, 48, 48, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 49]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-000:00:00:00.001" + "'", str4, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-000:00:00:00.001" + "'", str7, "-000:00:00:00.001");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-000:00:00:00.001" + "'", str10, "-000:00:00:00.001");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.lang.String[] strArray7 = new java.lang.String[] { "0" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator10 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) (byte) 0, false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator11 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, 1L, false, (java.util.Set<java.lang.String>) strSet8);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator12 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator13 = staleAndSlowComparator11.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator12);
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo14 = null;
        org.apache.hadoop.hdfs.protocol.DatanodeInfo datanodeInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = staleAndSlowComparator11.compare(datanodeInfo14, datanodeInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator13);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        byte[][] byteArray1 = org.apache.hadoop.hdfs.DFSUtil.getPathComponents("class [[B");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator7 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet5);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator8 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator9 = staleAndSlowComparator7.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator8);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator10 = serviceComparator8.reversed();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator18 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet16);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator19 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator20 = staleAndSlowComparator18.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator19);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator21 = datanodeInfoComparator10.thenComparing(datanodeInfoComparator20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator29 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet27);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator30 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator31 = staleAndSlowComparator29.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator30);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator32 = serviceComparator30.reversed();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator staleAndSlowComparator40 = new org.apache.hadoop.hdfs.DFSUtil.StaleAndSlowComparator(false, (long) '4', false, (java.util.Set<java.lang.String>) strSet38);
        org.apache.hadoop.hdfs.DFSUtil.ServiceComparator serviceComparator41 = new org.apache.hadoop.hdfs.DFSUtil.ServiceComparator();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator42 = staleAndSlowComparator40.thenComparing((java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo>) serviceComparator41);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator43 = datanodeInfoComparator32.thenComparing(datanodeInfoComparator42);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator44 = datanodeInfoComparator20.thenComparing(datanodeInfoComparator32);
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator45 = datanodeInfoComparator20.reversed();
        java.util.Comparator<org.apache.hadoop.hdfs.protocol.DatanodeInfo> datanodeInfoComparator46 = datanodeInfoComparator45.reversed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator9);
        org.junit.Assert.assertNotNull(datanodeInfoComparator10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator20);
        org.junit.Assert.assertNotNull(datanodeInfoComparator21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator31);
        org.junit.Assert.assertNotNull(datanodeInfoComparator32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(datanodeInfoComparator42);
        org.junit.Assert.assertNotNull(datanodeInfoComparator43);
        org.junit.Assert.assertNotNull(datanodeInfoComparator44);
        org.junit.Assert.assertNotNull(datanodeInfoComparator45);
        org.junit.Assert.assertNotNull(datanodeInfoComparator46);
    }
}

