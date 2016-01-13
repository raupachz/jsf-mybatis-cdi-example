package de.foo.view;

import de.foo.service.TimeService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Example {

    @Inject
    private TimeService service;

    public String getNow() {
        return service.now();
    }

}
