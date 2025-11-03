package _30_Singleton;

// AppConfig 클래스에 싱글톤패턴을 적용해 주세요!
// 하나의 객체를 사용 -> 공유한다.
public class AppConfig {


    private String apiKey;
    private String appMode;

    private static AppConfig instance;

    // 상수
    public static final String DEV_MODE = "DEV_MODE";
    public static final String PRODUCTION_MODE = "PRODUCTION_MODE";

    // 생성자 외부 호출금지(private)
    private AppConfig() {
        this.apiKey = "MY_API_KEY";
        this.appMode = DEV_MODE;
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig(); // private라도, 내부호출이니 상관x
        }
        return instance;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "apiKey='" + apiKey + '\'' +
                ", appMode='" + appMode + '\'' +
                '}';
    }

    public void setAppMode(String appMode) {
        this.appMode = appMode;
    }
}
