package pe.edu.upc.reservesonic.service;

import java.util.List;

import pe.edu.upc.reservesonic.models.entities.Room;

public interface IRoomService {
	
	public void insert(Room room);

	public List<Room> list();

	public void delete(String id);
}
