package org.phoebus.applications.probe;

import org.phoebus.framework.annotation.ProviderFor;
import org.phoebus.framework.spi.Application;

@ProviderFor(Application.class)
public class Probe implements Application {

    public static final String Name = "Probe";

    public String getName() {
        return Name;
    }

    public void start() {
    }

    public void stop() {
    }

}