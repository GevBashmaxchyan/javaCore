package homework.education2.education.storage;

import homework.education2.education.model.Lesson;
import homework.education2.education.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class LessonStorage {
    private List<Lesson> lessons = new ArrayList<>();


    public void add(Lesson lesson) {
        lessons.add(lesson);
        serialize();
    }


    public void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }


    public Lesson getByLessonName(String lessonname) {

        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(lessonname)) {
                return lesson;
            }
        }
        return null;
    }


    public void deleteLesson(String lessonname) {
        lessons.remove(lessonname);
        serialize();
    }

    public void searchName(String name) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(name)) {
                System.out.println(lesson);
            }
        }
    }
    public void serialize(){
        FileUtil.serializeLessons(lessons);
    }

    public void initeData() {
        List<Lesson> lessonsList =FileUtil.deserializeLessons();
        if (lessonsList != null) {
            lessons = lessonsList;
        }
    }
}
