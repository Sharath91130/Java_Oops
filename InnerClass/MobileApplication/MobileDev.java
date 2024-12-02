package InnerClass.MobileApplication;

public class MobileDev {
    public static void main(String[] args) {
        MobileApp mobileApp=new MobileApp();
        MobileApp.OsOpeation ms=mobileApp.new OsOpeation();
        ms.osname="Android";
        ms.processor="intel";
            Charger c = new Charger();
            EarPods earPod=new EarPods();
            mobileApp.brand="Apple";
            mobileApp.color="black";
            earPod.brand="redmi";
            earPod.display();

        }
    }

