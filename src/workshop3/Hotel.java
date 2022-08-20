package workshop3;

import java.util.ArrayList;

import java.util.Scanner;

public class Hotel {
	private String name;
	private int rates;
	private String date;
	private int weekendRate;
	private int weekdayRate;
	ArrayList<Hotel> al = new ArrayList<Hotel>();
	Scanner sc = new Scanner(System.in);
	
	
	public Hotel() {
		
	}
	/**
	 * Constructor for storing the hotel name and rates
	 * @param name
	 * @param rates
	 */
	public Hotel(String name, int rate, String date, int weekend, int weekday) {
		this.name=name;
		this.rates=rate;
		this.date=date;
		this.weekendRate=weekend;
		this.weekdayRate=weekday;
		
	}
	/**
	 * Method to initialize hotel
	 */
	public void initialize() {
		Hotel h = new Hotel("A",250,"20aug2022",350,355);
		Hotel h1 = new Hotel("b",255,"27aug2022",360,366);
		Hotel h2 = new Hotel("c",256,"28aug2022",370,377);
		Hotel h3 = new Hotel("d",257,"29aug2022",380,388);
		Hotel h4 = new Hotel("e",258,"21aug2022",390,399);
		Hotel h5 = new Hotel("f",249,"22aug2022",400,410);
		al.add(h);
		al.add(h1);
		al.add(h2);
		al.add(h3);
		al.add(h4);
		al.add(h5);
		findHotel();
	}
	/**
	 * Method to find the cheapest hotel
	 */
	public void findHotel() {
		int d1=0,d2=0;
		int count=0;
		String nam = "";
		System.out.println("Enter the date range to find the cheapest hotel");
		date =  sc.next();
		String[] temp = date.split(",");
		for(String s :temp) {
		String[] s1 = s.split("");
		String day1 = s1[0]+s1[1];
		 d1 = Integer.parseInt(day1);
		break;
		}
		for(String s :temp) {
			
			if(count==0) {
				count+=1;
				continue;
			}
			String[] s1 = s.split("");
			String day2 = s1[0]+s1[1];
			d2 = Integer.parseInt(day2);
			break;
			}
		int temp1 = al.get(0).rates;
		nam=al.get(0).name;
		for(Hotel t : al) {
			if(d1<d2) {
				if(t.rates<temp1) {
					temp1=t.rates;
					 nam = t.name;
				}
			}
			
		}
		System.out.println("Cheapest hotel is "+nam+ " with RS "+temp1);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}
	
	
}
