package ru.tsystems.devschool.api;

import ru.tsystems.devschool.invoker.ApiClient;

import ru.tsystems.devschool.model.ErrorDto;
import ru.tsystems.devschool.model.MentorDto;

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
@Component("ru.tsystems.devschool.api.MentorApi")
public class MentorApi {
    private ApiClient apiClient;

    public MentorApi() {
        this(new ApiClient());
    }

    @Autowired
    public MentorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Mentor
     * API for creating a new Mentor
     * <p><b>201</b> - Successfully created
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * @param mentorDto MentorDto
     * @return MentorDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MentorDto createMentor(MentorDto mentorDto) throws RestClientException {
        Object postBody = mentorDto;
        
        // verify the required parameter 'mentorDto' is set
        if (mentorDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mentorDto' when calling createMentor");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/mentor").build().toUriString();
        
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

        ParameterizedTypeReference<MentorDto> returnType = new ParameterizedTypeReference<MentorDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets list of Mentors
     * API for getting all Mentors
     * <p><b>200</b> - Successfully get
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * @return List&lt;MentorDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MentorDto> getAllMentors() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/api/mentor/search").build().toUriString();
        
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

        ParameterizedTypeReference<List<MentorDto>> returnType = new ParameterizedTypeReference<List<MentorDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Mentor by id
     * API for getting Mentor by id
     * <p><b>200</b> - Successfully found
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id The id parameter
     * @return MentorDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MentorDto getMentor(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getMentor");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/mentor/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<MentorDto> returnType = new ParameterizedTypeReference<MentorDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
