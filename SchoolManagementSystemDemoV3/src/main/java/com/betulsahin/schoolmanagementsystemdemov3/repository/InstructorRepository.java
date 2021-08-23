package com.betulsahin.schoolmanagementsystemdemov3.repository;

import com.betulsahin.schoolmanagementsystemdemov3.entity.Instructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Long> {
    List<Instructor> findAllByNameContainingIgnoreCase(String searchWord);

    void deleteByName(String name);
}
