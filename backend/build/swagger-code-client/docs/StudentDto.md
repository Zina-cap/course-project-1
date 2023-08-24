
# StudentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Internal (from database) id of Mentor |  [optional]
**firstName** | **String** | First name | 
**lastName** | **String** | Last name | 
**email** | **String** | Email |  [optional]
**phone** | **String** | Phone nubmer | 
**mentor** | [**MentorDto**](MentorDto.md) | Mentor of student |  [optional]
**school** | [**SchoolDto**](SchoolDto.md) | School number | 
**courses** | [**List&lt;CourseRegistrationDto&gt;**](CourseRegistrationDto.md) |  |  [optional]
**version** | **Long** | Version of object |  [optional]



