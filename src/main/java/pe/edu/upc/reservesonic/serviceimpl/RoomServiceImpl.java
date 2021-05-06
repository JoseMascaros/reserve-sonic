package pe.edu.upc.reservesonic.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.reservesonic.dao.IRoomDao;
import pe.edu.upc.reservesonic.models.entities.Room;
import pe.edu.upc.reservesonic.service.IRoomService;

@Named
@RequestScoped
public class RoomServiceImpl implements IRoomService {
	
	@Inject
	private IRoomDao rDao;
	
	@Override
	public void insert(Room room) {
		rDao.insert(room);
	}

	@Override
	public List<Room> list() {
		return rDao.list();
	}

	@Override
	public void delete(Integer id) {
		rDao.delete(id);
	}

}
