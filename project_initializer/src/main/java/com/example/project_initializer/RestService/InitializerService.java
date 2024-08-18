package com.example.project_initializer.RestService;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.project_initializer.Model.CreateComponentResponse;
import com.example.project_initializer.Model.CreateTicketRequest;
import com.example.project_initializer.Model.TicketTypeRequest;
import com.example.project_initializer.Model.TicketTypeResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Service
public class InitializerService {

    private String Token;
    private String CustomerID;
    private String ProjectID;

    final RestTemplate restTemplate = new RestTemplate();

    // Method to add the sample form to the newly created project
    @SuppressWarnings("null")
    public String AddTicketTypeRequest(String FormID, String ContentType) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-PlanRadar-API-Key", Token);
        headers.set("accept", "application/json");
        headers.set("Content-type", ContentType);

        // Assign required parameters in the AddTicketTypeRequest
        TicketTypeRequest TicketType = new TicketTypeRequest();
        TicketTypeRequest.Data data = new TicketTypeRequest.Data();
        TicketTypeRequest.Attributes attributes = new TicketTypeRequest.Attributes();
        attributes.setTicketTypeId(FormID);
        data.setAttributes(attributes);
        TicketTypeResponse Response = null;
        try {
            HttpEntity<TicketTypeRequest> request = new HttpEntity<TicketTypeRequest>(TicketType, headers);
            System.out.println(request.getHeaders());
            System.out.println(request.getBody());

            ResponseEntity<TicketTypeResponse> responseEntity = restTemplate
                    .postForEntity("https://www.planradar.com/api/v1/" + this.CustomerID + "/projects/" + this.ProjectID
                            + "/ticket_types_project", request, TicketTypeResponse.class);
            Response = responseEntity.getBody();

        } catch (HttpServerErrorException e) {
            System.err.println("Server error: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

        return Response.getData().getAttributes().getTicketTypeId();
    }

    @SuppressWarnings("null")
    public CreateComponentResponse CreateComponent(String ComponentName) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-PlanRadar-API-Key", Token);
        headers.set("accept", "application/json");
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> CreateComponentFormData = new LinkedMultiValueMap<String, String>();
        CreateComponentFormData.add("data[][attributes][layers][][name]", "FirstLayer");
        CreateComponentResponse ComponentResponse = null;
        try {
            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(
                    CreateComponentFormData, headers);

            ResponseEntity<CreateComponentResponse> responseEntity = restTemplate
                    .postForEntity("https://www.planradar.com/api/v1/" + this.CustomerID + "/projects/" + this.ProjectID
                            + "/components", request, CreateComponentResponse.class);

            ComponentResponse = responseEntity.getBody();
         
        } catch (HttpServerErrorException e) {
            System.err.println("Server error: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        return ComponentResponse;

    }

    // Method to create a ticket on this project
    public void CallCreateTicket(String ContentType, String TicketTypeId, String ComponentID, String TicketTitle,
            int TicketStatus) {
        // Assign required parameters in the CreateTicketRequest
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-PlanRadar-API-Key", Token);
        headers.set("accept", "application/json");
        headers.set("Content-type", ContentType);

        CreateTicketRequest TicketRequest = new CreateTicketRequest();
        CreateTicketRequest.Data data = new CreateTicketRequest.Data();
        CreateTicketRequest.Attributes attributes = new CreateTicketRequest.Attributes();
        attributes.setSubject(TicketTitle);
        attributes.setStatusId(TicketStatus);
        attributes.setTicketTypeId(TicketTypeId);
        attributes.setComponentId(ComponentID);
        data.setAttributes(attributes);
        TicketRequest.setData(data);

        try {
            HttpEntity<CreateTicketRequest> request = new HttpEntity<CreateTicketRequest>(TicketRequest, headers);
            ResponseEntity<String> responseEntity = restTemplate
                    .postForEntity("https://www.planradar.com/api/v2/" + this.CustomerID + "/projects/" + this.ProjectID
                            + "/tickets", request, String.class);
                            System.out.println(responseEntity.getStatusCode());
        } catch (HttpServerErrorException e) {
            System.err.println("Server error: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
