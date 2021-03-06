
package com.ifmo.client.generated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonWebService", targetNamespace = "http://ifmo.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonWebService {


    /**
     * 
     * @return
     *     returns java.util.List<com.ifmo.client.generated.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersons", targetNamespace = "http://ifmo.com/", className = "com.ifmo.client.generated.GetPersons")
    @ResponseWrapper(localName = "getPersonsResponse", targetNamespace = "http://ifmo.com/", className = "com.ifmo.client.generated.GetPersonsResponse")
    public List<Person> getPersons();

    /**
     * 
     * @param surname
     * @param name
     * @param id
     * @param age
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ifmo.com/", className = "com.ifmo.client.generated.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ifmo.com/", className = "com.ifmo.client.generated.CreatePersonResponse")
    public int createPerson(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname,
        @WebParam(name = "age", targetNamespace = "")
        int age);

    /**
     * 
     * @param surname
     * @param name
     * @param id
     * @param age
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ifmo.com/", className = "com.ifmo.client.generated.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ifmo.com/", className = "com.ifmo.client.generated.UpdatePersonResponse")
    public boolean updatePerson(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "surname", targetNamespace = "")
        String surname,
        @WebParam(name = "age", targetNamespace = "")
        String age);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ifmo.com/", className = "com.ifmo.client.generated.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ifmo.com/", className = "com.ifmo.client.generated.DeletePersonResponse")
    public boolean deletePerson(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
