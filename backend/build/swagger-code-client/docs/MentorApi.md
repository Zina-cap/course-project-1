# MentorApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMentor**](MentorApi.md#createMentor) | **POST** /api/mentor | Create a Mentor
[**getAllMentors**](MentorApi.md#getAllMentors) | **GET** /api/mentor/search | Gets list of Mentors
[**getMentor**](MentorApi.md#getMentor) | **GET** /api/mentor/{id} | Get Mentor by id


<a name="createMentor"></a>
# **createMentor**
> MentorDto createMentor(mentorDto)

Create a Mentor

API for creating a new Mentor

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.MentorApi;


MentorApi apiInstance = new MentorApi();
MentorDto mentorDto = new MentorDto(); // MentorDto | MentorDto
try {
    MentorDto result = apiInstance.createMentor(mentorDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MentorApi#createMentor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mentorDto** | [**MentorDto**](MentorDto.md)| MentorDto |

### Return type

[**MentorDto**](MentorDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllMentors"></a>
# **getAllMentors**
> List&lt;MentorDto&gt; getAllMentors()

Gets list of Mentors

API for getting all Mentors

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.MentorApi;


MentorApi apiInstance = new MentorApi();
try {
    List<MentorDto> result = apiInstance.getAllMentors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MentorApi#getAllMentors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MentorDto&gt;**](MentorDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMentor"></a>
# **getMentor**
> MentorDto getMentor(id)

Get Mentor by id

API for getting Mentor by id

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.MentorApi;


MentorApi apiInstance = new MentorApi();
Long id = 789L; // Long | 
try {
    MentorDto result = apiInstance.getMentor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MentorApi#getMentor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**MentorDto**](MentorDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

