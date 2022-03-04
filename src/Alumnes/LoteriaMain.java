package Alumnes;

import java.util.Scanner;

public class LoteriaMain {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		Loteria k=new Loteria();

		k.setNumLot(sc.nextInt()); int i=0;

		String[] arr=new String[k.getNumLot()];

		while (i<k.getNumLot()) {

			arr[i]=sc.next();
			i++;
		}
		Loteria p=new Loteria();
		
		p.setNumSel(sc.nextInt());

		for(i=0;i<k.getNumLot();i++) {
			if(p.getNumSel()!=i) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

}
