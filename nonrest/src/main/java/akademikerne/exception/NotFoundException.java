package akademikerne.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(Integer id, String entity) {
        super(" Could not find " + " " + entity + " " + id);
    }
}
