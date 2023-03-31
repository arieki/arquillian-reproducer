package com.example.arquillianreproducer;


import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URI;

public class HelloIT extends Arquillian {

    @ArquillianResource
    protected URI baseUri;

    @Deployment
    public static WebArchive createDeployment() {
        WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war")
                .addClass(HelloApplication.class)
                .addClass(HelloResource.class);
        System.out.println(war.toString(true));
        return war;
    }

    @Test
    public void testRequestEndpoint() {
        var response = ClientBuilder.newClient().target(baseUri).path("api").path("hello-world").request().get();
        Assert.assertEquals(200, response.getStatus());
    }
}
