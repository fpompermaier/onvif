
package org.onvif.ver10.search.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.search.wsdl package. 
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

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/search/wsdl", "Capabilities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.search.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     * 
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse }
     * 
     */
    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link GetRecordingSummary }
     * 
     */
    public GetRecordingSummary createGetRecordingSummary() {
        return new GetRecordingSummary();
    }

    /**
     * Create an instance of {@link GetRecordingSummaryResponse }
     * 
     */
    public GetRecordingSummaryResponse createGetRecordingSummaryResponse() {
        return new GetRecordingSummaryResponse();
    }

    /**
     * Create an instance of {@link GetRecordingInformation }
     * 
     */
    public GetRecordingInformation createGetRecordingInformation() {
        return new GetRecordingInformation();
    }

    /**
     * Create an instance of {@link GetRecordingInformationResponse }
     * 
     */
    public GetRecordingInformationResponse createGetRecordingInformationResponse() {
        return new GetRecordingInformationResponse();
    }

    /**
     * Create an instance of {@link GetMediaAttributes }
     * 
     */
    public GetMediaAttributes createGetMediaAttributes() {
        return new GetMediaAttributes();
    }

    /**
     * Create an instance of {@link GetMediaAttributesResponse }
     * 
     */
    public GetMediaAttributesResponse createGetMediaAttributesResponse() {
        return new GetMediaAttributesResponse();
    }

    /**
     * Create an instance of {@link FindRecordings }
     * 
     */
    public FindRecordings createFindRecordings() {
        return new FindRecordings();
    }

    /**
     * Create an instance of {@link FindRecordingsResponse }
     * 
     */
    public FindRecordingsResponse createFindRecordingsResponse() {
        return new FindRecordingsResponse();
    }

    /**
     * Create an instance of {@link GetRecordingSearchResults }
     * 
     */
    public GetRecordingSearchResults createGetRecordingSearchResults() {
        return new GetRecordingSearchResults();
    }

    /**
     * Create an instance of {@link GetRecordingSearchResultsResponse }
     * 
     */
    public GetRecordingSearchResultsResponse createGetRecordingSearchResultsResponse() {
        return new GetRecordingSearchResultsResponse();
    }

    /**
     * Create an instance of {@link FindEvents }
     * 
     */
    public FindEvents createFindEvents() {
        return new FindEvents();
    }

    /**
     * Create an instance of {@link FindEventsResponse }
     * 
     */
    public FindEventsResponse createFindEventsResponse() {
        return new FindEventsResponse();
    }

    /**
     * Create an instance of {@link GetEventSearchResults }
     * 
     */
    public GetEventSearchResults createGetEventSearchResults() {
        return new GetEventSearchResults();
    }

    /**
     * Create an instance of {@link GetEventSearchResultsResponse }
     * 
     */
    public GetEventSearchResultsResponse createGetEventSearchResultsResponse() {
        return new GetEventSearchResultsResponse();
    }

    /**
     * Create an instance of {@link FindPTZPosition }
     * 
     */
    public FindPTZPosition createFindPTZPosition() {
        return new FindPTZPosition();
    }

    /**
     * Create an instance of {@link FindPTZPositionResponse }
     * 
     */
    public FindPTZPositionResponse createFindPTZPositionResponse() {
        return new FindPTZPositionResponse();
    }

    /**
     * Create an instance of {@link GetPTZPositionSearchResults }
     * 
     */
    public GetPTZPositionSearchResults createGetPTZPositionSearchResults() {
        return new GetPTZPositionSearchResults();
    }

    /**
     * Create an instance of {@link GetPTZPositionSearchResultsResponse }
     * 
     */
    public GetPTZPositionSearchResultsResponse createGetPTZPositionSearchResultsResponse() {
        return new GetPTZPositionSearchResultsResponse();
    }

    /**
     * Create an instance of {@link FindMetadata }
     * 
     */
    public FindMetadata createFindMetadata() {
        return new FindMetadata();
    }

    /**
     * Create an instance of {@link FindMetadataResponse }
     * 
     */
    public FindMetadataResponse createFindMetadataResponse() {
        return new FindMetadataResponse();
    }

    /**
     * Create an instance of {@link GetMetadataSearchResults }
     * 
     */
    public GetMetadataSearchResults createGetMetadataSearchResults() {
        return new GetMetadataSearchResults();
    }

    /**
     * Create an instance of {@link GetMetadataSearchResultsResponse }
     * 
     */
    public GetMetadataSearchResultsResponse createGetMetadataSearchResultsResponse() {
        return new GetMetadataSearchResultsResponse();
    }

    /**
     * Create an instance of {@link GetSearchState }
     * 
     */
    public GetSearchState createGetSearchState() {
        return new GetSearchState();
    }

    /**
     * Create an instance of {@link GetSearchStateResponse }
     * 
     */
    public GetSearchStateResponse createGetSearchStateResponse() {
        return new GetSearchStateResponse();
    }

    /**
     * Create an instance of {@link EndSearch }
     * 
     */
    public EndSearch createEndSearch() {
        return new EndSearch();
    }

    /**
     * Create an instance of {@link EndSearchResponse }
     * 
     */
    public EndSearchResponse createEndSearchResponse() {
        return new EndSearchResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/search/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

}
