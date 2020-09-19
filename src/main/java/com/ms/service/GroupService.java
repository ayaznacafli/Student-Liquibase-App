package com.ms.service;

import com.ms.model.Group;

public interface GroupService {

    Group getGroupByID(Long id);
    Group saveGroup(Group group);

}
