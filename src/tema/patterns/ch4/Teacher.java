package tema.patterns.ch4;


import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{
    private List<Observer> students = new ArrayList<>();

    @Override
    public void register(Observer obj) {
        students.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        students.remove(obj);
    }

    public void teach(String topic) {
        notifyObservers(topic);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer student : students) {
            student.update(message);
}
}

}
