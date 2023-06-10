package stefanmonko.sk.servisimoviewer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import stefanmonko.sk.servisimoviewer.FeatureProperties;
import stefanmonko.sk.servisimoviewer.domain.Ticket;
import stefanmonko.sk.servisimoviewer.domain.TicketRepository;

@RestController
public class TicketController {

    @Autowired 
    private  TicketRepository ticketRepository;

    @Autowired 
	private  FeatureProperties featureFlags;

    @RequestMapping("/tickets")
    public @ResponseBody Iterable<Ticket> getAll_Tickets() {
        return ticketRepository.findAll();

    }

    @RequestMapping("/ticketbyid/{id}")
    public Ticket findTicketById(@PathVariable(value = "id") int id) {
        if (featureFlags.isExpandedsearch()) {
            return ticketRepository.findTicketById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Feature not activated");
        }
    }

    @RequestMapping("/ticketbyassignee/{assignee}")
    public @ResponseBody Iterable<Ticket> findTicketByAssignee(@PathVariable(value = "assignee") String assignee) {
        if (featureFlags.isExpandedsearch()) {
            return ticketRepository.findTicketByAssignee(assignee);
        } else {
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Feature not activated");
        }
    }
        
    @RequestMapping("/ticketbyseverity/{severity}")
    public @ResponseBody Iterable<Ticket> findTicketBySeverity(@PathVariable(value = "severity") Integer severity) {
        if (featureFlags.isExpandedsearch()) {
            return ticketRepository.findTicketBySeverity(severity);
        } else {
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Feature not activated");
        }
    }

    @RequestMapping("ticketbyitem/{item}")
    public @ResponseBody Iterable<Ticket> findTicketByItem(@PathVariable(value = "item") String item) {
        if (featureFlags.isExpandedsearch()) {
            return ticketRepository.findTicketByItem(item);
        } else {    
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Feature not activated");
        }
    }

    @RequestMapping("ticketbystatus/{status}")
    public @ResponseBody Iterable<Ticket> findTicketByStatus(@PathVariable(value = "status") Integer status) {
       if (featureFlags.isExpandedsearch()) {
            return ticketRepository.findTicketByStatus(status);
        } else {
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, "Feature not activated");
        }
    }

}

    

