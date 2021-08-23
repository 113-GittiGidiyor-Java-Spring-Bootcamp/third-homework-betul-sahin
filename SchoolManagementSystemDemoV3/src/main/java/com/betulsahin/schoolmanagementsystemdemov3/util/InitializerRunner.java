package com.betulsahin.schoolmanagementsystemdemov3.util;

import com.betulsahin.schoolmanagementsystemdemov3.entity.*;
import com.betulsahin.schoolmanagementsystemdemov3.repository.CourseRegistrationRepository;
import com.betulsahin.schoolmanagementsystemdemov3.repository.CourseRepository;
import com.betulsahin.schoolmanagementsystemdemov3.repository.InstructorRepository;
import com.betulsahin.schoolmanagementsystemdemov3.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;

@Component
public class InitializerRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private CourseRegistrationRepository courseRegistrationRepository;
    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public void run(String... args) throws Exception {
        // create students
        Student student1 = new Student("Ahmet Yılmaz", LocalDate.of(1990, Month.JANUARY,5), "Adana", GenderType.MALE.getGenderName());
        Student student2 = new Student( "Ayse Yılmaz", LocalDate.of(1994, Month.MARCH,20), "Ankara", GenderType.FEMALE.getGenderName());
        Student student3 = new Student( "Veli Yılmaz", LocalDate.of(1991, Month.NOVEMBER,15), "İstanbul", GenderType.MALE.getGenderName());
        Student student4 = new Student( "Nuran Yılmaz", LocalDate.of(1998, Month.APRIL,7), "Edirne", GenderType.FEMALE.getGenderName());
        Student student5 = new Student( "Zeynep Yılmaz", LocalDate.of(1995, Month.JUNE,22), "İzmir", GenderType.FEMALE.getGenderName());

        // saving students
        student1 = studentRepository.save(student1);
        student2 = studentRepository.save(student2);
        student3 = studentRepository.save(student3);
        student4 = studentRepository.save(student4);
        student5 = studentRepository.save(student5);

        // create courses
        Course course1 = new Course( "Bilgi Teknolojilerine Giriş", "btk1000", 100);
        Course course2 = new Course("JAVA İle Programlamaya Giriş", "btk1001", 100);
        Course course3 = new Course("Python ile Makine Öğrenmesi", "btk1002", 100);
        Course course4 = new Course("Doğal Dil İşlemeye Giriş", "btk1003", 100);
        Course course5 = new Course("Algoritma, Programlama ve Veri Yapıları", "btk1004", 100);
        Course course6 = new Course("HTML5 ile Web Geliştirme", "btk1005", 100);
        Course course7 = new Course("Büyük Veriye Giriş", "btk1006", 100);
        Course course8 = new Course("Uygulamalarla SQL Öğreniyorum", "btk1007", 100);

        // save courses
        course1 = courseRepository.save(course1);
        course2 = courseRepository.save(course2);
        course3 = courseRepository.save(course3);
        course4 = courseRepository.save(course4);
        course5 = courseRepository.save(course5);
        course6 = courseRepository.save(course6);
        course7 = courseRepository.save(course7);
        course8 = courseRepository.save(course8);

        // save student to courses
        CourseRegistration registration1 = new CourseRegistration(LocalDate.now());
        registration1.setCourse(course1);
        registration1.setStudent(student1);
        courseRegistrationRepository.save(registration1);

        CourseRegistration registration2 = new CourseRegistration(LocalDate.now());
        registration2.setCourse(course2);
        registration2.setStudent(student1);
        courseRegistrationRepository.save(registration2);

        CourseRegistration registration3 = new CourseRegistration(LocalDate.now());
        registration3.setCourse(course3);
        registration3.setStudent(student2);
        courseRegistrationRepository.save(registration3);

        CourseRegistration registration4 = new CourseRegistration(LocalDate.now());
        registration4.setCourse(course2);
        registration4.setStudent(student2);
        courseRegistrationRepository.save(registration4);

        CourseRegistration registration5 = new CourseRegistration(LocalDate.now());
        registration5.setCourse(course4);
        registration5.setStudent(student2);
        courseRegistrationRepository.save(registration5);

        CourseRegistration registration6 = new CourseRegistration(LocalDate.now());
        registration6.setCourse(course6);
        registration6.setStudent(student4);
        courseRegistrationRepository.save(registration6);

        CourseRegistration registration7 = new CourseRegistration(LocalDate.now());
        registration7.setCourse(course7);
        registration7.setStudent(student4);
        courseRegistrationRepository.save(registration7);

        CourseRegistration registration8 = new CourseRegistration(LocalDate.now());
        registration8.setCourse(course8);
        registration8.setStudent(student4);
        courseRegistrationRepository.save(registration8);

        CourseRegistration registration9 = new CourseRegistration(LocalDate.now());
        registration9.setCourse(course1);
        registration9.setStudent(student5);
        courseRegistrationRepository.save(registration9);

        CourseRegistration registration10 = new CourseRegistration(LocalDate.now());
        registration10.setCourse(course5);
        registration10.setStudent(student5);
        courseRegistrationRepository.save(registration10);

        CourseRegistration registration11 = new CourseRegistration(LocalDate.now());
        registration11.setCourse(course7);
        registration11.setStudent(student5);
        courseRegistrationRepository.save(registration11);


        // create instructors
        Instructor instructor1 = new VisitingResearcher("Şadi Evren Şeker", "İstanbul", "05554331256", 40, 250.0);
        Instructor instructor2 = new PermanentInstructor("Engin Demiroğ", "Ankara", "05554331256", 10000.0);
        Instructor instructor3 = new PermanentInstructor("Uras Mutlu", "İstanbul", "05554331256", 10000.0);
        Instructor instructor4 = new VisitingResearcher("Gizem Gezici", "Ankara", "05554331256", 40, 250.0);
        Instructor instructor5 = new VisitingResearcher("Zafer Cömert", "İzmir", "05554331256", 40, 250.0);
        Instructor instructor6 = new PermanentInstructor( "Fahrettin Erdinç", "İstanbul", "05554331256", 10000);
        Instructor instructor7 = new PermanentInstructor("Talha Kılıç", "Ankara", "05554331256", 10000);
        Instructor instructor8 = new PermanentInstructor( "Ömer Faruk Çolakoğlu", "İstanbul", "05554331256", 10000);

        // save instructors
        instructor1 = instructorRepository.save(instructor1);
        instructor2 = instructorRepository.save(instructor2);
        instructor3 = instructorRepository.save(instructor3);
        instructor4 = instructorRepository.save(instructor4);
        instructor5 = instructorRepository.save(instructor5);
        instructor6 = instructorRepository.save(instructor6);
        instructor7 = instructorRepository.save(instructor7);
        instructor8 = instructorRepository.save(instructor8);

        // update instructors
        instructorRepository.save(instructor1);
        instructorRepository.save(instructor2);
        instructorRepository.save(instructor4);
        instructorRepository.save(instructor5);
        instructorRepository.save(instructor6);
        instructorRepository.save(instructor7);

        // set instructors of courses
        course1.setInstructor(instructor1);
        course2.setInstructor(instructor5);
        course3.setInstructor(instructor6);
        course6.setInstructor(instructor2);
        course7.setInstructor(instructor2);
        course8.setInstructor(instructor2);
        course4.setInstructor(instructor4);
        course5.setInstructor(instructor7);

        // update courses
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
        courseRepository.save(course4);
        courseRepository.save(course5);
        courseRepository.save(course6);
        courseRepository.save(course7);
        courseRepository.save(course8);
    }
}
