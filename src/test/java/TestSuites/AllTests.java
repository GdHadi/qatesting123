package TestSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.qatesting123.test.AdminPage_test;
import com.qatesting123.test.LoginPage_test;
import com.qatesting123.test.PostPage_test;

@RunWith(Suite.class)
@SuiteClasses({
	AdminPage_test.class,
	LoginPage_test.class,
	PostPage_test.class,	
})
public class AllTests {

}
