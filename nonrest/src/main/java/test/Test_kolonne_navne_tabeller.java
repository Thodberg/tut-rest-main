package test;

import akademikerne.domain.table.*;
import org.junit.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

/**
 * The purpose of this test is to test that the classes for each table in the database has
 * the same column names as the tables in the database.
 */
public class Test_kolonne_navne_tabeller {

    RestTemplate restTemplate = new RestTemplate();

    //execute before class
    @BeforeClass
    public static void beforeClass() {

        //System.out.println("in before class");
    }

    //execute after class
    @AfterClass
    public static void  afterClass() {

        //System.out.println("in after class");
    }

    //execute before test
    @Before
    public void before() {

        //System.out.println("in before");
    }

    //execute after test
    @After
    public void after() {

        //System.out.println("in after");
    }


    @Test
    public void test_url_findall_afdelinger() {
        String url = TestUtil.BASIS_URL + TestUtil.AFDELINGER_URL;
        System.out.println("applied url: " + url);
        List<Afdelinger> afdelinger =
                restTemplate.getForObject(url, List.class);
    }

    @Test
    public void test_url_findall_adminroller() {
        String url = TestUtil.BASIS_URL + TestUtil.ADMINROLLER_URL;
        System.out.println("applied url: " + url);
        List<Adminroller> adminroller =
                restTemplate.getForObject(url, List.class);
    }

    @Test
    public void test_url_findall_brugere() {
        String url = TestUtil.BASIS_URL + TestUtil.BRUGERE_URL;
        System.out.println("applied url: " + url);
        List<Brugere> brugere =
                restTemplate.getForObject(url, List.class);
    }

    @Test
    public void test_url_findall_rettighedstyper() {
        String url = TestUtil.BASIS_URL + TestUtil.RETTIGHEDS_TYPER_URL;
        System.out.println("applied url: " + url);
        List<Rettighedstyper> retighedstyper =
                restTemplate.getForObject(url, List.class);
    }    //test case ignore and will not execute


    @Test
    public void test_url_findall_rettighedstypesystembruger() {
        String url = TestUtil.BASIS_URL + TestUtil.RETTIGHEDS_TYPE_SYSTEM_BRUGER_URL;
        System.out.println("applied url: " + url);
        List<Rettighedstypesystembruger> rettighedstypesystembruger =
                restTemplate.getForObject(url, List.class);
    }

    @Test
    public void test_url_findall_rettighedstypesystem() {
        String url = TestUtil.BASIS_URL + TestUtil.RETTIGHEDS_TYPE_SYSTEM_URL;
        System.out.println("applied url: " + url);
        List<Rettighedstypesystem> rettighedstypesystem =
                restTemplate.getForObject(url, List.class);
    }

    @Test
    public void test_url_findall_rollerbruger() {
        String url = TestUtil.BASIS_URL + TestUtil.ROLLER_BRUGER_URL;
        System.out.println("applied url: " + url);
        List<Rollerbruger> rollerbruger =
                restTemplate.getForObject(url, List.class);
    }

    @Test
    public void test_url_findall_rollerbrugersystem() {
        String url = TestUtil.BASIS_URL + TestUtil.ROLLER_BRUGER_SYSTEM_URL;
        System.out.println("applied url: " + url);
        List<Rollerbrugersystem> rollerbrugersystem =
                restTemplate.getForObject(url, List.class);
    }

    @Test
    public void test_url_findall_system() {
        String url = TestUtil.BASIS_URL + TestUtil.ROLLER_BRUGER_SYSTEM_URL;
        System.out.println("applied url: " + url);
        List<System> system =
                restTemplate.getForObject(url, List.class);
    }

    @Test
    public void test_url_findall_titler() {
        String url = TestUtil.BASIS_URL + TestUtil.TITLER_URL;
        System.out.println("applied url: " + url);
        List<Titler> titler =
                restTemplate.getForObject(url, List.class);
    }


    @Ignore
    public void ignoreTest() {

        //System.out.println("in ignore test");
    }
}
