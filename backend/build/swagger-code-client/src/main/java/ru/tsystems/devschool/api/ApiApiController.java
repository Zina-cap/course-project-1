package ru.tsystems.devschool.api;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-24T22:29:15.694+03:00")

@Controller
public class ApiApiController implements ApiApi {

    private final ApiApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ApiApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public ApiApiDelegate getDelegate() {
        return delegate;
    }
}
