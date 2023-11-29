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
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.hdfs.nfs.nfs3.Nfs3Metrics nfs3Metrics2 = org.apache.hadoop.hdfs.nfs.nfs3.Nfs3Metrics.create(configuration0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.apache.hadoop.conf.Configuration configuration0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.hdfs.nfs.nfs3.Nfs3Metrics nfs3Metrics2 = org.apache.hadoop.hdfs.nfs.nfs3.Nfs3Metrics.create(configuration0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

