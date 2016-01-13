package de.foo.service;

import de.foo.data.TimeMapper;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;

@RequestScoped
public class TimeService {

    @Inject
    @Mapper
    private TimeMapper timeMapper;
    
    public String now() {
        return timeMapper.now();
    }

}
