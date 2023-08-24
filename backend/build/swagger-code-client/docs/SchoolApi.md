# SchoolApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSchool**](SchoolApi.md#createSchool) | **POST** /api/school | Create a School
[**getAllSchools**](SchoolApi.md#getAllSchools) | **GET** /api/school/search | Gets list of Schools
[**getSchool**](SchoolApi.md#getSchool) | **GET** /api/school/{id} | Get School by id


<a name="createSchool"></a>
# **createSchool**
> SchoolDto createSchool(schoolDto)

Create a School

API for creating a new School

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.SchoolApi;


SchoolApi apiInstance = new SchoolApi();
SchoolDto schoolDto = new SchoolDto(); // SchoolDto | SchoolDto
try {
    SchoolDto result = apiInstance.createSchool(schoolDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchoolApi#createSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schoolDto** | [**SchoolDto**](SchoolDto.md)| SchoolDto |

### Return type

[**SchoolDto**](SchoolDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllSchools"></a>
# **getAllSchools**
> List&lt;SchoolDto&gt; getAllSchools()

Gets list of Schools

API for getting all Schools

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.SchoolApi;


SchoolApi apiInstance = new SchoolApi();
try {
    List<SchoolDto> result = apiInstance.getAllSchools();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchoolApi#getAllSchools");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SchoolDto&gt;**](SchoolDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchool"></a>
# **getSchool**
> SchoolDto getSchool(id)

Get School by id

API for getting School by id

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.SchoolApi;


SchoolApi apiInstance = new SchoolApi();
Long id = 789L; // Long | 
try {
    SchoolDto result = apiInstance.getSchool(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchoolApi#getSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**SchoolDto**](SchoolDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

