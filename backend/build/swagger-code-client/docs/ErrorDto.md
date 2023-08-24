
# ErrorDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**ErrorEnum**](#ErrorEnum) | Error codes: * CONFLICT - Attempt to save not unique data. * NOT_FOUND - Data was not found. * BAD_REQUEST - incorrect value in request params. * INTERNAL_SERVER_ERROR - problem on server side.  | 
**errorDescription** | **String** | Description of error. |  [optional]


<a name="ErrorEnum"></a>
## Enum: ErrorEnum
Name | Value
---- | -----
CONFLICT | &quot;CONFLICT&quot;
BAD_REQUEST | &quot;BAD_REQUEST&quot;
NOT_FOUND | &quot;NOT_FOUND&quot;
INTERNAL_SERVER_ERROR | &quot;INTERNAL_SERVER_ERROR&quot;



