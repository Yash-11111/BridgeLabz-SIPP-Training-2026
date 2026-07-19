import java.util.PriorityQueue;

class Patient {

    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalER {

    private PriorityQueue<Patient> triageQueue;

    public HospitalER() {

        triageQueue = new PriorityQueue<>(
                (a, b) -> a.priority - b.priority);
    }

    public void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient callNextPatient() {

        if (triageQueue.isEmpty()) {
            throw new RuntimeException("No Patients");
        }

        return triageQueue.poll();
    }

    public static void main(String[] args) {

        HospitalER er = new HospitalER();

        er.admitPatient(new Patient(3, "Rahul"));
        er.admitPatient(new Patient(1, "Aman"));
        er.admitPatient(new Patient(5, "Riya"));
        er.admitPatient(new Patient(2, "Neha"));

        while (!er.triageQueue.isEmpty()) {

            Patient p = er.callNextPatient();

            System.out.println(p.name + " Priority : " + p.priority);
        }
    }
}