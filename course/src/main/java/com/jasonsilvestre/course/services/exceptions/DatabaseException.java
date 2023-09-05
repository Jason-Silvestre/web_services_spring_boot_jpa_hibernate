package com.jasonsilvestre.course.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public DatabaseException(String msg) {
           super(msg);
        }
}
