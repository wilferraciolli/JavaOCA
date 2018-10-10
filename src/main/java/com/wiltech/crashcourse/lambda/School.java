package com.wiltech.crashcourse.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * The interface Student criterion.
 */
interface StudentCriterion {
    /**
     * Test boolean.
     *
     * @param s the s
     * @return the boolean
     */
    boolean test(Student s);
}

/**
 * The type Smart student criterion.
 */
class SmartStudentCriterion implements StudentCriterion {
    public boolean test(final Student s) {
        return s.getGrade() > 3.0;
    }
}

/**
 * The type Long name student criterion.
 */
class LongNameStudentCriterion implements StudentCriterion {
    @Override
    public boolean test(final Student s) {
        return s.getName().length() > 4;
    }
}

/**
 * The type School.
 */
public class School {
    /**
     * Show all.
     *
     * @param school the school
     */
//  public static void showAll(List<Student> school) {
    public static void showAll(final Iterable<Student> school) {
        for (final Student s : school) {
            System.out.println("> " + s);
        }
    }

    /**
     * Gets students.
     *
     * @param school the school
     * @param crit   the crit
     * @return the students
     */
//  public static List<Student> getStudents(
//      List<Student> school, StudentCriterion crit) {
    public static List<Student> getStudents(
            final List<Student> school, final Predicate<Student> crit) {
        final List<Student> rv = new ArrayList<>();
        for (final Student s : school) {
            if (crit.test(s)) {
                rv.add(s);
            }
        }
        return rv;
    }
//
//  public static List<Student> getSmartStudents(
//      List<Student> school, double threshold) {
//    List<Student> rv = new ArrayList<>();
//    for (Student s : school) {
//      if (s.getGrade() > threshold) {
//        rv.add(s);
//      }
//    }
//    return rv;
//  }
//
//  public static List<Student> getLongNameStudents(
//      List<Student> school, int threshold) {
//    List<Student> rv = new ArrayList<>();
//    for (Student s : school) {
//      if (s.getName().length() > threshold) {
//        rv.add(s);
//      }
//    }
//    return rv;
//  }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(final String[] args) {
        final List<Student> school = new ArrayList<>();
        school.add(new Student("Fred", 3.7));
        school.add(new Student("Jim", 2.2));
        school.add(new Student("Sheila", 3.7));
        school.add(new Student("Alice", 2.9));

        System.out.println("All students-------------------");
        showAll(school);

//    System.out.println("Smart students-------------------");
//    showAll(getStudents(school, new SmartStudentCriterion()));
//
//    System.out.println("Long Name students-------------------");
//    showAll(getStudents(school, new LongNameStudentCriterion()));
//
//    System.out.println("Not Smart students-------------------");
//    showAll(getStudents(school, new
//      /*class SmartStudentCriterion implements */StudentCriterion() {
//        public boolean test(Student s) {
//          return s.getGrade() < 3.0;
//        }
//      }));

//    System.out.println("Not Smart students-------------------");
//    showAll(getStudents(school, /*new StudentCriterion() {*/
//        /*public boolean test*/(Student s) -> {
//          return s.getGrade() < 3.0;
//        }
//      /*}*/));

//    System.out.println("Not Smart students-------------------");
//    showAll(getStudents(school,
//        (Student s) -> {return s.getGrade() < 3.0;}
//    ));

//    System.out.println("Not Smart students-------------------");
//    showAll(getStudents(school,
//        (s) -> {return s.getGrade() < 3.0;}
//    ));

//    System.out.println("Not Smart students-------------------");
//    showAll(getStudents(school,
//        s -> {return s.getGrade() < 3.0;}
//    ));

//    System.out.println("Not Smart students-------------------");
//    showAll(getStudents(school,
//        s -> {
//          for (int i = 0; i < 3; i++)
//            System.out.println("> " + i);
//          return s.getGrade() < 3.0;
//        }
//    ));

//    System.out.println("Not Smart students-------------------");
//    showAll(getStudents(school,
//        s -> /*{
//          return*/ s.getGrade() < 3.0/*;
//        }*/
//    ));

        System.out.println("Not Smart students-------------------");
        showAll(getStudents(school, s -> s.getGrade() < 3.0));

        final Predicate<Student> ps = s -> s.getGrade() < 3.0;
    }
}
