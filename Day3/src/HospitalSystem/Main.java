package HospitalSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //BATCH A
        Doctor doctor = new Doctor();
        doctor.setName("Kiki");
        doctor.setIdNumber("28/24");
        doctor.setAge(34);
        doctor.setGender("Female");
        doctor.setNationality("Gambian");
        doctor.setSpecialty("Optometric");
        doctor.setYearsOfExperience(15);
        doctor.setDegree("Md");
        doctor.setAvailable(false);


        Nurse nurse =  new Nurse();
        nurse.setName("Temitope");
        nurse.setIdNumber("89/23");
        nurse.setAge(56);
        nurse.setSalary(100_00_00);
        nurse.setShiftDays("Null");
        nurse.setQualification("RN");
        nurse.setBodyType("curvy");

        Patient patient = new Patient();
        patient.setName("Philip");
        patient.setBills(70_000);
        patient.setHasAppointment(true);
        patient.setBloodGroup('O');
        patient.setGenotype("AA");


        Equipment equipment = new Equipment();
        equipment.setName("Opthalmoscopy");
        equipment.setDepartment("HospitalSystem.Optometry");
        equipment.setModelID(1/111);
        equipment.setSize("Medium");

        Optometry optometry = new Optometry();
        optometry.setDoctors(doctor);
        optometry.setNurse(nurse);
        optometry.setPatient(patient);
        optometry.setEquipment(equipment);

             //BATCH B GYNAECOLOGY

        Doctor doctorA = new Doctor();
        doctorA.setName("sunbo");
        doctorA.setIdNumber("28/24");
        doctorA.setAge(60);
        doctorA.setGender("Female");
        doctorA.setNationality("Nigerian");
        doctorA.setSpecialty("Gynaecologist");
        doctorA.setYearsOfExperience(14);
        doctorA.setDegree("Md");
        doctorA.setAvailable(true);


        Nurse nurseA =  new Nurse();
        nurseA.setName("khadijat");
        nurseA.setIdNumber("89/23");
        nurseA.setAge(45);
        nurseA.setSalary(200000);
        nurseA.setShiftDays("Null");
        nurseA.setQualification("RN");
        nurseA.setBodyType("curvy");

        Patient patientA = new Patient();
        patientA.setName("Philip");
        patientA.setBills(70000);
        patientA.setHasAppointment(true);
        patientA.setBloodGroup('O');
        patientA.setGenotype("AA");


        Equipment equipmentA = new Equipment();
        equipmentA.setName("vaginal speculum");
        equipmentA.setDepartment("Gynaecology");
        equipmentA.setModelID(12/111);
        equipmentA.setSize("Medium");

        Gynaecology gynaecology = new Gynaecology();
        gynaecology.setDoctor(doctor);
        gynaecology.setNurse(nurse);
        gynaecology.setPatient(patient);
        gynaecology.setEquipment(equipment);


       // BATCH C MEDICINE

        Doctor doctorB = new Doctor();
        doctorB.setName("Kiki");
        doctorB.setIdNumber("28/24");
        doctorB.setAge(34);
        doctorB.setGender("Female");
        doctorB.setNationality("Gambian");
        doctorB.setSpecialty("surgeon");
        doctorB.setYearsOfExperience(15);
        doctorB.setDegree("Md");
        doctorB.setAvailable(false);


        Nurse nurseB =  new Nurse();
        nurseB.setName("Temitope");
        nurseB.setIdNumber("89/23");
        nurseB.setAge(56);
        nurseB.setSalary(100_00_00);
        nurseB.setShiftDays("Null");
        nurseB.setQualification("RN");
        nurseB.setBodyType("curvy");

        Patient patientB = new Patient();
        patientB.setName("Philip");
        patientB.setBills(70000);
        patientB.setHasAppointment(true);
        patientB.setBloodGroup('O');
        patientB.setGenotype("AA");


        Equipment equipmentB = new Equipment();
        equipmentB.setName("needle");
        equipmentB.setDepartment("HospitalSystem.Medicine/Surgeon");
        equipmentB.setModelID(11/10);
        equipmentB.setSize("Medium");

        Medicine medicine = new Medicine();
        medicine.setDoctor(doctor);
        medicine.setNurse(nurse);
        medicine.setPatient(patient);
        medicine.setEquipment(equipment);

        Department department = new Department();
        department.setOptometry(optometry);
        department.setGynaecology(gynaecology);
        department.setMedicine(medicine);

        Hospital hospital = new Hospital();
        hospital.setDepartment(department);

        System.out.println(hospital);
    }

}