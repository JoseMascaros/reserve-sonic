package pe.edu.upc.reservesonic.dao;

import java.util.List;

import pe.edu.upc.reservesonic.models.entities.Room;

public interface IRoomDao {
	
	public void insert(Room room);
	
	public List<Room> list();
	
	public void delete(String id);
}
