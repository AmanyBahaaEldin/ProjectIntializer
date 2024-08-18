package com.example.project_initializer.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.project_initializer.Model.WebhookPayload;
import com.example.project_initializer.RestService.InitializerService;

@RestController
public class InitializerController {

    //Parameters required for API requests
    final private String Token = "40df96173e3c5aa148fee13c9e7fa01f0b5f77eabe0a076a72c9b98c98c05bf036ea0ff860d83642030d853d4724ce8f3a73e70c58738f3030c71443b359034cafbd682e32f2ab4dad813227e6b3f9cf";
    final private String CustomerID = "1319009";
    //ID for Sample form created on PlanRadar 
    private String SampleFormID = "xmjwdpb";
    private String ComponentName = "FirstLayer";
    private String TicketTitle = "ProjectFirstTicket";
    private int TicketStatus = 1;
    private String ProjectID;
    private String TicketTypeID;
    private String ComponentID;


    @Autowired
    private InitializerService Service;



    @PostMapping("/webhook")
    public void handleWebhook(@RequestBody WebhookPayload payload) {

        //Read the project id from the webhook request
        ProjectID= payload.getData().getId();
        System.out.println("ProjectID            "+ProjectID);
        //Assig the project id required to call the APIs 
        Service.setProjectID(ProjectID);
        //Assign the customer id required to call the APIs
        Service.setCustomerID(CustomerID);
        //set the header parameters required for requests
        Service.setToken(Token);

        //Add the sample form to the newly created project
        TicketTypeID= Service.AddTicketTypeRequest(SampleFormID , "application/json");

        //Add an empty layer to the newly created project
        ComponentID = Service.CreateComponent(ComponentName ).getData().get(0).getId();

        //Create new ticket
        Service.CallCreateTicket("application/json",TicketTypeID, ComponentID , TicketTitle , TicketStatus);





    }

    public String getToken() {
        return Token;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getProjectID() {
        return ProjectID;
    }

    public void setProjectID(String projectID) {
        ProjectID = projectID;
    }
}
