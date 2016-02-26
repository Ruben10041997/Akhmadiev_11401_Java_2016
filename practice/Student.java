import java.util.List;
import java.util.Map;


public class Student {
    private String name;
    private String institute;
    private List<Lesson> lessons;

    public Student(String name,String institute) {
        this.name = name;
        this.institute = institute;

    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
}




















 /*   public void setName(String name) {
        this.name = name;
    }

    public void setInstitute(InstituteInterface institute) {
        this.institute = institute;
    }
    public void goToLessons(){
        for(Lesson lesson : lessons){
            System.out.println(name + " is on " + lesson.getName());
        }
    }

    public void wakeUp() {
        System.out.println(name + " is already not sleeping");
    }
    public void goToSleep(){
        System.out.println(name + " sleeping ");
    }

    public Map<String, Lesson> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, Lesson> schedule) {
        this.schedule = schedule;
    }

    public void printSchedule(){
        System.out.println("u " + name);
        for( String key : schedule.keySet()){
            System.out.println(schedule.get(key));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", institute=" + institute.getName() +
                '}';
    }

    public void setLessons(List lessons) {
        this.lessons = lessons;
    }

    public List getLessons() {
        return lessons;
    }
   */

