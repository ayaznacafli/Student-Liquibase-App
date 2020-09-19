package com.ms.handler;

public class GroupNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3042686055658047285L;

    public GroupNotFoundException() {
        super("Group not found.");
    }

    public GroupNotFoundException(long id) {
        super(String.format("Group with id %d not found.", id));
    }

}
