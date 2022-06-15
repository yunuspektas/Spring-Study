package main;

import service.MailService;
import service.MessageService;

public class MyApplication {

	public static void main(String[] args) {
		
		// Interface kullandığımız için yeni bir mesaj servise geçiş yapmak çok kolaylaştı
		// Fakat hala hedef servisi kullanmak için concreate sınıf ismini değiştirmek gerekiyor
		//aşağıdaki kod örneğinde eger yeni bir servicxe kullanmak istersek SMSService sınıfını değiştirmek gerekecek
		// Hala hard coded kısımlar var, Eğer bir config dosyası olsaydı kolayca değişiklik yapılabilirdi
		MessageService theService = new MailService();
		System.out.println(theService.sendMessage());
		
		
	}

}
