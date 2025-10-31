package _27_Interface.doctor;

public class Main {
    public static void main(String[] args) {
        // 아래 코드가 정상 작동할 수 있도록
        // DoctorLicense와 GeneralDoctor, Surgeon을 완성해 주세요
        DoctorLicense doc1 = new GeneralDoctor(); // 캐스팅
        DoctorLicense doc2 = new Surgeon(); // 캐스팅
        
        String patient = "홍길동";
        
        DoctorLicense[] doctors = {doc1, doc2};
        // 출력예시
        // 일반의가 환자를 진단합니다: 홍길동
        // 일반의가 약을 처방합니다: 감기약
        // 외과의가 환자를 진단합니다: 홍길동
        // 외과의가 수술하고 약을 처방합니다: 항생제
        // 다형성: 같은 코드인데, 같은 타입인데, 객체가 다르게 행동한다.
        // -> for문 수정을 안해도 된다!
        String[] medicines = {"감기약", "항생제"};
        int i = 0;

        for (DoctorLicense doc : doctors) {
            doc.diagnose(patient);
            doc.prescribe(medicines[i]);
            i++;
        }
        
    }
}
