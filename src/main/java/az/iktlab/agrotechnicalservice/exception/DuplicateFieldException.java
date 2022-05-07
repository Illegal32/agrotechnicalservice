package az.iktlab.agrotechnicalservice.exception;

import org.springframework.dao.DuplicateKeyException;

public class DuplicateFieldException extends DuplicateKeyException {

    public DuplicateFieldException(String msg) {
        super(msg);
    }
}
