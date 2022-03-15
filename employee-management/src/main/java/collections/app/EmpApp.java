package collections.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmpApp {

	public EmpApp() {
	}

	public String findPerson(int EmpId) {

		if (EmpDb.db.containsKey(EmpId)) {
			return EmpDb.db.get(EmpId).getDetails();
		} else {
			return "No Person found";
		}
	}

	public List<String> listPersonByCity(String cityName) {

		List<String> persons = new ArrayList<String>();
		
		Set<Integer> keys = EmpDb.db.keySet();
		
		for (Integer key : keys) {
			Emp e = EmpDb.db.get(key);
			if (e.getCity().equals(cityName))
				persons.add(e.getDetails());
		}

		return persons;
	}

	public String addPerson(Emp e) {
		if(EmpDb.db.containsKey(e.getId())) {
			return "Employee already exists";
		}else {
			EmpDb.db.put(e.getId(), e);
			return "Employee added";
		}
	}
}