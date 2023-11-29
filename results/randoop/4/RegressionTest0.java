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
        org.apache.hadoop.fs.s3a.impl.ChangeDetectionPolicy changeDetectionPolicy1 = null;
        org.apache.hadoop.fs.s3a.statistics.ChangeTrackerStatistics changeTrackerStatistics2 = null;
        org.apache.hadoop.fs.s3a.S3ObjectAttributes s3ObjectAttributes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.s3a.impl.ChangeTracker changeTracker4 = new org.apache.hadoop.fs.s3a.impl.ChangeTracker("", changeDetectionPolicy1, changeTrackerStatistics2, s3ObjectAttributes3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The argument object is NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.String str0 = org.apache.hadoop.fs.s3a.impl.ChangeTracker.CHANGE_REPORTED_BY_S3;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Change reported by S3" + "'", str0, "Change reported by S3");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.apache.hadoop.fs.s3a.impl.ChangeDetectionPolicy changeDetectionPolicy1 = null;
        org.apache.hadoop.fs.s3a.statistics.ChangeTrackerStatistics changeTrackerStatistics2 = null;
        org.apache.hadoop.fs.s3a.S3ObjectAttributes s3ObjectAttributes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.s3a.impl.ChangeTracker changeTracker4 = new org.apache.hadoop.fs.s3a.impl.ChangeTracker("hi!", changeDetectionPolicy1, changeTrackerStatistics2, s3ObjectAttributes3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The argument object is NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.apache.hadoop.fs.s3a.impl.ChangeDetectionPolicy changeDetectionPolicy1 = null;
        org.apache.hadoop.fs.s3a.statistics.ChangeTrackerStatistics changeTrackerStatistics2 = null;
        org.apache.hadoop.fs.s3a.S3ObjectAttributes s3ObjectAttributes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.fs.s3a.impl.ChangeTracker changeTracker4 = new org.apache.hadoop.fs.s3a.impl.ChangeTracker("Change reported by S3", changeDetectionPolicy1, changeTrackerStatistics2, s3ObjectAttributes3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: The argument object is NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

