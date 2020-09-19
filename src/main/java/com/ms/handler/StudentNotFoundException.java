package com.ms.handler;

public class StudentNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3042686055658047285L;

    public StudentNotFoundException() {
        super("Student not found.");
    }

    public StudentNotFoundException(long id) {
        super(String.format("Student with id %d not found.", id));
    }
}
