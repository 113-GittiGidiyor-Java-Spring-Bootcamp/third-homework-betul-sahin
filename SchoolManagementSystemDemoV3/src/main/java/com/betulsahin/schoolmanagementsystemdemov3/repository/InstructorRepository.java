package com.betulsahin.schoolmanagementsystemdemov3.repository;

import com.betulsahin.schoolmanagementsystemdemov3.entity.Instructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Long> {
    List<Instructor> findAllByNameContainingIgnoreCase(String searchWord);

    // TODO
   /* @Query("SELECT max(p.salary) FROM Instructor i INNER JOIN permanentInstructor p WHERE p.id = i.id")
    List<Instructor> findAllTop3BySalaryGreaterThan();*/

    void deleteByName(String name);
}