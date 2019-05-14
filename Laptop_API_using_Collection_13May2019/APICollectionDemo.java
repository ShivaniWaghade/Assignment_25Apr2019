import java.util.ArrayList;
class Laptop{
	private Integer ramSize, hddSize, id;
	private String brand;

	Laptop(int id, int ramSize, int hddSize, String brand ){
		this.id = id;
		this.ramSize = ramSize;
		this.hddSize = hddSize;
		this.brand = brand;
	}

	//Creating the getters
	public Integer getId(){
		return this.id;
	}
	public Integer getRamSize(){
		return this.ramSize;
	}

	public Integer getHddSize(){
		return this.hddSize;
	}

	public String getBrand(){
		return this.brand;
	}

	public void setId(int id)
	{
		this.id=id;
	}
	public void setRamSize(int ramSize)
	{
		this.ramSize = ramSize;
	}
	public void setHddSize(int hddSize)
	{
		this.hddSize=hddSize;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
}

class APICollectionDemo
{
	static ArrayList list;
	public static void main(String[] args) 
	{
		APICollectionDemo acd = new APICollectionDemo();

		acd.list = new ArrayList();

		Laptop l = new Laptop(4,8, 600, "Lenovo");

		//Store a Laptop object in the list
		list.add(new Laptop(1,4, 500, "IBM"));
		list.add(new Laptop(2,8, 800, "IBM"));
		list.add(new Laptop(3,6, 500, "Sony"));

		list.add(l);

//Get all the details of a particular laptop
// System.out.println("Second Laptop Details : ");
// System.out.println("ID: "+((Laptop)list.get(1)).getId());
// System.out.println("Ram : " + ((Laptop)list.get(1)).getRamSize());
// System.out.println("HDD Size : " + ((Laptop)list.get(1)).getHddSize());
// System.out.println("Brand : " + ((Laptop)list.get(1)).getBrand());
		int flag=0;
		do{
		System.out.println("Select from the following options:\n 1.Add item\n2.Delete item\n3.Search item\n 4.Update item \n5.View All\n6.Exit");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		switch (n) 
		{
			case 1: 
			acd.addItem();
			break;	
			case 2:
			acd.delItem();
			break;
			case 3:
			acd.searchItem();
			break;
			case 4:
			acd.updateItem();
			break;
			case 5:
			acd.viewAll();
			break;
			case 6:flag=1;
			break;
			default:
			System.out.println("Invalid input");
		}
		}while(flag==0);



	}

	void addItem()
	{
		// ArrayList list = new ArrayList();
		APICollectionDemo acd = new APICollectionDemo();
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter ID");
		int id = s.nextInt();
		System.out.println("Enter Ram");
		int ram = s.nextInt();
		System.out.println("Enter HDD size");
		int hddSize = s.nextInt();
		s.nextLine();
		System.out.println("Enter Brand");
		String brand = s.nextLine();
		list.add(new Laptop(id,ram, hddSize, brand));
	}

	void delItem()
	{
		// ArrayList list = new ArrayList();
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter ID");
		int id = s.nextInt();
		for (Object ref: list) {
		if(((Laptop)ref).getId()== id)
		{
			list.remove(id);
			break;
		}
		
	}
	}

	void viewAll()
	{
		for (Object ob:list) {
		
		System.out.println("Laptop Details for id : "+ ((Laptop)ob).getId());
		System.out.println("ID: "+(((Laptop)ob).getId()));
		System.out.println("Ram : " + ((Laptop)ob).getRamSize());
		System.out.println("HDD Size : " + ((Laptop)ob).getHddSize());
		System.out.println("Brand : " + ((Laptop)ob).getBrand());
		}
	}
	void searchItem()
	{
		System.out.println("Enter by what you want to search: 1.ID\n 2.Brand\n 3.Ram\n 4.Hdd Size");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		int flag=0;
		switch(n){
			case 1:
			System.out.println("Enter Id");
			int id = sc.nextInt();
			sc.nextLine();
			for (Object ob: list) {
			if(((Laptop)ob).getId().equals(id))
			{
			System.out.println("Laptop found:");
			System.out.println("ID: "+(((Laptop)ob).getId()));
			System.out.println("Ram : " + ((Laptop)ob).getRamSize());
			System.out.println("HDD Size : " + ((Laptop)ob).getHddSize());
			System.out.println("Brand : " + ((Laptop)ob).getBrand());
			flag=1;
			}
			}
			if (flag!=1) 
			{
				System.out.println("Not Found");
			}
			break;

			case 2:
			System.out.println("Enter brand: ");
			String brand = sc.nextLine();
			for (Object ob: list) {
			if(((Laptop)ob).getBrand().equals(brand))
			{
			System.out.println("Laptop found:");
			System.out.println("ID: "+(((Laptop)ob).getId()));
			System.out.println("Ram : " + ((Laptop)ob).getRamSize());
			System.out.println("HDD Size : " + ((Laptop)ob).getHddSize());
			System.out.println("Brand : " + ((Laptop)ob).getBrand());
			flag=1;
			}
			}
			if (flag!=1) 
			{
				System.out.println("Not found");
			}
			break;

			case 3:
			System.out.println("Enter ram");
			int ram = sc.nextInt();
			for (Object ob: list) {
			if(((Laptop)ob).getRamSize().equals(ram))
			{
			System.out.println("Laptop found:");
			System.out.println("ID: "+(((Laptop)ob).getId()));
			System.out.println("Ram : " + ((Laptop)ob).getRamSize());
			System.out.println("HDD Size : " + ((Laptop)ob).getHddSize());
			System.out.println("Brand : " + ((Laptop)ob).getBrand());
			flag=1;
			}
			}
			if (flag!=1) 
			{
				System.out.println("Not found");
			}
			break;
			case 4:
			System.out.println("Enter HDD size");
			int hdd = sc.nextInt();
			for (Object ob: list) {
			if(((Laptop)ob).getHddSize().equals(hdd))
			{
			System.out.println("Laptop found:");
			System.out.println("ID: "+(((Laptop)ob).getId()));
			System.out.println("Ram : " + ((Laptop)ob).getRamSize());
			System.out.println("HDD Size : " + ((Laptop)ob).getHddSize());
			System.out.println("Brand : " + ((Laptop)ob).getBrand());
			flag=1;
			}
			}
			if (flag!=1) 
			{
				System.out.println("Not found");
			}
			break;
			default:
			System.out.println("Invalid Input");
		}

		}
		void updateItem()
		{
			System.out.println("Enter ID");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int id = sc.nextInt();
			System.out.println("Enter what you want to update: 1.Ram\n 2.HddSize\n 3.Brand");
			int n = sc.nextInt();
			sc.nextLine();
			switch(n)
			{
				case 1:
				System.out.println("Enter Ram size:");
				int ram = sc.nextInt();
				for (Object ob :list ) 
				{
					if(((Laptop)ob).getId().equals(id)){
						((Laptop)ob).setRamSize(ram);
					}
				}
				break;
				case 2:
				System.out.println("Enter HddSize:");
				int hdd = sc.nextInt();
				for (Object ob :list ) 
				{
					if(((Laptop)ob).getId().equals(id)){
					((Laptop)ob).setHddSize(hdd);
				}
				}
				break;
				case 3:
				System.out.println("Enter Brand:");
				String brand = sc.nextLine();
				for (Object ob :list ) 
				{
					if(((Laptop)ob).getId().equals(id)) {
					
					((Laptop)ob).setBrand(brand);
				}

				}
				break;

			}
		}
	}

// 1. Enter a new Laptop
// 2. View All Laptop Details
// 3. Search for a Laptop: By (Id, Brand, Ram Size, Hdd Size)
// 4. Delete a Laptop : By(ID)
// 5. Update Laptop Details : 