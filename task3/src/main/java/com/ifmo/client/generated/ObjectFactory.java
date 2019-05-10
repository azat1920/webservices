
package com.ifmo.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ifmo.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreatePersonResponse_QNAME = new QName("http://ifmo.com/", "createPersonResponse");
    private final static QName _GetPersonsById_QNAME = new QName("http://ifmo.com/", "getPersonsById");
    private final static QName _DeletePerson_QNAME = new QName("http://ifmo.com/", "deletePerson");
    private final static QName _IllegalIdException_QNAME = new QName("http://ifmo.com/", "IllegalIdException");
    private final static QName _GetPersonsResponse_QNAME = new QName("http://ifmo.com/", "getPersonsResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://ifmo.com/", "createPerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ifmo.com/", "updatePersonResponse");
    private final static QName _CheckPersonExistingById_QNAME = new QName("http://ifmo.com/", "checkPersonExistingById");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ifmo.com/", "deletePersonResponse");
    private final static QName _GetPersons_QNAME = new QName("http://ifmo.com/", "getPersons");
    private final static QName _CheckPersonExistingByIdResponse_QNAME = new QName("http://ifmo.com/", "checkPersonExistingByIdResponse");
    private final static QName _GetPersonsByIdResponse_QNAME = new QName("http://ifmo.com/", "getPersonsByIdResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ifmo.com/", "updatePerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ifmo.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link GetPersonsById }
     * 
     */
    public GetPersonsById createGetPersonsById() {
        return new GetPersonsById();
    }

    /**
     * Create an instance of {@link PersonServiceFault }
     * 
     */
    public PersonServiceFault createPersonServiceFault() {
        return new PersonServiceFault();
    }

    /**
     * Create an instance of {@link GetPersonsResponse }
     * 
     */
    public GetPersonsResponse createGetPersonsResponse() {
        return new GetPersonsResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link CheckPersonExistingById }
     * 
     */
    public CheckPersonExistingById createCheckPersonExistingById() {
        return new CheckPersonExistingById();
    }

    /**
     * Create an instance of {@link CheckPersonExistingByIdResponse }
     * 
     */
    public CheckPersonExistingByIdResponse createCheckPersonExistingByIdResponse() {
        return new CheckPersonExistingByIdResponse();
    }

    /**
     * Create an instance of {@link GetPersons }
     * 
     */
    public GetPersons createGetPersons() {
        return new GetPersons();
    }

    /**
     * Create an instance of {@link GetPersonsByIdResponse }
     * 
     */
    public GetPersonsByIdResponse createGetPersonsByIdResponse() {
        return new GetPersonsByIdResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "getPersonsById")
    public JAXBElement<GetPersonsById> createGetPersonsById(GetPersonsById value) {
        return new JAXBElement<GetPersonsById>(_GetPersonsById_QNAME, GetPersonsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonServiceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "IllegalIdException")
    public JAXBElement<PersonServiceFault> createIllegalIdException(PersonServiceFault value) {
        return new JAXBElement<PersonServiceFault>(_IllegalIdException_QNAME, PersonServiceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "getPersonsResponse")
    public JAXBElement<GetPersonsResponse> createGetPersonsResponse(GetPersonsResponse value) {
        return new JAXBElement<GetPersonsResponse>(_GetPersonsResponse_QNAME, GetPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPersonExistingById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "checkPersonExistingById")
    public JAXBElement<CheckPersonExistingById> createCheckPersonExistingById(CheckPersonExistingById value) {
        return new JAXBElement<CheckPersonExistingById>(_CheckPersonExistingById_QNAME, CheckPersonExistingById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "getPersons")
    public JAXBElement<GetPersons> createGetPersons(GetPersons value) {
        return new JAXBElement<GetPersons>(_GetPersons_QNAME, GetPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPersonExistingByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "checkPersonExistingByIdResponse")
    public JAXBElement<CheckPersonExistingByIdResponse> createCheckPersonExistingByIdResponse(CheckPersonExistingByIdResponse value) {
        return new JAXBElement<CheckPersonExistingByIdResponse>(_CheckPersonExistingByIdResponse_QNAME, CheckPersonExistingByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "getPersonsByIdResponse")
    public JAXBElement<GetPersonsByIdResponse> createGetPersonsByIdResponse(GetPersonsByIdResponse value) {
        return new JAXBElement<GetPersonsByIdResponse>(_GetPersonsByIdResponse_QNAME, GetPersonsByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifmo.com/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

}
