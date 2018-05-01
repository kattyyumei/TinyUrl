package ma.tinyurl.exceptions;

public class UrlNotFoundException extends Throwable {
    public UrlNotFoundException(String msg) {
        super(msg);
    }
}
