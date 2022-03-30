package CustomMarkerInterface;

public class DbFramework {
	
	public void delete(Object obj) {
		if(obj instanceof Deleteable) {
			//DB logic here
		}
	}

}
