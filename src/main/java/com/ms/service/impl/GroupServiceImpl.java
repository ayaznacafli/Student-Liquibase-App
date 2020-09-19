package com.ms.service.impl;

import com.ms.handler.GroupNotFoundException;
import com.ms.model.Group;
import com.ms.model.Student;
import com.ms.repository.GroupRepository;
import com.ms.repository.StudentRepository;
import com.ms.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private  GroupRepository groupRepository;

    @Override
    public Group getGroupByID(Long id) {
        return groupRepository.findById(id).orElseThrow(() -> new GroupNotFoundException(id));
    }


    @Override
    public Group saveGroup(Group group) {
        return groupRepository.save(group);
    }
}
