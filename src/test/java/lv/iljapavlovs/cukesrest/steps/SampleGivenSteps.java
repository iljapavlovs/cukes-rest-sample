package lv.iljapavlovs.cukesrest.steps;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lv.ctco.cukesrest.internal.AssertionFacade;
import lv.ctco.cukesrest.internal.HttpMethod;
import lv.ctco.cukesrest.internal.ResponseFacade;
import lv.ctco.cukesrest.internal.context.GlobalWorldFacade;

import java.util.Random;

import static lv.ctco.cukesrest.CukesOptions.BASE_URI;

@Singleton
public class SampleGivenSteps {
    @Inject
    ResponseFacade response;

    @Inject
    AssertionFacade assertionFacade;
    @Inject
    GlobalWorldFacade world;

    @Given("^let integer variable \"([^\"]*)\" be random of (\\d+) with step (\\d+)$")
    public void letIntegerVariableBeRandomOfWithStep(String varName, int randomOf, int step) {
        Random random = new Random();
        int value = random.nextInt(randomOf) + step;
        world.put(varName, Integer.toString(value));
    }

    @Given("^let variable \"([^\"]*)\" be equal to current timestamp$")
    public void letVariableBeEqualToCurrentTimestamp(String varName) {
        world.put(varName, Long.toString(System.currentTimeMillis()));
    }

    @Given("^the client should wait (\\d+) seconds$")
    public void theClientShouldWaitSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @When("^client performs my custom GET request on \"([^\"]*)\"$")
    public void theClientPerformsGETRequestOnVStoreInventory(String uriPath) throws Throwable {
        response.doRequest(HttpMethod.GET.name(), uriPath);
    }

}