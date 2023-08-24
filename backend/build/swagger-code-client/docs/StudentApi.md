# StudentApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStudent**](StudentApi.md#createStudent) | **POST** /api/student | Create a Studen
[**getStudent**](StudentApi.md#getStudent) | **GET** /api/student/{id} | Get Student by id
[**getStudentsByCriteria**](StudentApi.md#getStudentsByCriteria) | **POST** /api/student/search | Gets list of Students by criteria


<a name="createStudent"></a>
# **createStudent**
> StudentDto createStudent(studentDto)

Create a Studen

API for creating a new Studen

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.StudentApi;


StudentApi apiInstance = new StudentApi();
StudentDto studentDto = new StudentDto(); // StudentDto | StudentDto
try {
    StudentDto result = apiInstance.createStudent(studentDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentApi#createStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentDto** | [**StudentDto**](StudentDto.md)| StudentDto |

### Return type

[**StudentDto**](StudentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStudent"></a>
# **getStudent**
> StudentDto getStudent(id)

Get Student by id

API for getting Student by id

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.StudentApi;


StudentApi apiInstance = new StudentApi();
Long id = 789L; // Long | 
try {
    StudentDto result = apiInstance.getStudent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentApi#getStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**StudentDto**](StudentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStudentsByCriteria"></a>
# **getStudentsByCriteria**
> List&lt;StudentDto&gt; getStudentsByCriteria(body)

Gets list of Students by criteria

API for searching Students by criteria

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.StudentApi;


StudentApi apiInstance = new StudentApi();
SearchStudentsDto body = new SearchStudentsDto(); // SearchStudentsDto | SearchStudentsDto
try {
    List<StudentDto> result = apiInstance.getStudentsByCriteria(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StudentApi#getStudentsByCriteria");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchStudentsDto**](SearchStudentsDto.md)| SearchStudentsDto |

### Return type

[**List&lt;StudentDto&gt;**](StudentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

