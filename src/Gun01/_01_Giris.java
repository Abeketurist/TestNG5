package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {
//    public static void main(String[] args) {
//        webSitesiniAc();
//        LoginIsleminiYap();
//        driveriKapat();
//    }

//    @Test JUnit
//    public void Test1(){
//        webSitesiniAc();
//        LoginIsleminiYap();
//        driveriKapat();
//    }

    // Eğer herhangi bir sıralama verilmezse metod isimlerinin alfabetik çalışıyor

    @Test(priority = 1)// default 0 ; gibi dusunebiliriz
    public void Websitesiniac() {
        System.out.println(" driver tanimlandi ve web sitesi acildi");
    }
    @Test(priority = 2)
    public void Loginisleminiyap() {
        System.out.println("Login islemi yapildi");
    }
    @Test(priority = 3)
    public void driverikapat() {
        System.out.println("driver kapandi");

    }


}
