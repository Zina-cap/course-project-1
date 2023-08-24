# CourseApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCourse**](CourseApi.md#createCourse) | **POST** /api/course | Create a course
[**getAllCourses**](CourseApi.md#getAllCourses) | **GET** /api/course/search | Gets list of courses
[**getCourse**](CourseApi.md#getCourse) | **GET** /api/course/{id} | Get course by id


<a name="createCourse"></a>
# **createCourse**
> CourseDto createCourse(courseDto)

Create a course

API for creating a new Course

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.CourseApi;


CourseApi apiInstance = new CourseApi();
CourseDto courseDto = new CourseDto(); // CourseDto | CourseDto
try {
    CourseDto result = apiInstance.createCourse(courseDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#createCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseDto** | [**CourseDto**](CourseDto.md)| CourseDto |

### Return type

[**CourseDto**](CourseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllCourses"></a>
# **getAllCourses**
> List&lt;CourseDto&gt; getAllCourses()

Gets list of courses

API for getting all courses

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.CourseApi;


CourseApi apiInstance = new CourseApi();
try {
    List<CourseDto> result = apiInstance.getAllCourses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getAllCourses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CourseDto&gt;**](CourseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCourse"></a>
# **getCourse**
> CourseDto getCourse(id)

Get course by id

API for getting course by id

### Example
```java
// Import classes:
//import ru.tsystems.devschool.invoker.ApiException;
//import ru.tsystems.devschool.api.CourseApi;


CourseApi apiInstance = new CourseApi();
Long id = 789L; // Long | 
try {
    CourseDto result = apiInstance.getCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**CourseDto**](CourseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

