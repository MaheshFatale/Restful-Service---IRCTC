package in.mahesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mahesh.request.Passenger;
import in.mahesh.response.Ticket;
import in.mahesh.service.BookingService;

@RestController
public class BookingRestController {
	
	@Autowired
	private BookingService service;
	
	@PostMapping(
			value="/ticket",
			consumes= {"application/json"},
			produces= {"application/json"}
			)
	public ResponseEntity<Ticket> ticketbookint(@RequestBody Passenger passenger){
			
		Ticket ticket=service.bookTicket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	
	
	
	@GetMapping(
			value="/ticket/{ticketNumber}",
			produces={"application/json"}
			)
	public Ticket getTicketByNum(@PathVariable Integer ticketNumber) {
		return service.getTicket(ticketNumber);
	}
}
