package edu.upc.eetac.dsa.talker;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Sergi1 on 26/10/2015.
 */
public class TalkerResourceConfig extends ResourceConfig {
    public TalkerResourceConfig() {
        packages("edu.upc.eetac.dsa.talker");
    }
}
