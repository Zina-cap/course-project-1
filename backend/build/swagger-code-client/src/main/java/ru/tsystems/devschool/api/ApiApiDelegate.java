package ru.tsystems.devschool.api;

import ru.tsystems.devschool.model.CourseDto;
import ru.tsystems.devschool.model.ErrorDto;
import ru.tsystems.devschool.model.MentorDto;
import ru.tsystems.devschool.model.SchoolDto;
import ru.tsystems.devschool.model.SearchStudentsDto;
import ru.tsystems.devschool.model.StudentDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ApiApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-24T22:29:15.694+03:00")

public interface ApiApiDelegate {

    Logger log = LoggerFactory.getLogger(ApiApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    /**
     * @see ApiApi#createCourse
     */
    default ResponseEntity<CourseDto> createCourse( CourseDto  courseDto) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"name\" : \"name\",  \"id\" : 0,  \"version\" : 6}", CourseDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#createMentor
     */
    default ResponseEntity<MentorDto> createMentor( MentorDto  mentorDto) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"phone\" : \"phone\",  \"id\" : 0,  \"version\" : 6,  \"email\" : \"email\"}", MentorDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#createSchool
     */
    default ResponseEntity<SchoolDto> createSchool( SchoolDto  schoolDto) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"number\" : 6,  \"endDate\" : \"2000-01-23\",  \"id\" : 0,  \"version\" : 1,  \"startDate\" : \"2000-01-23\"}", SchoolDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#createStudent
     */
    default ResponseEntity<StudentDto> createStudent( StudentDto  studentDto) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"courses\" : [ {    \"course\" : {      \"name\" : \"name\",      \"id\" : 0,      \"version\" : 6    },    \"version\" : 1,    \"mark\" : 6  }, {    \"course\" : {      \"name\" : \"name\",      \"id\" : 0,      \"version\" : 6    },    \"version\" : 1,    \"mark\" : 6  } ],  \"mentor\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"phone\" : \"phone\",    \"id\" : 0,    \"version\" : 6,    \"email\" : \"email\"  },  \"phone\" : \"phone\",  \"school\" : {    \"number\" : 6,    \"endDate\" : \"2000-01-23\",    \"id\" : 0,    \"version\" : 1,    \"startDate\" : \"2000-01-23\"  },  \"id\" : 0,  \"version\" : 5,  \"email\" : \"email\"}", StudentDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#getAllCourses
     */
    default ResponseEntity<List<CourseDto>> getAllCourses() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"name\" : \"name\",  \"id\" : 0,  \"version\" : 6}, {  \"name\" : \"name\",  \"id\" : 0,  \"version\" : 6} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#getAllMentors
     */
    default ResponseEntity<List<MentorDto>> getAllMentors() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"phone\" : \"phone\",  \"id\" : 0,  \"version\" : 6,  \"email\" : \"email\"}, {  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"phone\" : \"phone\",  \"id\" : 0,  \"version\" : 6,  \"email\" : \"email\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#getAllSchools
     */
    default ResponseEntity<List<SchoolDto>> getAllSchools() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"number\" : 6,  \"endDate\" : \"2000-01-23\",  \"id\" : 0,  \"version\" : 1,  \"startDate\" : \"2000-01-23\"}, {  \"number\" : 6,  \"endDate\" : \"2000-01-23\",  \"id\" : 0,  \"version\" : 1,  \"startDate\" : \"2000-01-23\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#getCourse
     */
    default ResponseEntity<CourseDto> getCourse( Long  id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"name\" : \"name\",  \"id\" : 0,  \"version\" : 6}", CourseDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#getMentor
     */
    default ResponseEntity<MentorDto> getMentor( Long  id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"phone\" : \"phone\",  \"id\" : 0,  \"version\" : 6,  \"email\" : \"email\"}", MentorDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#getSchool
     */
    default ResponseEntity<SchoolDto> getSchool( Long  id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"number\" : 6,  \"endDate\" : \"2000-01-23\",  \"id\" : 0,  \"version\" : 1,  \"startDate\" : \"2000-01-23\"}", SchoolDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#getStudent
     */
    default ResponseEntity<StudentDto> getStudent( Long  id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"courses\" : [ {    \"course\" : {      \"name\" : \"name\",      \"id\" : 0,      \"version\" : 6    },    \"version\" : 1,    \"mark\" : 6  }, {    \"course\" : {      \"name\" : \"name\",      \"id\" : 0,      \"version\" : 6    },    \"version\" : 1,    \"mark\" : 6  } ],  \"mentor\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"phone\" : \"phone\",    \"id\" : 0,    \"version\" : 6,    \"email\" : \"email\"  },  \"phone\" : \"phone\",  \"school\" : {    \"number\" : 6,    \"endDate\" : \"2000-01-23\",    \"id\" : 0,    \"version\" : 1,    \"startDate\" : \"2000-01-23\"  },  \"id\" : 0,  \"version\" : 5,  \"email\" : \"email\"}", StudentDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see ApiApi#getStudentsByCriteria
     */
    default ResponseEntity<List<StudentDto>> getStudentsByCriteria( SearchStudentsDto  body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"courses\" : [ {    \"course\" : {      \"name\" : \"name\",      \"id\" : 0,      \"version\" : 6    },    \"version\" : 1,    \"mark\" : 6  }, {    \"course\" : {      \"name\" : \"name\",      \"id\" : 0,      \"version\" : 6    },    \"version\" : 1,    \"mark\" : 6  } ],  \"mentor\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"phone\" : \"phone\",    \"id\" : 0,    \"version\" : 6,    \"email\" : \"email\"  },  \"phone\" : \"phone\",  \"school\" : {    \"number\" : 6,    \"endDate\" : \"2000-01-23\",    \"id\" : 0,    \"version\" : 1,    \"startDate\" : \"2000-01-23\"  },  \"id\" : 0,  \"version\" : 5,  \"email\" : \"email\"}, {  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"courses\" : [ {    \"course\" : {      \"name\" : \"name\",      \"id\" : 0,      \"version\" : 6    },    \"version\" : 1,    \"mark\" : 6  }, {    \"course\" : {      \"name\" : \"name\",      \"id\" : 0,      \"version\" : 6    },    \"version\" : 1,    \"mark\" : 6  } ],  \"mentor\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"phone\" : \"phone\",    \"id\" : 0,    \"version\" : 6,    \"email\" : \"email\"  },  \"phone\" : \"phone\",  \"school\" : {    \"number\" : 6,    \"endDate\" : \"2000-01-23\",    \"id\" : 0,    \"version\" : 1,    \"startDate\" : \"2000-01-23\"  },  \"id\" : 0,  \"version\" : 5,  \"email\" : \"email\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
