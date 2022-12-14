package test;

import akademikerne.domain.table.Titler;
import org.junit.*;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * The purpose of this test is to test that the classes for each table in the database has
 * the same column names as the tables in the database.
 */
public class Test_generel_brug_af_table_controllers {


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




   /** @Test
    public void test_afdelinger() {

        String url = TestUtil.BASIS_URL + TestUtil.AFDELINGER_URL;
        System.out.println("applied url: " + url);

        // checking number of records in database
        List<Afdelinger> afdelinger1 = restTemplate.getForObject(url,  List.class);
        int number_of_records = afdelinger1.size();
        System.out.println("Antallet af records: " + number_of_records);

        // creating a record
        Afdelinger afdeling_1 = new Afdelinger();
        String afdelingsnavn = "TotalSv";
        afdeling_1.setAfdelingsnavn(afdelingsnavn);
        String oprettetaf = "Stein Baggger halli hallo";
        afdeling_1.setOprettetaf(oprettetaf);
        afdeling_1.setAfdelingsnavn("Rengøring");
        afdeling_1.setAfsluttetaf("");
        afdeling_1.setRettetaf("");
        afdeling_1.setOprettetdato(new Date(System.currentTimeMillis()));

        // Create the request body by wrapping
        // the object in HttpEntity
        HttpEntity<Afdelinger> request = new HttpEntity<Afdelinger>(afdeling_1);

        // Send the request body in HttpEntity for HTTP POST request
        Afdelinger afdeling_stored = restTemplate
                .postForObject(url, request, Afdelinger.class);
        int afdelingid = afdeling_stored.getAfdelingid();
        System.out.println("Id of stored record is: " + afdelingid);

        // checking number of records in database has increased by one
        List<Afdelinger> afdelinger2= restTemplate.getForObject(url,  List.class);
        int number_of_records2 = afdelinger2.size();
        System.out.println("Antallet af records: " + number_of_records2);
        Assert.assertEquals(number_of_records +1, number_of_records2 );

        // finding the stored record with stringsearch and checking that it is found
        String urlSearch = url + TestUtil.STRING_SEARCH_URL + "afdelingsNavn=&rettetAf=&oprettetAf=" + oprettetaf + "&Afsluttetaf=";
        System.out.println("The search string was: " + urlSearch);
        List<Afdelinger> afdelinger_search = restTemplate.getForObject(urlSearch,  List.class);
        int number_of_records_search = afdelinger_search.size();
        System.out.println("Antallet af records in search: " + number_of_records_search);
        Assert.assertTrue(number_of_records_search>0);


        // Checking that stored record can be found with id search
        String urlSearch2 = url + "/" + afdelingid;
        System.out.println("searchstring with id is: " + urlSearch2);
        Afdelinger afdeling2_search = restTemplate.getForObject(urlSearch2,  Afdelinger.class);
        Assert.assertTrue(afdeling2_search.equals(afdeling_stored));

        // Checking that the record can be updated without saving a new record because
        // id is not null
        String rettetaf = "finanstilsynet";
        afdeling2_search.setRettetaf(rettetaf);
        afdeling2_search.setRettetdato(new Date(System.currentTimeMillis()));
        HttpEntity<Afdelinger> request2 = new HttpEntity<Afdelinger>(afdeling2_search);
        Afdelinger afdeling_stored5 = restTemplate
                .postForObject(url, request2, Afdelinger.class);
        int afdelingid5 = afdeling_stored5.getAfdelingid();
        System.out.println("Id of updated record is: " + afdelingid5);
        System.out.println("Rettet af: " + afdeling_stored5.getRettetaf());
        Assert.assertEquals(afdelingid5, afdelingid); // testing updated record is unchanged
        Assert.assertEquals(rettetaf,afdeling_stored5.getRettetaf()); // testing updating is correct

        // Deleting the inserted record and checking it is has been deleted
        String url_delete = TestUtil.BASIS_URL + TestUtil.AFDELINGER_URL + "/" +afdelingid5;
        System.out.println("delete url: " + url_delete);
        restTemplate.delete(url_delete);
        List<Afdelinger> afdelinger11 = restTemplate.getForObject(url,  List.class);
        int number_of_records11 = afdelinger11.size();
        System.out.println("antallet af records i database: " + number_of_records11);
        Assert.assertEquals(number_of_records, number_of_records11);

    }**/

    @Test
    public void test_titel() {

        String url = TestUtil.BASIS_URL + TestUtil.TITLER_URL;
        System.out.println("applied url: " + url);

        // checking number of 
        // in database
        List<Titler> titler1 = restTemplate.getForObject(url,  List.class);
        int number_of_records = titler1.size();
        System.out.println("Antallet af records: " + number_of_records);

        // creating a record
        Titler titel_1 = new Titler();
        String titelnavn = "System Ansvarlig";
        titel_1.setTitelnavn(titelnavn);

        // Create the request body by wrapping
        // the object in HttpEntity
        HttpEntity<Titler> request = new HttpEntity<Titler>(titel_1);

        // Send the request body in HttpEntity for HTTP POST request
        Titler titel_stored = restTemplate                
                .postForObject(url, request, Titler.class);
        int titelid = titel_stored.getTitelid();
        System.out.println("Id of stored record is: " + titelid);

        // checking number of records in database has increased by one
        List<Titler> titler2 = restTemplate.getForObject(url,  List.class);
        int number_of_records2 = titler2.size();
        System.out.println("Antallet af records: " + number_of_records2);
        Assert.assertEquals(number_of_records +1, number_of_records2 );

        // finding the stored record with stringsearch and checking that it is found
        String urlSearch = url + TestUtil.STRING_SEARCH_URL + "titelnavn=" + titelnavn ;
        System.out.println("The search string was: " + urlSearch);
        List<Titler> titler_search = restTemplate.getForObject(urlSearch,  List.class);
        int number_of_records_search = titler_search.size();
        System.out.println("Antallet af records in search: " + number_of_records_search);
        Assert.assertTrue(number_of_records_search>0);


        // Checking that stored record can be found with id search
        String urlSearch2 = url + "/" + titelid;
        System.out.println("searchstring with id is: " + urlSearch2);
        Titler titler2_search = restTemplate.getForObject(urlSearch2,  Titler.class);
        Assert.assertTrue(titler2_search.equals(titel_stored));

        // Checking that the record can be updated without saving a new record because
        // id is not null
        String titel = "assistent";
        titler2_search.setTitelnavn(titel);
        HttpEntity<Titler> request2 = new HttpEntity<Titler>(titler2_search);
        Titler afdeling_stored5 = restTemplate
                .postForObject(url, request2, Titler.class);
        int titelid5 = afdeling_stored5.getTitelid();
        System.out.println("Id of updated record is: " + titelid5);
        Assert.assertEquals(titelid5, titelid); // testing updated record is unchanged

        // Deleting the inserted record and checking it is has been deleted
        String url_delete = TestUtil.BASIS_URL + TestUtil.TITLER_URL + "/" +titelid5;
        System.out.println("delete url: " + url_delete);
        restTemplate.delete(url_delete);
        List<Titler> titler11 = restTemplate.getForObject(url,  List.class);
        int number_of_records11 = titler11.size();
        System.out.println("antallet af records i database: " + number_of_records11);
        Assert.assertEquals(number_of_records, number_of_records11);

    }

    @Ignore
    public void ignoreTest() {

        //System.out.println("in ignore test");
    }
}

