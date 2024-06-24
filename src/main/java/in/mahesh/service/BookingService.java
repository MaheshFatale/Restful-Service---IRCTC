package in.mahesh.service;

import in.mahesh.request.Passenger;
import in.mahesh.response.Ticket;

public interface BookingService {

	public Ticket bookTicket(Passenger passenger);
	
	
	public Ticket getTicket(Integer ticketNumber);
} 
