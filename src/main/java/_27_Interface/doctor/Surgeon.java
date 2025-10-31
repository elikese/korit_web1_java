package _27_Interface.doctor;

public class Surgeon implements DoctorLicense {
    // 외과의가 환자를 진단합니다: 홍길동
    // 외과의가 수술하고 약을 처방합니다: 항생제
    @Override
    public void diagnose(String patient) {
        System.out.println("외과의가 환자를 진단합니다: " + patient);
    }

    @Override
    public void prescribe(String medicine) {
        System.out.println("외과의가 수술하고 약을 처방합니다: " + medicine);
    }
}
