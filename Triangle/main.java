import java.util.Scanner;
public class main {
	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Set sides");
		System.out.println(" ");
		for(int i = 1; i > 0; i++) {
			System.out.println("A is ");
			int x = sc.nextInt();
			
			System.out.println("B is ");
			int y = sc.nextInt();
			
			System.out.println("C is ");
			int z = sc.nextInt();
				if(x > 0) {
					if(y > 0) {
						if(z > 0) {
							Trojuhelnik tr1 = new Trojuhelnik(x, y, z);
							
							System.out.println(tr1);
							break;
							
						} else {
							assert z < 0 : " Something went wrong";
							
							System.out.println("a is not correct");
						}
					} else {
						assert y < 0 : " Something went wrong";
						
						System.out.println("b is not correct");
					}
				} else {
					assert x < 0 : " Something went wrong";
					
					System.out.println("c is not correct");
				}
		}
		
		
	
			
		}

	}