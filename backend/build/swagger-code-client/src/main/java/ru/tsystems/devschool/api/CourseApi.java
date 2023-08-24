package ru.tsystems.devschool.api;

import ru.tsystems.devschool.invoker.ApiClient;

import ru.tsystems.devschool.model.CourseDto;
import ru.tsystems.devschool.model.ErrorDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-24T22:29:14.703+03:00")
@Component("ru.tsystems.devschool.api.CourseApi")
public class CourseApi {
    private ApiClient apiClient;

    public CourseApi() {
        this(new ApiClient());
    }

    @Autowired
    public CourseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a course
     * API for creating a new Course
     * <p><b>201</b> - Successfully created
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * @param courseDto CourseDto
     * @return CourseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CourseDto createCourse(CourseDto courseDto) throws RestClientException {
        Object postBody = courseDto;
        
        // verify the required parameter 'courseDto' is set
        if (courseDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'courseDto' when calling createCourse");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/course").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CourseDto> returnType = new ParameterizedTypeReference<CourseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets list of courses
     * API for getting all courses
     * <p><b>200</b> - Successfully get
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * @return List&lt;CourseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CourseDto> getAllCourses() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/course/search").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<CourseDto>> returnType = new ParameterizedTypeReference<List<CourseDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get course by id
     * API for getting course by id
     * <p><b>200</b> - Successfully found
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id The id parameter
     * @return CourseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CourseDto getCourse(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getCourse");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/course/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CourseDto> returnType = new ParameterizedTypeReference<CourseDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
