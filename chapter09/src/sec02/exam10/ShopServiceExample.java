package sec02.exam10;

public class ShopServiceExample {
	ShopService obj1 = ShopService.getInstance();
	ShopService obj2 = ShopService.getInstance();
	
	if (obj1 == obj2) {
		System.out.println("같은 ShopService 객체 입니다.");
	} else {
		System.out.println("다른 ShopService 객체 입니다.");
	}
}
}
