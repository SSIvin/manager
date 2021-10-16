package smev.Wrapper;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.JAXBElement;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = RequestSnils.class, name = "RequestSnils"),
        @JsonSubTypes.Type(value = RequestDOHFLNARequest.class, name = "RequestDOHFLNARequest"),
        @JsonSubTypes.Type(value = RequestInn.class, name = "RequestInn"),
        @JsonSubTypes.Type(value = RequestDOHFLNARequest.class, name = "Request2Ndfl"),
        @JsonSubTypes.Type(value = ResponseFormDataResponseType.class, name = "ResponseChildSub"),
        @JsonSubTypes.Type(value = RequestNDIPSRRequest.class, name = "RequestNDIPSR"),
        @JsonSubTypes.Type(value = RequestNDFL3DOHRequest.class, name = "Request3Ndfl"),
        @JsonSubTypes.Type(value = RequestSVVIPLFLRequest.class, name = "SVVIPLFLRequest"),
        @JsonSubTypes.Type(value = RequestInformRequest.class, name = "InformRequest"),
        @JsonSubTypes.Type(value = RequestROGDINFRequest.class, name = "ROGDINFRequest"),
        @JsonSubTypes.Type(value = RequestExtractionInvalidDataRequest.class, name = "ExtractionInvalidDataRequest"),
        @JsonSubTypes.Type(value = ResponseInitiativeDistributionResponse.class, name = "ResponseInitiativeDistribution"),
        @JsonSubTypes.Type(value = RequestDOHFLNASPRequest.class, name = "RequestDOHFLNASPRequest"),
        @JsonSubTypes.Type(value = RequestRegister.class, name = "RequestRegister"),
        @JsonSubTypes.Type(value = RequestRequestBenefit489.class, name = "RequestGIBDD"),
        @JsonSubTypes.Type(value = RequestExportRAOHousesRequest.class, name = "GisJKHHouses"),
        @JsonSubTypes.Type(value = RequestSZNRequest.class, name = "RequestSZN"),
        @JsonSubTypes.Type(value = BRAKRASTINFRequestRequest.class, name = "BRAKRASTINFRequest"),
        @JsonSubTypes.Type(value = BRAKZAKINFRequestRequest.class, name = "BRAKZAKINFRequest"),
        @JsonSubTypes.Type(value = FATALINFRequestRequest.class, name = "FATALINFRequest"),
        @JsonSubTypes.Type(value = PARENTINFRequestRequest.class, name = "PARENTINFRequest"),
        @JsonSubTypes.Type(value = PERNAMEINFRequestRequest.class, name = "PERNAMEINFRequest"),
        @JsonSubTypes.Type(value = ROGDINFRequestRequest.class, name = "ROGDINFRequestRequest"),
        @JsonSubTypes.Type(value = RequestRosreestrRequest.class, name = "Rosreestr"),
        @JsonSubTypes.Type(value = Request2NDFLRequest.class, name = "2NDFLRequest"),
        @JsonSubTypes.Type(value = LivPlaceRequestRegistrationRequest.class, name = "mvdLivRegPlace"),
        @JsonSubTypes.Type(value = PlaceRequestRegistrationRequest.class, name = "mvdRegPlace")
})
public class ObjectMessage implements TypeBussines {

    //    @JsonProperty(required = true)
//    private int typeRequest;
    public TypeBussines data;
//    @JsonProperty(defaultValue = "false")
    //private boolean personalSignature;
    //TODO перенес subjec в interaction
    //public Subject subject;

//    public ObjectMessage getData() {
//        return this.data;
//    }

    public void setData(Object data) {
        if (data instanceof JAXBElement) {
            this.data = (TypeBussines) ((JAXBElement) data).getValue();
        } else
        this.data = (TypeBussines) data;
    }

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return (ObjectMessage) this.data;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
